package com.ecodation.io;

//34 satır
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOWriterDers {
	public static void main(String[] args) {
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter;
		String path = "C:\\fileIO\\5grup.txt";

		try {
			fileWriter = new FileWriter(path, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Hamit Mızrak");
			bufferedWriter.write("\nMalatya 44");
			bufferedWriter.flush();
			System.out.println("yazıldı");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
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
