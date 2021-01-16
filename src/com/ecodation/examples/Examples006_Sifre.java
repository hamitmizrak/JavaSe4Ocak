package com.ecodation.examples;

import java.util.Scanner;

public class Examples006_Sifre {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String dbValue = "Hamit";
		
		System.out.println("Lütfen şifrenizi giriniz ...");
		String password = klavye.nextLine();
		
		if (dbValue.equalsIgnoreCase(password)) {
			System.out.println("Şifreniz eşleşti.");
		} else {
			System.out.println("Şifreniz eşleşemedi.....");
		}
		
	}
}
