package com.ecodation.javam;

public class Ders008_Cast {
	
public static void main(String[] args) {
    //cast: dönüştürmek 
	
	//1-) f -L
	float f1=14.55f;
	long l1=45216L;
	
	//2-) 
	float f2=(float)14.55;
	long l2=(long)452555225;
	
	//3-) küçük olanı büyüğe taşımada veri kaybı olmaz
	byte b3=45;
	long l3=b3;
	
	//4-) Büyük olanı küçük olana taşımaya çalıştığımda veri kaybı meydana gelir.
	long l4=452552125L;
	byte b4=(byte)l4;
	System.out.println(b4);
	
	//5-)String to int
	int x1,x2;
	x1=5;
	x2=9;
	System.out.println(x1+x2);
	
	String x3,x4;
	x3="5";
	x4="9";
	System.out.println(x3+x4);
	
	//6-) String to  int
	String str="9";
	//System.out.println(str*5);
	
	//Object düzeyindedir.
	int sayi=Integer.valueOf(str);
	System.out.println(sayi*5);
	
	//ilkel düzeydedir.
	int sayi2=Integer.parseInt(str);
	System.out.println(sayi2*5);
	
	
	//7-) int to String(int'i String'e çevirmek
	int sayi5=5;
	System.out.println(sayi5*5);
	//valueOf
	String str5=String.valueOf(sayi5);
	//System.out.println(str5*5);
	
	//ilkel düzeydedir
	String str6=Integer.toString(sayi5);
	
}
		
	
}
