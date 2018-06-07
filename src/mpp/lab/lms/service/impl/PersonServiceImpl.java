package mpp.lab.lms.service.impl;

import mpp.lab.lms.model.Person;
import mpp.lab.lms.service.PersonService;

public class PersonServiceImpl implements PersonService {
	public Person createPerson(String firstName, String lastName, String street, String city, String state, String phoneNumber) {
		return new Person(firstName, lastName, street, city, state, phoneNumber);
	}
}
