package mpp.lab.lms.model;

import java.util.Date;

public class CheckoutEntry {
	private BookCopy book;
	private Date checkoutDate;
	private Date dueDate;
	
	public CheckoutEntry(BookCopy book, Date checkoutDate, Date dueDate) {
		this.book = book;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}

	public BookCopy getBook() {
		return book;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public Date getDueDate() {
		return dueDate;
	}
	
}
