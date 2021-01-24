package com.ecodation.oop;

import java.io.Serializable;

public class Metre implements Serializable {
	// 19 karakterli classtır. 10 ^ 19
	private static final long serialVersionUID = 6619489591867937207L;
	// değişkenler
	private int uzunluk;
	private String tarih;

	// parametresiz constructor
	public Metre() {

	}

	// parametreli constructor
	public Metre(int uzunluk, String tarih) {
		super();
		this.uzunluk = uzunluk;
		this.tarih = tarih;
	}

	// getter and setter
	public int getUzunluk() {
		return uzunluk;
	}

	@Deprecated
	@SuppressWarnings(value = { "bu boşver" })

	public void setUzunluk(int uzunluk) {
		// validation
		if (uzunluk < 0) {
			this.uzunluk = uzunluk * (-1);
		}
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	// toString
	@Override
	public String toString() {
		return "Metre [uzunluk=" + uzunluk + ", tarih=" + tarih + "]";
	}

}
