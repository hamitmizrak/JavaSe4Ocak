package com.ecodation.oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryApplication {

	public static Map<String, String> mapList = new HashMap<String, String>();

	public static void chooise() {
		Scanner klavye = new Scanner(System.in);
		int key;

		while (true) {
			System.out.println("1-)Ekle\n2-)Sil\n3-)Listeleme\n4-)Çıkış");
			key = klavye.nextInt();

			switch (key) {
				case 1:
					System.out.println(" ");
					kelimeEkle();
					break;

				case 2:
					System.out.println(" ");
					kelimeSil();
					break;

				case 3:
					System.out.println(" ");
					kelimeListele();
					break;

				case 4:
					System.out.println("Çıkış yapılıyor...");
					System.exit(0);
					break;

				default:
					System.out.println("Belirtilen aralıkta sayı giriniz");
					break;
			}
		}
	}

	private static void kelimeListele() {
		if (mapList.isEmpty()) {
			System.out.println("İçerik boştur");
		} else {
			System.out.println("");
			mapList.entrySet().forEach(System.out::println);
		}

	}

	private static void kelimeSil() {

		if (mapList.isEmpty()) {
			System.out.println("Silinecek eleman yoktur");
		} else {
			Scanner klavye = new Scanner(System.in);
			String id;
			mapList.entrySet().forEach(System.out::println);
			System.out.println("\nLütfen silmek istediğiniz id kelimeyi giriniz");

			id = klavye.nextLine();
			mapList.remove(id);
			System.out.println("silinen id: " + id);

		}

	}

	private static void kelimeEkle() {
		System.out.println("");
		Scanner klavye = new Scanner(System.in);
		String turkce, ingilizce;

		System.out.println("Türkçe kelime giriniz");
		turkce = klavye.nextLine();

		System.out.println("İngilizce kelime giriniz");
		ingilizce = klavye.nextLine();

		mapList.put(turkce, ingilizce);
		System.out.println("Ekleme başarılı");

	}

	public static void main(String[] args) {
		chooise();
	}

}
