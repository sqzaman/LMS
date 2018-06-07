package mpp.lab.lms.service.impl;

import mpp.lab.lms.model.Staff;
import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.persistence.PersistenceServiceImpl;
import mpp.lab.lms.service.StaffService;
import mpp.lab.lms.service.factory.ServiceFactory;

public class StaffServiceImpl implements StaffService {

	PersistenceService ps = ServiceFactory.getPersistenceService();
	
	@Override
	public boolean checkStaffHasPermission(Staff staff) {
		Object o = ps.getObject(staff);
		return o.getClass() == staff.getClass();
	}

}
