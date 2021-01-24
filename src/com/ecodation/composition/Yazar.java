package com.ecodation.composition;

public class Yazar {

	private String yazarAdi;
	private String yazarDogumTarihi;

	private Kitaplar[] kitaplar;

	public Kitaplar[] getKitaplar() {
		return kitaplar;
	}

	public void setKitaplar(Kitaplar[] kitaplar) {
		this.kitaplar = kitaplar;
	}

	// getter and setter
	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYazarDogumTarihi() {
		return yazarDogumTarihi;
	}

	public void setYazarDogumTarihi(String yazarDogumTarihi) {
		this.yazarDogumTarihi = yazarDogumTarihi;
	}

}
