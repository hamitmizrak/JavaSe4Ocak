package com.ecodation.javam;

public class Ders032_MethodVoid {
	
	// voidli parametresiz method"
	public static void methodVoidliParametresiz() {
		System.out.println("voidli parametresiz method");
	}
	
	// voidli parametreli method"
	public static void methodVoidliParametreli(int a, int b) { // parametre.
		System.out.println("voidli parametreli method: " + (a + b));
	}
	
// voidsiz parametresiz method"
	public static String methodVoidsizParametresiz() {
		String kelime = "voidsiz parametresiz method";
		return kelime;
	}
	
// voidsiz parametrelimethod"
	public static String methodVoidsizParametreli(int sayi) {
		String kelime = "voidsiz parametreli method";
		return kelime;
	}
	
	public static void main(String[] args) {
		methodVoidliParametresiz();
		methodVoidliParametreli(4, 6); // 4 ve 6 argümandır.
		
		String s2 = methodVoidsizParametresiz();
		System.out.println(s2);
		
		String s3 = methodVoidsizParametreli(10);
		System.out.println(s3);
	}
}
