package com.ecodation.oop;

//pojo
public class Student {

	// nesne değişkenleri //global değişkenler
	String name;
	private String surname;

	// Class değişkeni
	private static String identity;

	// getter and setter
	public String getName() {
		return name;

		// this.name //global değişkenler
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdentity() {
		return identity;

		// this.name
	}

}
