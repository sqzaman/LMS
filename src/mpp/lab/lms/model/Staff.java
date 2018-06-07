package mpp.lab.lms.model;

import java.util.LinkedList;
import java.util.List;

public class Staff {
	private String username;
	private String password;
	private List<Role> roles; 
	
	public Staff(String username, String password, Role role) {
		this.username = username;
		this.password = password;
		roles = new LinkedList<>();
		roles.add(role);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public void addRole(Role role) {
		this.roles.add(role);
	}
	
	public String toString() {
		String s = "Staff: " + this.username + "\n";
		
		for (Role role: roles) {
			s += " [" + role.toString() + "]";
		}

		return s;
	}
}
