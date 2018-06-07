package mpp.lab.lms.model;

enum AuthorizationRole {
	Administrator, Librarian;
}


public class Role {
	private AuthorizationRole authorizationLevel;
	private String description;
	
	public Role(AuthorizationRole authorizationLevel, String description) {
		this.authorizationLevel = authorizationLevel;
		this.description = description;
	}

	public AuthorizationRole getAuthorizationLevel() {
		return authorizationLevel;
	}

	public void setAuthorizationLevel(AuthorizationRole authorizationLevel) {
		this.authorizationLevel = authorizationLevel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return "Role: " + this.authorizationLevel;
	}
}
