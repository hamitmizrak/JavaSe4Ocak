package com.ecodation.oop2;

import java.io.Serializable;

//bean=kurucu metotlar+pojo
abstract public class GenelOrtakOzellikler implements Serializable {
	private static final long serialVersionUID = -5748953935683949965L;
	// nesne değişkenleri
	private String adi;
	private String soyAdi;
	// class değişkeni
	private static String yas;

	// parametresiz constructor
	public GenelOrtakOzellikler() {
		this.adi = "isim girmediniz.";
		this.soyAdi = "Soyadı girmediniz.";
	}

	// parametreli constructor
	// Alt+Shift+S
	public GenelOrtakOzellikler(String adi, String soyAdi) {
		// super();
		this.adi = adi;
		this.soyAdi = soyAdi;
	}

	// gövdeli metot
	public void adSoyad() {
		System.out.println("adı: " + this.getAdi() + " soyadı: " + this.getSoyAdi());
	}

	// gövdesiz metot
	abstract public void govdesizMetot();

	// toString
	@Override
	public String toString() {
		return "GenelOrtakOzellikler [adi=" + adi + ", soyAdi=" + soyAdi + "]";
	}

	// getter and setter
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyAdi() {
		return soyAdi;
	}

	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}

	public static String getYas() {
		return yas;
	}

	public static void setYas(String yas) {
		GenelOrtakOzellikler.yas = yas;
	}

}
