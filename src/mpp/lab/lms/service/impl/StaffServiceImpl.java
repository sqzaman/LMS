package mpp.lab.lms.service.impl;

import mpp.lab.lms.model.Staff;
import mpp.lab.lms.persistence.PersistenceServiceImpl;
import mpp.lab.lms.service.StaffService;

public class StaffServiceImpl implements StaffService {

	@Override
	public boolean checkStaffHasPermission(Staff staff) {
		Object o = new PersistenceServiceImpl().getObject(staff);
		return o.getClass() == staff.getClass();
	}

}
