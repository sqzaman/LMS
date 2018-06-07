package mpp.lab.lms.model;

import java.util.List;

public class Member {
	private int id;
	private Person person;
	private List<CheckoutRecord> checkoutRecord;
	
	public Member(int id, Person person, List<CheckoutRecord> checkoutRecord) {
		this.id = id;
		this.person = person;
		this.checkoutRecord = checkoutRecord;
	}
	
	public int getId() {
		return id;
	}
	public Person getPerson() {
		return person;
	}
	public List<CheckoutRecord> getCheckoutRecord() {
		return checkoutRecord;
	}
	
}
