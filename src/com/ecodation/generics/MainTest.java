package com.ecodation.generics;

public class MainTest {

	public static void main(String[] args) {
		GenericClass class1 = new GenericClass("Hamit", "Mızrak");
		// class1.setAdi(true);

		// System.out.println(class1.getAdi());
		System.out.println(class1);

		class1.adSoyad(44, 55);
	}
}
