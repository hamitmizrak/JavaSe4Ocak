package com.ecodation.composition;

public class Kitaplar {

	private String kitapAdi;
	private String basimYili;

	private Yazar yazar;

	public Yazar getYazar() {
		return yazar;
	}

	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}

	// getter and Setter
	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getBasimYili() {
		return basimYili;
	}

	public void setBasimYili(String basimYili) {
		this.basimYili = basimYili;
	}

}
