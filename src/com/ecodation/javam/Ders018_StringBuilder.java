package com.ecodation.javam;

public class Ders018_StringBuilder {
	
	public static void main(String[] args) {
		
		String kelime2 = "Java SE";
		
		String concatBirlestir = kelime2.concat(" sona eklendim.");
		System.out.println(concatBirlestir);
		
		String artiBirlestir = kelime2 + " sona eklendim.";
		System.out.println(artiBirlestir);
		
		StringBuilder stringBuilder = new StringBuilder(kelime2);
		stringBuilder.append(" ").append("Sona").append(" eklendim").append(" ");
		String bir = stringBuilder.toString();
		System.out.println(bir);
		
	}
	
}
