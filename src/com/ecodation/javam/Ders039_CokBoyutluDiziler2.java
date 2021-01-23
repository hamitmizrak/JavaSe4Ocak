package com.ecodation.javam;

public class Ders039_CokBoyutluDiziler2 {

	public static void main(String[] args) {

		int[][] diziler = { { 4, 6, 85, 2, 5 }, { 5, 12, 63, 9, 8 }, };

		for (int i = 0; i < diziler.length; i++) { // satır
			for (int j = 0; j < diziler[i].length; j++) { // sutun
				System.out.print("*");

			}
			System.out.println("");

		}
	}
}
