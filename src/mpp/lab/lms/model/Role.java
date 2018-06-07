package mpp.lab.lms.model;

public class Role {
	private String authorizationLevel;
	private String description;
	
	public Role(String authorizationLevel, String description) {
		this.authorizationLevel = authorizationLevel;
		this.description = description;
	}

	public String getAuthorizationLevel() {
		return authorizationLevel;
	}

	public void setAuthorizationLevel(String authorizationLevel) {
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
