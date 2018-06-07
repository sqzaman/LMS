package mpp.lab.lms.persistence;

import java.util.List;

import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.Member;
import mpp.lab.lms.model.Staff;

public interface PersistenceService {
	void persistObject(Object o);
	List<Book> getBooks();
	void setBooks(List<Book> books);
	List<Member> getMembers();
	void setMembers(List<Member> members);
	Object getObject(Object o);
	Staff getStaff(String username);
	
	void addBook(Book b);
}
