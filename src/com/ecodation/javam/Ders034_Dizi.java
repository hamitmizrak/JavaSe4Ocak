package com.ecodation.javam;

public class Ders034_Dizi {

	public static void main(String[] args) {

		int[] dizi = new int[10];
		dizi[3] = 5;
		dizi[0] = 9;
		dizi[9] = 85;

		/*
		 * for (int x = 0; x < 10; x++) { System.out.print(dizi[x] + " "); }
		 */

		for (int x = 0; x < dizi.length; x++) {
			System.out.print(dizi[x] + " ");
		}

	}
}
