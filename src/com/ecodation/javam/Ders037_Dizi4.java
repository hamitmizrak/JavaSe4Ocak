package com.ecodation.javam;

public class Ders037_Dizi4 {

	public static void main(String[] args) {

		String[] dizi = new String[10];

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = i + " sırada";
			System.out.print(dizi[i] + " ");
		}
		System.out.println("------");
		// forEach
		for (String temp : dizi) {
			System.out.print(temp + " ");
		}
	}
}
