package com.swat.data;

public class UserData {

    public UserData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserData(String firstName, String lastName, String email, String password){
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserData(String email) {
        this.email = email;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
