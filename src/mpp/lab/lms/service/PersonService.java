package mpp.lab.lms.service;

import mpp.lab.lms.model.Person;

public interface PersonService {
	Person createPerson(String firstName, String lastName, String street, String city, String state, String phoneNumber);
}
