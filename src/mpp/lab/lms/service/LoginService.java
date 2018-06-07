package mpp.lab.lms.service;

import mpp.lab.lms.model.Staff;

public interface LoginService {
	
	Staff getStaffByID(String id);
	boolean checkIfPasswordMatches(Staff staff, String password);
	void login(String id, String password);

}
