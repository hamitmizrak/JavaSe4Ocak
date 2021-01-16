package com.ecodation.javam;

import java.util.Random;

public class Ders016_Random {
	
	public static void main(String[] args) {
		
		// hızlıca çözümlemek istiyorsanız bunu kullanıyoruz.
		System.out.println(Math.round(Math.random() * 4 + 1));
		
		// Object düzeyinde random
		Random rnd = new Random();
		System.out.println(rnd.nextInt(4) + 1);
		
		// rnd = null;
		
	}
	
}
