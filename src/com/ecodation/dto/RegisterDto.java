package com.ecodation.dto;

public class RegisterDto {
	
	//nesne değişkeni
	private long id;
	private String userEmail;
	private String userPassword;
	
	public RegisterDto() {
		this.id=0;
		this.userEmail="info@ecodation.com";
		this.userPassword="root";
	}
	
	//getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "RegisterDto [id=" + id + ", userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
	}
	
	//toString 
	
}
