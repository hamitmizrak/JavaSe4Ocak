package com.ecodation.io;

//34 satır
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOWriterDers2 {
	public static void main(String[] args) {
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter("C:\\fileIO\\5grup.txt", true));
			bufferedWriter.write("Hamit Mızrak");
			bufferedWriter.write("\nMalatya 44");
			bufferedWriter.flush();
			System.out.println("yazıldı");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
