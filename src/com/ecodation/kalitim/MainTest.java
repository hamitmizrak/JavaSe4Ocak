package com.ecodation.kalitim;

public class MainTest {

	public static void main(String[] args) {
		Mudur mudur = new Mudur();
		mudur.setAdi("Ahmet ");
		mudur.setSoyadi("Yalçın");
		mudur.adSoyad();

		System.out.println("-------------");
		Temizlikci temizlikci = new Temizlikci();
		temizlikci.setAdi("Mehmet ");
		temizlikci.setSoyadi("Erdemir");
		temizlikci.adSoyad();

		// polymorphism:herşey aynı ancak görevleri farklıdır.
	}

}
