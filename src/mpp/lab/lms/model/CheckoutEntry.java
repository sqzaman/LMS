package mpp.lab.lms.model;

import java.util.Date;

public class CheckoutEntry {
	private BookCopy bookCopy;
	private Date checkoutDate;
	private Date dueDate;
	private CheckoutRecord checkoutRecord;
	
	public CheckoutEntry(CheckoutRecord checkoutRecord, BookCopy book, Date checkoutDate, Date dueDate) {
		this.bookCopy = book;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.checkoutRecord = checkoutRecord;
	}

	public BookCopy getBook() {
		return bookCopy;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public Date getDueDate() {
		return dueDate;
	}
	
	public CheckoutRecord getCheckoutRecord() {
		return this.checkoutRecord;
	}
	
	public String toString() {
		return "Book Number: "+bookCopy.getNumber()+", Checkout: "+checkoutDate.toString()+", Due: "+ dueDate.toString(); 
	}
	
}
