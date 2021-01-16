package com.ecodation.javam;

import java.util.Scanner;

public class Ders012_Klavye {
	
	
	
public static void main(String[] args) {
  
	//String str="Amine Büşra Fatma Furkan İbrahim Merve Mustafa Sena Yasemin Zeynep Zeynep";
	//System.out.println(str);
	
	//ctrl+Shift+O = import
	Scanner klavye=new Scanner(System.in);
	System.out.println("Lütfen bir kelime giriniz");
	String str=klavye.nextLine(); //yeni bir satırda geç ve kelime al
	
	System.out.println("Lütfen bir sayı giriniz");
	double sayi=klavye.nextDouble();
	

	
	System.out.println(str.length()); //harf sayısını verir
	System.out.println(str.trim().length()); //başında ve sonundaki boşlukları alır
	System.out.println(str.toLowerCase()); //Bütün karakterler küçük harf yapar
	System.out.println(str.toUpperCase()); //Bütün karakter BÜYÜK HARF YAPAR
	System.out.println(str.startsWith("Amine")); //bu karakterler mi başlıyor
	System.out.println(str.startsWith("A")); //bu karakterler mi başlıyor
	System.out.println(str.endsWith("Zeynep "));
	System.out.println(str.isEmpty()); //boş mu
	System.out.println(str.concat("Hamit"));
	System.out.println(str.charAt(0));
	System.out.println(str.indexOf("A"));
	System.out.println(str.lastIndexOf("p"));
	System.out.println(str.substring(8));
	System.out.println(str.substring(0,3)); // 0 <= x <= 3-1
	
	System.out.println(str.equals("Amine Büşra Fatma Furkan İbrahim Merve Mustafa Sena Yasemin Zeynep"));
	System.out.println(str.equalsIgnoreCase("Amine BÜŞRA Fatma FURKAN İbrahim merVE Mustafa Sena Yasemin Zeynep"));

	System.out.println(str.contains("asd")); //bununla alakalı bir şey var mı
	
	System.out.println(str);
	System.out.println(str.replace("Zeynep", "Zeynep YILMAZ")); // 1.old   2.new 
	
	System.out.println("------------------- SPLIT----------------");
	//split
	String[] array=str.split(" ");
	for(String temp: array) {
		System.out.println(temp);
	}
	
	System.out.println("***************");
	System.out.println(array[0].trim().toUpperCase().length());
	System.out.println(array[array.length-1].trim().toUpperCase().length());
	if(array[array.length-1].trim().toUpperCase().length()>=6) {
		System.out.println("6 karakterden büyük veya eşit");
	}else {
		System.out.println("6 karakterden küçük");
	}
	
	String ternary= (array[array.length-1].trim().toUpperCase().length()>=6)  ? "büyük":"küçük";
	String ifElseBasit=  3>1 ? "büyük" :"küçük";

		
	
	

	
}	
	
}
