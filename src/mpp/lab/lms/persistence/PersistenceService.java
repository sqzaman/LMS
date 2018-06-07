package mpp.lab.lms.persistence;

import java.util.Map;

import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.Member;
import mpp.lab.lms.model.Staff;

public interface PersistenceService {
	void persistObject(Object o);
	Map<String, Book> getBooks();
	void setBooks(Map<String, Book> books);
	Map<Integer, Member> getMembers();
	void setMembers(Map<Integer, Member> members);
	Object getObject(Object o);
	Staff getStaff(String username);
	void addStaff(Staff f);
	
	void addBook(Book b);
	void addMember(Member m);
}
