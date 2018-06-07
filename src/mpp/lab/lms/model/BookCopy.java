package mpp.lab.lms.model;

public class BookCopy {
	private Book book;
	private long number;
	private boolean isAvailable;
	
	public BookCopy(Book book, long number, boolean isAvailable) {
		this.book = book;
		this.number = number;
		this.isAvailable = isAvailable;
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
	
	
}
