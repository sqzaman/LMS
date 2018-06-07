package mpp.lab.lms.model;

public class Author {
	
	String credentials;
	String bio;
	Person person;
	
	public Author(String credentials, String bio, Person person) {
		this.credentials = credentials;
		this.bio = bio;
		this.person = person;
	}

	public String getCredentials() {
		return credentials;
	}

	public String getBio() {
		return bio;
	}

	public Person getPerson() {
		return person;
	}
	
	
	
}
