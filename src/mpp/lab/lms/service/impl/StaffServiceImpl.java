package mpp.lab.lms.service.impl;

import java.util.List;

import mpp.lab.lms.model.Role;
import mpp.lab.lms.model.Staff;
import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.persistence.PersistenceServiceImpl;
import mpp.lab.lms.service.StaffService;
import mpp.lab.lms.service.factory.ServiceFactory;
import mpp.lab.lms.util.AuthorizationRole;

public class StaffServiceImpl implements StaffService {

	PersistenceService ps = ServiceFactory.getPersistenceService();
	
	@Override
	public boolean checkStaffHasPermission(Staff staff) {
		List<Role> roles = staff.getRoles();
		for(Role r: roles) {
			if( r.getAuthorizationLevel() == AuthorizationRole.Librarian ) {
				return true;
			}
		}
		
		return false;
	}
}
