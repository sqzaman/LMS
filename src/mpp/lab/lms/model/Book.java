package mpp.lab.lms.model;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	String isbn;
	String title;
	int borrowableDays;
	List<Author> authors;
	
	public Book(String isbn, String title, int borrowableDays, List<Author> authors) {
		this.isbn = isbn;
		this.title = title;
		this.borrowableDays = borrowableDays;
		this.authors = authors;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public int getBorrowableDays() {
		return borrowableDays;
	}

	public List<Author> getAuthors() {
		return authors;
	}
	
	
	

}
