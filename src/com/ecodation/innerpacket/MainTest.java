package com.ecodation.innerpacket;

import com.ecodation.innerpacket.Ulke.Sehirler;
import com.ecodation.innerpacket.Ulke.Sehirler.Mahalleler;

public class MainTest {

	public static void main(String[] args) {
		Ulke ulke = new Ulke();
		ulke.setUlkeAdi("Türkiye");

		Sehirler sehirler = new Sehirler();
		sehirler.setSehirAdi("İstanbul");

		Mahalleler mahalleler = sehirler.new Mahalleler();
		mahalleler.setMahalleAdi("Başakşehir");
	}
}
