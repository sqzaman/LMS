package mpp.lab.lms.persistence;


import java.util.HashMap;
import java.util.Map;

import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.Member;
import mpp.lab.lms.model.Staff;

public class PersistenceServiceImpl implements PersistenceService {	
	private Map<String, Book> books;
	private Map<Integer, Member> members;
	private Map<String, Staff> staffMap;
	
	public PersistenceServiceImpl() {
		members= new HashMap<>();
		books = new HashMap<>();
		staffMap =  new HashMap<>();
	}

	public Map<String, Book> getBooks() {
		return books;
	}

	public void setBooks(Map<String, Book> books) {
		this.books = books;
	}

	public Map<Integer, Member> getMembers() {
		return members;
	}

	public void setMembers(Map<Integer, Member> members) {
		this.members = members;
	}

	@Override
	public void persistObject(Object o) {
		System.out.println("Saving - " + o.toString());
	}

	@Override
	public Object getObject(Object o) {
		System.out.println("retrieving data from persistence layer");
		return o;
	}
	
	@Override
	public void addBook(Book b) {	
		books.put(b.getIsbn(), b);
		
	}

	@Override
	public void addMember(Member m) {
		members.put(m.getId(), m);
		
	}
	
	@Override
	public void addStaff(Staff f) {
		staffMap.put(f.getUsername(), f);		
	}
	
	public Staff getStaff(String username) {			
		return staffMap.get(username);
	}
}
