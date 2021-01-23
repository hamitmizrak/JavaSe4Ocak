package com.ecodation.javam;

public class Ders038_CokBoyutluDiziler {

	public static void main(String[] args) {

		int[][] diziler = new int[3][5];

		/*
		 * diziler[0][0] = 1;
		 * 
		 * diziler[2][1] = 9;
		 * 
		 * diziler[2][4] = 24;
		 */

		for (int i = 0; i < diziler.length; i++) { // satır
			for (int j = 0; j < diziler[i].length; j++) { // sutun
				System.out.print("*");

			}
			System.out.println("");

		}
	}
}
