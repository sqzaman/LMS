package mpp.lab.lms.service;

import mpp.lab.lms.model.Staff;

public interface MemberService {
	void addMember(int id, Staff staff, String firstName, String lastName, String street, String city, String state, String phoneNumber);
}
