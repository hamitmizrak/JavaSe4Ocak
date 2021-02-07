package com.ecodation.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCollectiontutorials2 {

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

		String kelimeler = "";
		String[] denemeDizi = scannerMethod();

		/*
		 * for (String temp : denemeDizi) { System.out.print(temp + " "); kelimeler += temp; } System.out.println("--- "
		 * + kelimeler);
		 */

		// Vector v=new Vector();
		List<String> listem = new ArrayList<String>();

		for (int i = 0; i < denemeDizi.length; i++) {
			listem.add(denemeDizi[i]);
		}

		System.out.println("++++++++++++");

		for (String temp2 : listem) {
			System.out.print(temp2 + " ");
		}

	}

}
