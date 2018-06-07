package mpp.lab.lms.model;

import java.util.LinkedList;
import java.util.List;

public class BookCopy {
	private Book book;
	private long number;
	private boolean isAvailable;
	private List<CheckoutEntry> checkoutEntries;
	
	public BookCopy(Book book, long number, boolean isAvailable) {
		this.book = book;
		this.number = number;
		this.isAvailable = isAvailable;
		this.checkoutEntries = new LinkedList<>();
	}

	public Book getBook() {
		return book;
	}

	public long getNumber() {
		return number;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public void addCheckoutEntry(CheckoutEntry checkoutEntry) {
		this.checkoutEntries.add(checkoutEntry);
	}
	
	public List<CheckoutEntry> getCheckoutEntries() {
		return this.checkoutEntries;
	}
}
