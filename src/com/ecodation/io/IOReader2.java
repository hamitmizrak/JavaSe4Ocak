package com.ecodation.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOReader2 {
	public static void main(String[] args) {
		String path = "C:\\fileIO\\5grup.txt";
		FileReader fileReader;
		BufferedReader bufferedReader = null;
		String okunan = "";
		String satir = "";
		String eklendi = "";

		try {
			fileReader = new FileReader(path);
			bufferedReader = new BufferedReader(fileReader);

			while ((satir = bufferedReader.readLine()) != null) {
				okunan = okunan + satir + "\n";
			}

			String[] str = okunan.split(" ");
			for (Object temp : str) {
				System.out.println(temp);

			}
			System.out.println("----------------");

			for (int i = 0; i < str.length; i++) {
				eklendi += str[i].concat("Java") + "\n";
			}

			System.out.println(eklendi);

		} catch (ArithmeticException ai) {
			ai.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
