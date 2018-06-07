package mpp.lab.lms.persistence;

import java.util.List;

import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.Member;

public interface PersistenceService {
	void persistObject(Object o);
	List<Book> getBooks();
	void setBooks(List<Book> books);
	List<Member> getMembers();
	void setMembers(List<Member> members);
	Object getObject(Object o);
}
