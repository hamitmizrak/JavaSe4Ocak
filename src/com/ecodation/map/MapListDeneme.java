package com.ecodation.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapListDeneme {

	public static void main(String[] args) {

		Map<Integer, String> mapList = new HashMap<>();
		mapList.put(1, "Yeni1");
		mapList.put(2, "Yeni2");
		mapList.put(3, "Yeni3");
		mapList.put(4, "Yeni4");

		// Lambda
		mapList.entrySet().forEach(System.out::println);
		
		
		
		List<String> denemeList=new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			denemeList.add("Deneme-"+(i+1));
		}
		denemeList.forEach(System.out::println);
		
		
		
		
		

		System.out.println("----------");
		// m.e.g.l.es
		for (Map.Entry<Integer, String> tempList : mapList.entrySet()) {
			System.out.println(tempList);
		}

		//
		for (int tempSayi : mapList.keySet()) {
			System.out.print(tempSayi + " ");
		}

		for (String tempValue : mapList.values()) {
			System.out.print(tempValue + " ");
		}

	}
}
