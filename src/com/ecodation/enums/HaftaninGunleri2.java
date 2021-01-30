package com.ecodation.enums;

// i c e
public enum HaftaninGunleri2 {
	pazartesi(1), sali(2), carsamba(3), persembe(4), cuma(5), cumartesi(6), pazar(0);

	// değişkende final kullandım.
	public final int sira;

	public int getSira() {
		return sira;
	}

	// parametreli constuctor sadece private yazabilirsiniz.
	private HaftaninGunleri2(int sira44) {
		this.sira = sira44;
	}

}
