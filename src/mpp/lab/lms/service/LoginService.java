package mpp.lab.lms.service;

import mpp.lab.lms.model.Staff;

public interface LoginService {
	
	Staff getStaffByID(String id);
	boolean checkIfPasswordMatches(Staff staff, String password);
	Staff login(String id, String password);
	Staff loadUserIntoSession(Staff staff);
	void redirectToIndex();
}
