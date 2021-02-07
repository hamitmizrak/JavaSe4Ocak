package com.ecodation.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapClass2 {

	public void result() {
		Scanner klavye = new Scanner(System.in);

		while (true) {
			System.out.println("1-)Ekleme\n2-)Listeleme\n3-)Çıkış");
			Map<Integer, Object> mapList = new LinkedHashMap<Integer, Object>();
			int key = klavye.nextInt();
			switch (key) {
				case 1:
					int keyMap;
					Object valuesMap;
					System.out.println("Key giriniz");
					keyMap = klavye.nextInt();
					klavye.nextLine();
					System.out.println("values giriniz");
					valuesMap = klavye.nextLine();

					mapList.put(keyMap, valuesMap);
					break;

				case 2:
					// lambda map
					mapList.entrySet().forEach(System.out::println);
					// for (Integer key44 : mapList.keySet()) {
					// Object value44 = mapList.get(key44);
					// System.err.println(key44 + " " + value44);
					// }
					break;

				case 3:
					System.out.println("Çıkış yapılıyor...");
					System.exit(0);
					break;

				default:
					System.out.println("Lütfen belirtilen aralıktaki değerleri giriniz");
					break;
			}
		}

	}
}
