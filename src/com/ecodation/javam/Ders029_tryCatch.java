package com.ecodation.javam;

public class Ders029_tryCatch {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("devam -1");
			int sayi = 4 / 0;
			System.out.println(sayi);
			
		} catch (ArithmeticException ai) {
			ai.printStackTrace();
			System.out.println("Sıfıra bölemezsin");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("genel hata bölemezsin");
		}
		
		System.out.println("devam -2");
		
	}
}
