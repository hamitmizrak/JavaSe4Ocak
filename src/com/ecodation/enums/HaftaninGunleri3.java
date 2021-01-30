package com.ecodation.enums;

// i c e
public enum HaftaninGunleri3 {
	pazartesi(1, "A"), sali(2, "B"), carsamba(3, "C"), persembe(4, "D"), cuma(5, "E"), cumartesi(7, "G"), pazar(6, "F");

	private final int sira;
	private final String harf;

	public int getSira() {
		return sira;
	}

	public String getHarf() {
		return harf;
	}
	// parametreli constructor private

	private HaftaninGunleri3(int sira, String harf) {
		this.sira = sira;
		this.harf = harf;
	}

}
