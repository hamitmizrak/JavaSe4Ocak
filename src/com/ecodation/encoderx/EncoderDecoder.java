package com.ecodation.encoderx;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.UUID;

public class EncoderDecoder {

	public static String encoder(String isim) {
		Encoder encoder44 = Base64.getEncoder();
		String sifreleyici = encoder44.encodeToString(isim.getBytes());
		return sifreleyici;
	}

	public static void decoder(String coz) {
		Decoder cozulecek = Base64.getMimeDecoder();
		String tamamenCozuldu = new String(cozulecek.decode(coz));
		System.out.println("kod çözüldü: " + tamamenCozuldu);
	}

	public static void rastgeleSayilar() {
		UUID rastgele = UUID.randomUUID();
		System.out.println(rastgele);
	}

	public static void main(String[] args) {
		// Scanner klavye = new Scanner(System.in);
		// System.out.println("Lütfen adınızı soyadınızı yazınız.");
		// String adSoyad = klavye.nextLine();

		// String sifre = encoder(adSoyad);
		// System.out.println(sifre);

		// decoder(sifre);
		rastgeleSayilar();

	}

}
