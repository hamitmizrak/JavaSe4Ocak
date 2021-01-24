package com.ecodation.oop;

import java.io.Serializable;

//  bean = pojo + constuctor + Serializable
public class Teacher implements Serializable {
	private static final long serialVersionUID = 5345429282896998555L;

	// Nesne değişkenleri
	private String adi;
	private String soyAdi;

	// Kurucu methodlar parametresiz
	public Teacher() {
		this.adi = "adinizi girmediniz";
		this.soyAdi = "soyadinizi girmediniz.";
	}

	// parametreli constructor
	// overloading: isimleri aynı metotlara diyoruz ancak parametre sayısı farklı olacak
	public Teacher(String adi, String soyAdi) {
		super();
		this.adi = adi;
		this.soyAdi = soyAdi;
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

	// toString
	@Override
	public String toString() {
		return "Teacher [adi=" + adi + ", soyAdi=" + soyAdi + "]";
	}

}
