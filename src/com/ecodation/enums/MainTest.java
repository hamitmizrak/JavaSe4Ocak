package com.ecodation.enums;

public class MainTest {
	public static void main(String[] args) {

		HaftaninGunleri haftaninGunleri = HaftaninGunleri.carsamba;
		System.out.println(haftaninGunleri);
		System.out.println(haftaninGunleri.name());
		System.out.println(haftaninGunleri.ordinal());
		System.out.println("-------------");

		// forEach
		for (HaftaninGunleri level : HaftaninGunleri.values()) {
			System.out.println(level);
		}

		HaftaninGunleri2 haftaninGunleri2 = HaftaninGunleri2.pazar;
		System.out.println(haftaninGunleri2.getSira());

		System.out.println("++++++++++++++++++");
		HaftaninGunleri3 haftaninGunleri3 = HaftaninGunleri3.sali;
		System.out.println(haftaninGunleri3.getSira());
		System.out.println(haftaninGunleri3.getHarf());
		System.out.println("sıra numarası: " + haftaninGunleri3.ordinal());

	}
}
