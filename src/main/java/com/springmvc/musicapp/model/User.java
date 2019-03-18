package com.springmvc.musicapp.model;

public class User {
	private String firstName = "";
	private String lastName = "";
	private String userName = "";
	private String password = "";
	private String email = "";
	private String phoneNo = "";
	
	public User() { }
	
	public User(String firstName, String lastName, String userName, String password,
			String email, String phoneNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
