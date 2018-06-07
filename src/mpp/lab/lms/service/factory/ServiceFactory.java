package mpp.lab.lms.service.factory;

import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.persistence.PersistenceServiceImpl;
import mpp.lab.lms.service.BookService;
import mpp.lab.lms.service.StaffService;
import mpp.lab.lms.service.impl.BookServiceImpl;
import mpp.lab.lms.service.impl.StaffServiceImpl;
import mpp.lab.lms.service.LoginService;
import mpp.lab.lms.service.impl.LoginServiceImpl;


public class ServiceFactory {
	
	private volatile static PersistenceService persistenceService;
	private volatile static BookService bookService;
	private volatile static StaffService staffService;
	private volatile static LoginService loginService;


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

	public static LoginService getLoginService() {
		if(null == loginService) {
			synchronized(ServiceFactory.class) {
				if(null == loginService) {
					loginService = new LoginServiceImpl();
				}
			}
		}
		return loginService;
	}
}

