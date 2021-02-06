package com.ecodation.generics;

//Generics class
public class GenericClass<T> {

	// generics nesne değişkenleri
	private T adi;
	private T soyadi;

	// parametresiz contructor
	public GenericClass() {

	}

	// Generics Methods
	public <K> void adSoyad(K adi, K soyadi) {
		System.out.println("adım: " + adi + " soyadım:" + soyadi);
	}

	@Override
	public String toString() {
		return "GenericClass [adi=" + adi + ", soyadi=" + soyadi + "]";
	}

	// Generics parametreli constructor
	public GenericClass(T adi, T soyadi) {
		// super();
		this.adi = adi;
		this.soyadi = soyadi;
	}

	// Generics getter and setter
	public T getAdi() {
		return adi;
	}

	public void setAdi(T adi) {
		this.adi = adi;
	}

	public T getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(T soyadi) {
		this.soyadi = soyadi;
	}

}
