package mpp.lab.lms.model;

public class Person {
	String firstName;
	String lastName;
	String street;
	String city;
	String state;
	String phoneNumber;
	
	public Person(String firstName, String lastName, String street, String city, String state, String phoneNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	

}
