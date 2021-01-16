package com.ecodation.examples;

import java.util.Scanner;

public class Examples004_ScannerSum {
	// Kullanıcı Tarafından Girilen İki Sayının Toplamı
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		int sayi1 , sayi2 , result;
		
		System.out.println("1.sayıyı giriniz");
		sayi1 = klavye.nextInt();
		
		System.out.println("2.sayıyı giriniz");
		sayi2  = klavye.nextInt();
		
		result = (sayi1 + sayi2);
		
		System.out.println(result);
		
	}
}
