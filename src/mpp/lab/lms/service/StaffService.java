package mpp.lab.lms.service;

import mpp.lab.lms.model.Staff;

public interface StaffService {
	boolean checkStaffHasPermissionToAddBook(Staff staff);
	boolean checkStaffHasPermissionToAddMember(Staff staff);
	void addNewStaff(Staff staff);
}
