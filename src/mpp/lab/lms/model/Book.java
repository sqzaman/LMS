package mpp.lab.lms.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Book {
	
	String isbn;
	String title;
	int borrowableDays;
	List<Author> authors;
	List<BookCopy> copies;
	
	public Book(String isbn, String title, int borrowableDays, List<Author> authors) {
		this.isbn = isbn;
		this.title = title;
		this.borrowableDays = borrowableDays;
		this.authors = authors;
		this.copies = new LinkedList<>();
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
	
	public List<BookCopy> getCopies() {
		return copies;
	}
	
	public String toString() {
		String s = "Book: " + this.title + "\n";
		
		for (Author author: authors) {
			s += " [" + author.toString() + "]";
		}

		return s;
	}

}
