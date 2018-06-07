package mpp.lab.lms.service.factory;

import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.persistence.PersistenceServiceImpl;
import mpp.lab.lms.service.BookService;
import mpp.lab.lms.service.CheckoutService;
import mpp.lab.lms.service.MemberService;
import mpp.lab.lms.service.impl.BookServiceImpl;
import mpp.lab.lms.service.impl.CheckoutServiceImpl;
import mpp.lab.lms.service.impl.MemberServiceImpl;

public class ServiceFactory {
	private volatile static PersistenceService persistenceService;
	private volatile static BookService bookService;
	private volatile static CheckoutService checkoutService;
	private volatile static MemberService memberService;

	
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
	
	public static CheckoutService getCheckoutService() {
		if(null == checkoutService) {
			synchronized(ServiceFactory.class) {
				if(null == checkoutService) {
					checkoutService = new CheckoutServiceImpl();
				}
			}
		}
		return checkoutService;
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
	
}

