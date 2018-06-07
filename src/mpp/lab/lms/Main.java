package mpp.lab.lms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mpp.lab.lms.model.Author;
import mpp.lab.lms.model.Person;
import mpp.lab.lms.service.BookService;
import mpp.lab.lms.service.factory.ServiceFactory;
import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.BookCopy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bookService = ServiceFactory.getBookService();
		
		// create book and new book and copy of book;
		Person person1 = new Person("Syed", "Quamruzzaman", "2000 N Court Street 20A", "Fairfield", "Iowa", "123-224-2232");
		Author author1 = new Author("Dr.", "Prominent Writer", person1);
		List<Author> authorList1 = new ArrayList<>();
		authorList1.add(author1);
		Book book1 = new Book("123", "Core Java 1", 7, authorList1);
		Book book2 = new Book("436", "Core C# 1", 15, authorList1);
		
		bookService.addBook(book1);
		bookService.addBook(book2);
		
		BookCopy bookCopy1 = new BookCopy(book1, 10, true);
		BookCopy bookCopy2 = new BookCopy(book2, 20, true);
		
		
		

	}

}
