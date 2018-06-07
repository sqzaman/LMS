package mpp.lab.lms.service.impl;

import mpp.lab.lms.model.Book;
import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.service.BookService;
import mpp.lab.lms.service.factory.ServiceFactory;

public class BookServiceImpl implements BookService {

	PersistenceService ps = ServiceFactory.getPersistenceService();
	@Override
	public Book addBook(Book b) {
		ps.addBook(b);
		return null;
	}

}
