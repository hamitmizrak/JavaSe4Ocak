package com.ecodation.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//65 satır
public class IOReader3 {
	public static void main(String[] args) throws IOException, ArithmeticException {
		String path = "C:\\fileIO\\5grup.txt";
		String okunan = "", satir = "", eklendi = "";
		BufferedWriter bufferedWriter = null;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			while ((satir = bufferedReader.readLine()) != null) {
				okunan += satir + "\n";
			}
			String[] str = okunan.split(" ");
			for (int i = 0; i < str.length; i++) {
				eklendi += str[i].concat("Java") + "\n";
			}
			System.out.println(eklendi);
			bufferedWriter = new BufferedWriter(new FileWriter(path));
			bufferedWriter.write(eklendi);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
