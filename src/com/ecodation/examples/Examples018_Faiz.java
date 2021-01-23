package com.ecodation.examples;

import java.util.Scanner;

public class Examples018_Faiz {

	public static void main(String[] args) {

		// 500.000 TL (Anapara) + (%15 x 500.000 TL ) = 500.000 TL + 75.000 TL = 575.000 TL (Ödenecek tutar)

		Scanner klavye = new Scanner(System.in);
		double anaPara, odenecekTutar;
		final int oran = 15;

		System.out.println("Yatırmak istediğiniz para miktarını giriniz");
		anaPara = klavye.nextDouble();

		odenecekTutar = anaPara + (anaPara * oran / 100);
		System.out.println(odenecekTutar);

	}
}
