package mpp.lab.lms.service.factory;

import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.persistence.PersistenceServiceImpl;
import mpp.lab.lms.service.BookService;
import mpp.lab.lms.service.MemberService;
import mpp.lab.lms.service.PersonService;
import mpp.lab.lms.service.StaffService;
import mpp.lab.lms.service.impl.BookServiceImpl;
import mpp.lab.lms.service.impl.MemberServiceImpl;
import mpp.lab.lms.service.impl.PersonServiceImpl;
import mpp.lab.lms.service.impl.StaffServiceImpl;

public class ServiceFactory {
	private volatile static PersistenceService persistenceService;
	private volatile static BookService bookService;
	private volatile static MemberService memberService;
	private volatile static StaffService staffService;
	private volatile static PersonService personService;

	
	public static PersistenceService getPersistenceService() {
		if(null == persistenceService) {
			synchronized(PersistenceService.class) {
				if(null == persistenceService) {
					persistenceService = new PersistenceServiceImpl();
				}
			}
		}
		return persistenceService;
	}
	
	public static BookService getBookService() {
		if(null == bookService) {
			synchronized(ServiceFactory.class) {
				if(null == bookService) {
					bookService = new BookServiceImpl();
				}
			}
		}
		return bookService;
	}
	
	public static MemberService getMemberService() {
		if(null == memberService) {
			synchronized(ServiceFactory.class) {
				if(null == memberService) {
					memberService = new MemberServiceImpl();
				}
			}
		}
		return memberService;
	}
	
	public static StaffService getStaffService() {
		if(null == staffService) {
			synchronized(ServiceFactory.class) {
				if(null == staffService) {
					staffService = new StaffServiceImpl();
				}
			}
		}
		return staffService;
	}
	
	public static PersonService getPersonService() {
		if(null == personService) {
			synchronized(ServiceFactory.class) {
				if(null == personService) {
					personService = new PersonServiceImpl();
				}
			}
		}
		return personService;
	}
	
}

