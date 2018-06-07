package mpp.lab.lms.persistence;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.Member;
import mpp.lab.lms.model.Staff;

public class PersistenceServiceImpl implements PersistenceService {
	private List<Book> books;
	private List<Member> members;
	private List<Staff> staffList;
	
	private Map<String, Book> booksMap;
	
	

	public PersistenceServiceImpl() {
		booksMap = new HashMap<>();
	}


	@Override
	public void persistObject(Object o) {
		System.out.println("Saving - " + o.toString());
	}


	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	@Override
	public Object getObject(Object o) {
		System.out.println("retrieving data from persistence layer");
		return o;
	}


	@Override
	public void addBook(Book b) {
		// TODO Auto-generated method stub		
		booksMap.put(b.getIsbn(), b);
		
	}
	
	public Staff getStaff(String username) {
		for(Staff s : staffList) {
			if (s.getUsername().equals(username)) {
				return s;
			}	
		}		
		return null;
	}
}
