package Main;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		 BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
	        customerManager.save(new Customer(1, "Oðuzhan", "TURAN", "1999", "12345678958"));
	}

}
