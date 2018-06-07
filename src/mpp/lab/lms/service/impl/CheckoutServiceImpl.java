package mpp.lab.lms.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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
	public void checkout(int memberId, List<String> isbn) {
		Member member = ms.getMemberByID(memberId);
		CheckoutRecord record = new CheckoutRecord(member);
		
		for (String i: isbn) {
			record.addCheckoutEntry(this.addCheckoutEntry(i, record));
		}
		
		addCheckoutRecord(member, record);
	}
	
	//create checkoutEntry
	private CheckoutEntry addCheckoutEntry(String isbn, CheckoutRecord record) {
		Book book = bs.getBookByISBN(isbn);
		BookCopy copy = (BookCopy) ((LinkedList) book.getCopies()).getFirst();
		Date checkoutDate = new Date();
		Date dueDate = getDueDate( book.getBorrowableDays() );
		
		copy.setAvailable(false);
		
		return new CheckoutEntry( record, copy, checkoutDate, dueDate );
	}
	
	//add record to member and persist the object
	private void addCheckoutRecord(Member member, CheckoutRecord record) {
		member.addCheckoutRecord(record);
		HashMap<Integer, Member> members = (HashMap) ps.getMembers();
		members.put(member.getId(), member);
		ps.setMembers(members);
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
