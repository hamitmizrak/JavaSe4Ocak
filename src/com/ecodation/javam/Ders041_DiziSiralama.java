package com.ecodation.javam;

import java.util.Arrays;

public class Ders041_DiziSiralama {

	public static void main(String[] args) {

		// obje dizisi
		int[] dizi = new int[4];

		dizi[0] = 44;
		dizi[1] = 25;
		dizi[2] = 34;
		dizi[3] = 23;

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}

		System.out.println("---------");

		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println("---------");
		System.out.println(Arrays.binarySearch(dizi, 445));

	}
}
