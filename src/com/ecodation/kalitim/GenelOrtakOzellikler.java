package com.ecodation.kalitim;

public class GenelOrtakOzellikler {

	private int kimlikNo = 0;
	private String adi = "";
	private String soyadi = "";
	private String memleket = "";

	// parametresiz constructor
	public GenelOrtakOzellikler() {
		adi = "adınızı yazmadınız.";
		this.soyadi = "soyadınız yazmadınız";

	}

	// parametreli constructor
	public GenelOrtakOzellikler(int kimlikNo, String adi, String soyadi, String memleket) {
		super();
		this.kimlikNo = kimlikNo;
		this.adi = adi;
		this.soyadi = soyadi;
		this.memleket = memleket;
	}

	// getter and setter
	public String getMemleket() {
		return memleket;
	}

	public void setMemleket(String memleket) {
		this.memleket = memleket;
	}

	public int getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(int kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	// toString

	@Override
	public String toString() {
		return "GenelOrtakOzellikler [kimlikNo=" + kimlikNo + ", adi=" + adi + ", soyadi=" + soyadi + ", memleket="
				+ memleket + "]";
	}

	public void adSoyad() {
		System.out.println("adı: " + this.adi + " soyadı: " + this.soyadi);
	}

}
