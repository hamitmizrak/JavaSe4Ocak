package com.ecodation.map;

import java.util.Scanner;

public class MapExample {

	public String[] scannerValues() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Dizi eleman sayısı giriniz");
		int eleman;
		String sehirler;
		eleman = klavye.nextInt();

		String[] dizi = new String[eleman];
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i + 1) + ". Şehir adı giriniz");
			sehirler = klavye.nextLine();
			dizi[i] = sehirler;
		}
		return dizi;
	}

}
