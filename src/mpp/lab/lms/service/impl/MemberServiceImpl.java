package mpp.lab.lms.service.impl;

import mpp.lab.lms.exceptions.StaffPermissionException;
import mpp.lab.lms.model.Member;
import mpp.lab.lms.model.Person;
import mpp.lab.lms.model.Staff;
import mpp.lab.lms.persistence.PersistenceService;
import mpp.lab.lms.service.MemberService;
import mpp.lab.lms.service.PersonService;
import mpp.lab.lms.service.StaffService;
import mpp.lab.lms.service.factory.ServiceFactory;

public class MemberServiceImpl implements MemberService {
	StaffService staffService = ServiceFactory.getStaffService();
	PersonService personService = ServiceFactory.getPersonService();
	PersistenceService persistenceService = ServiceFactory.getPersistenceService(); 
	
	@Override

	public void addMember(int id, Staff staff, String firstName, String lastName, String street, String city, String state, String phoneNumber) {
		if(staffService.checkStaffHasPermissionToAddMember(staff)) {
			Person p = personService.createPerson(firstName, lastName, street, city, state, phoneNumber);
			Member m = createMember(id, p);
			persistenceService.addMember(m);
		}else {
			throw new StaffPermissionException("Staff has no permission");
		}
	}
	
	private Member createMember(int id, Person person) {
		return new Member(id, person);
	}

	@Override
	public Member getMemberByID(int id) {
		return persistenceService.getMembers().get(id);
	}

}
