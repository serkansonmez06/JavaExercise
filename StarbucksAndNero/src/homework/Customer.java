package homework;

import java.time.LocalDate;

public class Customer implements IEntity{
	
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String natiolnalityId;
	

	public Customer () {
    	
    }

	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String natiolnalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.natiolnalityId = natiolnalityId;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNatiolnalityId() {
		return natiolnalityId;
	}


	public void setNatiolnalityId(String natiolnalityId) {
		this.natiolnalityId = natiolnalityId;
	}
	
   
	

}
