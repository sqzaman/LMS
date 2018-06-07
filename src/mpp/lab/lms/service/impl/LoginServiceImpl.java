package mpp.lab.lms.service.impl;

import mpp.lab.lms.model.Staff;
import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.service.LoginService;
import mpp.lab.lms.service.factory.ServiceFactory;

public class LoginServiceImpl implements LoginService{

	PersistenceService ps = ServiceFactory.getPersistenceService();
	
	@Override
	public void login(String id, String password) {		
		Staff staff = getStaffByID(id);
		if(staff == null) return;
		
		if(checkIfPasswordMatches(staff, password)) {
			System.out.println("User Logged in - Wellcome to the system!");
		}
				
	}
	
	@Override
	public Staff getStaffByID(String id) {
		return ps.getStaff(id);
	}

	@Override
	public boolean checkIfPasswordMatches(Staff staff, String password) {
		return staff.getPassword().equals(password);
	}

}
