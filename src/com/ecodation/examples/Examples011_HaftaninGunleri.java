package com.ecodation.examples;

import java.util.Scanner;

public class Examples011_HaftaninGunleri {
	// Haftanın günleri
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		while (3 > 1) { // sonsuz döngü
			System.out.println("Haftanın gününü giriniz");
			String hafta = klavye.nextLine();
			
			switch (hafta) {
				case "pazartesi":
					String upperCaseValue = hafta.toUpperCase();
					System.out.println("Haftanın günü: " + upperCaseValue);
					break;
				
				case "sali":
					String upperCaseValue2 = hafta.toUpperCase();
					System.out.println("Haftanın günü: " + upperCaseValue2);
					break;
				
				case "persembe":
					String upperCaseValue3 = hafta.toUpperCase();
					System.out.println("Haftanın günü: " + upperCaseValue3);
					break;
				
				case "carsamba":
					String upperCaseValue4 = hafta.toUpperCase();
					System.out.println("Haftanın günü: " + upperCaseValue4);
					break;
				
				case "cuma":
					String upperCaseValue5 = hafta.toUpperCase();
					System.out.println("Haftanın günü: " + upperCaseValue5);
					break;
				
				case "pazar":
					String upperCaseValue6 = hafta.toUpperCase();
					System.out.println("Haftanın günü: " + upperCaseValue6);
					break;
				
				case "cumartesi":
					String upperCaseValue7 = hafta.toUpperCase();
					System.out.println("Haftanın günü: " + upperCaseValue7);
					break;
				
				default:
					System.out.println("farklı bir regex girdiniz");
					break;
			}
		}
	}
}
