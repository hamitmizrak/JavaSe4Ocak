package com.ecodation.javam;

public class Ders040_ObjeDizisi {

	public static void main(String[] args) {

		// obje dizisi
		Object[] dizi = new Object[4];

		dizi[0] = "Java";
		dizi[3] = 44;
		dizi[2] = 23.23f;
		dizi[1] = 'c';

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}

	}
}
