package com.swat.data;

public class UserData {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	

	public UserData(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public UserData(String email) {
		this.email = email;
	}	

}
