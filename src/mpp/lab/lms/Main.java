package mpp.lab.lms;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mpp.lab.lms.model.Author;
import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.BookCopy;
import mpp.lab.lms.model.CheckoutEntry;
import mpp.lab.lms.model.CheckoutRecord;
import mpp.lab.lms.model.Member;
import mpp.lab.lms.model.Person;
import mpp.lab.lms.model.Role;
import mpp.lab.lms.model.Staff;
import mpp.lab.lms.service.BookService;
import mpp.lab.lms.service.LoginService;
import mpp.lab.lms.service.StaffService;
import mpp.lab.lms.service.MemberService;
import mpp.lab.lms.service.factory.ServiceFactory;
import mpp.lab.lms.util.AuthorizationRole;

public class Main {

	public static void main(String[] args) throws ParseException {
		LoginService loginService = ServiceFactory.getLoginService(); 
		StaffService staffService = ServiceFactory.getStaffService(); 
		
		
		
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateString1 = "2014-02-11";
		Date date1 = sdf.parse(dateString1);
		String dateString2 = "2014-02-18";
		Date date2 = sdf.parse(dateString2);
		
		// Role
		Role admin = new Role(AuthorizationRole.Administrator, "administrator");
		Role librarian = new Role(AuthorizationRole.Librarian, "administrator");	
		
		
		// Staff		
		Staff staff1 = new Staff("username1", "password1", admin);
		Staff staff2 = new Staff("username2", "password2", librarian);
		
		staffService.addNewStaff(staff1);
		staffService.addNewStaff(staff2);
		
		//Staff staffLogedIn = loginService.login("username1", "password1");
		Staff staffLogedIn = loginService.login("username2", "password2");
		
		if(staffLogedIn == null) {
			System.out.println("User name or password invalid");
			return;
		}
		
		//Staff  librarian1 = new Staff();
		
		Person person1 = null;
		Person person2 = null;
		BookCopy bookCopy1 = null;
		BookCopy bookCopy2 = null;
		if(staffService.checkStaffHasPermission(staffLogedIn)) {

			BookService bookService = ServiceFactory.getBookService();
			
			// create book and new book and copy of book;
			person1 = new Person("Syed", "Quamruzzaman", "2000 N Court Street 20A", "Fairfield", "Iowa", "123-224-2232");
			person2 = new Person("Silas", "Silasinka", "1000 N Court Street 80A", "Chicago", "Illinois", "999-224-2232");
			
			Author author1 = new Author("Dr.", "Prominent Writer", person1);
			Author author2 = new Author("Dr.", "Prominent Writer", person2);
			List<Author> authorList1 = new ArrayList<>();
			authorList1.add(author1);
			authorList1.add(author2);
			
			Book book1 = new Book("123", "Core Java 1", 7, authorList1);
			Book book2 = new Book("436", "Core C# 1", 15, authorList1);
			
		
			
			bookService.addBook(book1);
			bookService.addBook(book2);
			
			bookCopy1 = new BookCopy(book1, 10, true);
			bookCopy2 = new BookCopy(book2, 20, true);
		} else {
			System.out.println("Only Librarian can add book and book copy!");
			return;
		}
		
		
		
		
		
		Member member1 = new Member(001, person2);
		
		CheckoutRecord record1 = new CheckoutRecord(member1);
		
		CheckoutEntry entry1 = new CheckoutEntry(record1, bookCopy1, date1, date2);
		
		record1.addCheckoutEntry(entry1);
		
		member1.addCheckoutRecord(record1);
		
		//2. Add a new library member to the system
		//testAddNewMember();
		
	}
	
	private static void testAddNewMember() {
		MemberService memberService = ServiceFactory.getMemberService();
		
		AuthorizationRole authorizationRole = AuthorizationRole.Administrator;
		
		Role adminRole = new Role(authorizationRole, "can do alot of stuff");
		
		Staff staff = new Staff("obama", "12345654", adminRole);
		
		memberService.addMember(12, staff, "Donald", "Trump", "1000 N Court Street 20A", "Washington DC", "Pensyl", "111-224-2232");
		
	}

}
