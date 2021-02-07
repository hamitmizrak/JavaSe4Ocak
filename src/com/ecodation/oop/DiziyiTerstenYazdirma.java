package com.ecodation.oop;

public class DiziyiTerstenYazdirma {

	public static void main(String[] args) {
		int[] orginalDizi = { 1, 2, 3, 4, 5 };

		System.out.println("boyut:" + orginalDizi.length);
		int[] tersDizi = new int[orginalDizi.length];

		for (int temp1 : orginalDizi) {
			System.out.print(temp1 + " ");
		}

		System.out.println("");

		for (int i = 0; i < tersDizi.length; i++) {
			tersDizi[orginalDizi.length - 1 - i] = orginalDizi[i];
		}

		for (int temp2 : tersDizi) {
			System.out.print(temp2 + " ");
		}

	}
}
