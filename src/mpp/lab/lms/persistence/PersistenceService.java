package mpp.lab.lms.persistence;

import java.util.Map;

import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.Member;

public interface PersistenceService {
	void persistObject(Object o);
	Map<String, Book> getBooks();
	void setBooks(Map<String, Book> books);
	Map<Integer, Member> getMembers();
	void setMembers(Map<Integer, Member> members);
	Object getObject(Object o);
	
	void addBook(Book b);
	void addMember(Member m);
}
