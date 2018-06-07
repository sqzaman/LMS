package mpp.lab.lms.persistence;

import java.util.List;

import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.Member;

public class PersistenceServiceImpl implements PersistenceService {
	private List<Book> books;
	private List<Member> members;

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
}
