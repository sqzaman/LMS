package mpp.lab.lms;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import mpp.lab.lms.model.Author;
import mpp.lab.lms.model.Person;
import mpp.lab.lms.service.BookService;
import mpp.lab.lms.service.factory.ServiceFactory;
import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.BookCopy;
import mpp.lab.lms.model.CheckoutEntry;
import mpp.lab.lms.model.CheckoutRecord;
import mpp.lab.lms.model.Member;

public class Main {

	public static void main(String[] args) throws ParseException {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateString1 = "2014-02-11";
		Date date1 = sdf.parse(dateString1);
		String dateString2 = "2014-02-18";
		Date date2 = sdf.parse(dateString2);
		
		
		// TODO Auto-generated method stub
		BookService bookService = ServiceFactory.getBookService();
		
		// create book and new book and copy of book;
		Person person1 = new Person("Syed", "Quamruzzaman", "2000 N Court Street 20A", "Fairfield", "Iowa", "123-224-2232");
		Person person2 = new Person("Silas", "Silasinka", "1000 N Court Street 80A", "Chicago", "Illinois", "999-224-2232");
		
		Author author1 = new Author("Dr.", "Prominent Writer", person1);
		List<Author> authorList1 = new ArrayList<>();
		authorList1.add(author1);
		
		Book book1 = new Book("123", "Core Java 1", 7, authorList1);
		Book book2 = new Book("436", "Core C# 1", 15, authorList1);
		
		bookService.addBook(book1);
		bookService.addBook(book2);
		
		BookCopy bookCopy1 = new BookCopy(book1, 10, true);
		BookCopy bookCopy2 = new BookCopy(book2, 20, true);
		
		Member member1 = new Member(001, person2);
		
		CheckoutRecord record1 = new CheckoutRecord(member1);
		
		CheckoutEntry entry1 = new CheckoutEntry(record1, bookCopy1, date1, date2);
		
		record1.addCheckoutEntry(entry1);
		
		member1.addCheckoutRecord(record1);
		
		

	}

}
