package com.ecodation.javam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Ders020_Calendar {
	
	public static void main(String[] args) {
		
		Locale lokal = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd - MMMM - yyyy hh:mm:ss", lokal);
		Calendar takvim = Calendar.getInstance();
		// System.out.println(takvim.getTime());
		String degistir = dateFormat.format(takvim.getTime());
		
		System.out.println(degistir);
		
		System.out.println(takvim.getTime());
		System.out.println(takvim.getWeekYear());
		System.out.println(takvim.getFirstDayOfWeek());
		takvim.setFirstDayOfWeek(5);
		System.out.println(takvim.getFirstDayOfWeek());
	}
	
}
