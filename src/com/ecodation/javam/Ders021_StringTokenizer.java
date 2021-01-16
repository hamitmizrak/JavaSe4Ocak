package com.ecodation.javam;

import java.util.StringTokenizer;

public class Ders021_StringTokenizer {
	
	public static void main(String[] args) {
		String str = "Amine Fatma Furkan İbrahim Merve Mustafa & Selçuk Sena Yasemin Zeynep Hamit";
		StringTokenizer sTokenizer = new StringTokenizer(str, "&");
		while (sTokenizer.hasMoreTokens()) {
			String parcalandi = sTokenizer.nextToken();
			System.out.println(parcalandi);
		}
		System.out.println("---------");
		
		String[] dizi = str.split("&");
		for (String temp : dizi) {
			System.out.println(temp);
		}
		
	}
	
}
