package mpp.lab.lms.model;

import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecord> checkoutRecord;
	private	List<Member> member;	
	
	public CheckoutRecord(List<CheckoutRecord> checkoutRecord, List<Member> member) {
		this.checkoutRecord = checkoutRecord;
		this.member = member;
	}
	
	public List<CheckoutRecord> getCheckoutRecord() {
		return checkoutRecord;
	}
	public List<Member> getMember() {
		return member;
	}
	
}
