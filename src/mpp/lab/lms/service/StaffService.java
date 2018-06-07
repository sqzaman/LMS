package mpp.lab.lms.service;

import mpp.lab.lms.model.Staff;

public interface StaffService {
	boolean checkStaffHasPermission(Staff staff);
}
