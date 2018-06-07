package mpp.lab.lms.model;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutEntry> checkoutEntries;
	private	Member member;	
	
	public CheckoutRecord(Member member) {
		this.member = member;
		checkoutEntries = new ArrayList<CheckoutEntry>();
	}
	
	@Override
	public String toString() {
		return "CheckoutRecord [checkoutEntries=" + checkoutEntries + ", member=" + member + "]";
	}

	public List<CheckoutEntry> getCheckoutRecord() {
		return checkoutEntries;
	}
	
	public void setCheckoutRecord(List<CheckoutEntry> checkoutEntries) {
		this.checkoutEntries = checkoutEntries;
	}
	
	public void addCheckoutEntry(CheckoutEntry entry) {
		checkoutEntries.add(entry);
	}
	
	public Member getMember() {
		return member;
	}
	
}
