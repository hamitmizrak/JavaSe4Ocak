package com.ecodation.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTutorials {

	public static void main(String[] args) {
		// H H L T
		Map<String, Object> mapList = new HashMap<String, Object>();
		mapList.put("1", "Hamit Mızrak");
		mapList.put("2", "Fatma Nur");
		mapList.put("3", "Mustafa Emre");
		mapList.put("4", "Yasemin");
		mapList.put("5", "Ahmet");

		// M.e.g.l.es
		for (Map.Entry<String, Object> temp : mapList.entrySet()) {
			System.out.println(temp);
		}

		System.out.println("sadece key ");
		// sadece Key
		for (String key : mapList.keySet()) {
			System.out.print(key + " ");
		}

		System.out.println("sadece value");
		// sadece value
		for (Object value : mapList.values()) {
			System.out.print(value + " ");
		}

		System.out.println("iterator ile veri çekmek");
		Set set = mapList.keySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			// System.out.println(ite.next());
			System.out.println(mapList.get(ite.next()));
		}

		System.out.println("Lambda");
		mapList.entrySet().forEach(System.out::println);

	}

}
