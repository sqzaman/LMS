package mpp.lab.lms.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import mpp.lab.lms.exceptions.CheckoutException;
import mpp.lab.lms.model.Book;
import mpp.lab.lms.model.BookCopy;
import mpp.lab.lms.model.CheckoutEntry;
import mpp.lab.lms.model.CheckoutRecord;
import mpp.lab.lms.model.Member;
import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.service.BookService;
import mpp.lab.lms.service.CheckoutService;
import mpp.lab.lms.service.MemberService;
import mpp.lab.lms.service.factory.ServiceFactory;

public class CheckoutServiceImpl implements CheckoutService {
	MemberService ms = ServiceFactory.getMemberService();
	BookService bs = ServiceFactory.getBookService();
	PersistenceService ps = ServiceFactory.getPersistenceService();
	
	@Override
	public void checkout(int memberId, List<String> isbn) throws CheckoutException {
		System.out.println("---------------------------------------------------");
		System.out.print("Checking out - ");
		
		Member member = ms.getMemberByID(memberId);
		
		if (member == null) {
			throw new CheckoutException("Member not found with id - " + memberId);
		}
		
		System.out.println(member.getPerson().getFirstName() + ": ");
		System.out.println("Books: ");
		
		CheckoutRecord record = new CheckoutRecord(member);
		
		for (String i: isbn) {
			record.addCheckoutEntry(this.addCheckoutEntry(i, record));
		}
		
		addCheckoutRecord(member, record);
	}
	
	//create checkoutEntry
	private CheckoutEntry addCheckoutEntry(String isbn, CheckoutRecord record) throws CheckoutException {
		Book book;
		BookCopy copy;
		Date checkoutDate;
		Date dueDate;
		
		try {
			book = bs.getBookByISBN(isbn);
			System.out.print(book.getTitle() + ", ");
		} catch(Exception e) {
			throw new CheckoutException("Can not find a book by ISBN - " + isbn);
		}
		
		try {
			copy = (BookCopy) ((LinkedList) book.getCopies()).getFirst();
		} catch(NoSuchElementException e) {
			throw new CheckoutException("No copies of the book available - " + book.getTitle());
		}
		
		checkoutDate = new Date();
		dueDate = getDueDate( book.getBorrowableDays() );
		copy.setAvailable(false);
		
		return new CheckoutEntry( record, copy, checkoutDate, dueDate );
	}
	
	//add record to member and persist the object
	private void addCheckoutRecord(Member member, CheckoutRecord record) {
		member.addCheckoutRecord(record);
		HashMap<Integer, Member> members = (HashMap) ps.getMembers();
		members.put(member.getId(), member);
		ps.setMembers(members);
		System.out.println("\nCheckout successful! ");
//		ps.persistObject(record);
//		ps.persistObject(member);
	}
	
	//add days to current date
	private Date getDueDate(int days) {
		Date date = new Date();
		 
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); // add days
		
		return cal.getTime();
	}
	
}
