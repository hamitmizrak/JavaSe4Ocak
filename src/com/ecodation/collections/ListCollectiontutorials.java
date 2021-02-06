package com.ecodation.collections;

import java.util.List;
import java.util.Scanner;

public class ListCollectiontutorials {

	// kullanıcan veri alacak.
	public static String[] scannerMethod() {
		Scanner klavye = new Scanner(System.in);
		String kelime;
		int diziEleman;

		System.out.println("lütfen dizi için eleman sayısı giriniz");
		diziEleman = klavye.nextInt();

		String[] dizi = new String[diziEleman];

		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Lütfen " + i + " kelimeyi giriniz");
			dizi[i] = klavye.nextLine();
			// klavye.next();
		}
		return dizi;
	}

	public static void main(String[] args) {
		/*
		 * String kelimeler = ""; String[] denemeDizi = scannerMethod(); for (String temp : denemeDizi) {
		 * System.out.print(temp + " "); kelimeler += temp; } System.out.println("--- " + kelimeler);
		 */

		List<String> dinamikDizi = new java.util.LinkedList<String>();
		dinamikDizi.add("Hamit");
		dinamikDizi.add("Mızrak");
		dinamikDizi.add("Malatya");
		dinamikDizi.add("44");
		dinamikDizi.add("10");

		List<String> dinamikDizi2 = new java.util.ArrayList<String>();
		dinamikDizi2.add("Hamit");
		dinamikDizi2.add("Mızrak");
		dinamikDizi2.add("Malatya");
		dinamikDizi2.add("44");
		dinamikDizi2.add("1000");

		Boolean sonuc = dinamikDizi.contains("10");
		System.out.println(sonuc + " **");

		Boolean esitMi = dinamikDizi.equals(dinamikDizi2);
		System.out.println(esitMi);

		dinamikDizi.indexOf("Hamit");

		// dinamikDizi.replaceAll(dinamikDizi2);

		int sayi = dinamikDizi.indexOf("10");
		System.out.println(sayi);

		if (!dinamikDizi.isEmpty()) {
			System.out.println("bu dizi doldur");
		} else {
			System.out.println("bu dizi boştur.");
		}

		java.util.Collections.sort(dinamikDizi);
		// Collections.reverse(dinamikDizi);

		for (String temp : dinamikDizi) {
			System.out.println(temp);
		}

		System.out.println("---------------");
		dinamikDizi.remove(0);
		// dinamikDizi.remove(dinamikDizi.get(1));
		for (String temp : dinamikDizi) {
			System.out.println(temp);
		}

		dinamikDizi.clear();
		for (String temp : dinamikDizi) {
			System.out.println(temp);
		}
		System.out.println("+++++++++++");

	}

}
