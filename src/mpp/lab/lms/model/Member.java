package mpp.lab.lms.model;

import java.util.LinkedList;
import java.util.List;

public class Member {
	private int id;
	private Person person;
	private List<CheckoutRecord> checkoutRecords;
	
	public Member(int id, Person person) {
		this.id = id;
		this.person = person;
		checkoutRecords = new LinkedList<>();
	}
	
	public int getId() {
		return id;
	}
	public Person getPerson() {
		return person;
	}
	
	public List<CheckoutRecord> getCheckoutRecord() {
		return checkoutRecords;
	}
	
	public void addCheckoutRecord(CheckoutRecord record) {
		checkoutRecords.add(record);
	}
	
}
