package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;




public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean deger=false;
		
		KPSPublicSoapProxy soap= new KPSPublicSoapProxy();
		
		try {
			deger = soap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirsName() ,customer.getLastName(),Integer.parseInt( customer.getDateOfBirth()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return deger;

	}
}
