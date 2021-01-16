package com.ecodation.javam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ders019_Date {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Locale lokal = new Locale("tr", "TR");
		SimpleDateFormat sFormat = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss zzzz", lokal);
		
		Date tarih = new Date();
		System.out.println(tarih);
		
		String kelime = sFormat.format(tarih);
		System.out.println(kelime);
		
		/*
		 * System.out.println(tarih.getDate()); System.out.println(tarih.getHours());
		 * System.out.println(tarih.getMinutes());
		 * System.out.println(tarih.getTimezoneOffset());
		 * System.out.println(tarih.getTime());
		 */
		
	}
	
}
