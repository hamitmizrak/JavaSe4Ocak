package com.ecodation.oop2;

public class TestMain {

	public static void main(String[] args) {

		Erkek erkek = new Erkek();
		erkek.setAdi("Hamit");
		erkek.setSoyAdi("Mızrak");
		Erkek.setYas("35");
		System.out.println(erkek.getAdi() + " " + erkek.getSoyAdi() + " " + Erkek.getYas());
		System.out.println(erkek);
		erkek.adSoyad();// abstract polymorphism
		erkek.govdesizMetot();// abstract polymorphism
		erkek.guc();// interface

		System.out.println("-------------- ");

		Bayan bayan = new Bayan();
		bayan.setAdi("Amine");
		bayan.setSoyAdi("Tandoğan");
		Bayan.setYas("18");
		System.out.println(bayan.getAdi() + " " + bayan.getSoyAdi() + " " + Bayan.getYas());
		System.out.println(bayan);
		bayan.adSoyad(); // abstract polymorphism
		bayan.govdesizMetot();// abstract polymorphism
		bayan.guzellikler();// interface

		// GenelOrtakOzellikler genelOrtakOzellikler = new GenelOrtakOzellikler();

	}

}
