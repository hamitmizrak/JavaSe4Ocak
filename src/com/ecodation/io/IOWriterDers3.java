package com.ecodation.io;

//34 satır
import java.io.BufferedWriter;
import java.io.FileWriter;

public class IOWriterDers3 {
	public static void main(String[] args) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\fileIO\\5grup.txt", true))) {
			bufferedWriter.write("Hamit Mızrak \nMalatya 44");
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
