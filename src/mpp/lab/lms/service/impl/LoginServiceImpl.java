package mpp.lab.lms.service.impl;

import mpp.lab.lms.model.Staff;
import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.service.LoginService;
import mpp.lab.lms.service.factory.ServiceFactory;

public class LoginServiceImpl implements LoginService{

	PersistenceService ps = ServiceFactory.getPersistenceService();
	
	@Override
	public Staff login(String id, String password) {		
		System.out.println("calling login()");
		Staff staff = getStaffByID(id);
		if(staff == null) return null;		
		if(!checkIfPasswordMatches(staff, password)) return null;
		
		redirectToIndex();		
		return loadUserIntoSession(staff);
	}
	
	@Override
	public Staff getStaffByID(String id) {
		System.out.println("calling getStaffByID()");	
		return ps.getStaff(id);
	}

	@Override
	public boolean checkIfPasswordMatches(Staff staff, String password) {
		System.out.println("calling checkIfPasswordMatches()");
		return staff.getPassword().equals(password);
	}
	
	@Override
	public Staff loadUserIntoSession(Staff staff) {
		System.out.println("calling loadUserIntoSession()");
		return staff;
	}
	
	@Override
	public void redirectToIndex() {
		System.out.println("calling redirectToIndex()");
		System.out.println("User logged in - Wellcome to the system!");	
	}

}
