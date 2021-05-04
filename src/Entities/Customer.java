package Entities;

public class Customer {
	private int id;
    private String firsName;
    private String lastName;
    private String dateOfBirth;
    private String nationalityId;
    public Customer(int id, String firsName, String lastName, String dateOfBirth, String nationalityId) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }
    public int getid() {
        return id;
    }
    public void setId(int id) {
        this.id= id;
    }
    public String getFirsName() {
        return firsName;
    }
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getNationalityId() {
        return nationalityId;
    }
    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

}
