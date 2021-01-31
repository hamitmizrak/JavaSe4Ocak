package com.ecodation.oopio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "conditionIO")
@ApplicationScoped
public class ConditionIO implements Serializable {
	private static final long serialVersionUID = 1L;

	BufferedWriter bufferedWriter;
	BufferedReader bufferedReader;

	File file;

	FileWriter fileWriter;
	FileReader fileReader;

	public ConditionIO() throws IOException {
		fileWriter = new FileWriter(PathValue.PATH, true);
		fileReader = new FileReader(PathValue.PATH);

		file = new File(PathValue.PATH);

		bufferedWriter = new BufferedWriter(fileWriter);
		bufferedReader = new BufferedReader(fileReader);
	}

	// Gelen Stringi yazmaya yarayan method
	public void fileWriterMethod(String value) throws IOException {
		try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			if (value != null) {
				bufferedWriter.write(value);
				bufferedWriter.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// klavyeden alınan verileri eklesin
	public String scannerWriteMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen kelime giriniz.");
		String kelime = klavye.nextLine();
		// klavye.close();
		return kelime;
	}

	//
	public String fileReaderMethod() throws IOException {
		String satir = null, okunan = null;
		try {
			while ((satir = bufferedReader.readLine()) != null) {
				okunan += satir;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
		return okunan;
	}

	// oluşturmak
	public void createFileMethod() throws IOException {
		if (!file.exists()) {
			String str = this.file.createNewFile() ? "oluşturuldu" : "oluşturulmadı";
			System.out.println(str);
		}

	}

	// karar verecek
	public void chooiseMethods() throws IOException {
		Scanner klavye2 = new Scanner(System.in);
		while (true) {
			System.out.println("Lütfen bir seçim yapınız");
			System.out.println("1-)Yazmak\n2-)Okumak\n3-)Silme\n4-)Oluşturmak\n5-)Çıkış");
			int chooise = klavye2.nextInt();
			switch (chooise) {
				case 1:
					String kelimeler = scannerWriteMethod();
					fileWriterMethod(kelimeler);
					System.out.println("Yazma başarılı");
					break;

				case 2:
					String okunan = fileReaderMethod();
					System.out.println(okunan);
					break;

				case 3:
					File file = new File(PathValue.PATH);
					if (file.exists()) {
						System.out.println((file.delete()));
					}
					break;
				case 4:
					System.out.println("ekleme yapılacak....");
					createFileMethod();
					break;

				case 5:
					System.out.println("Çıkış yapılıyor....");
					System.exit(0);
					break;

				default:
					System.out.println("Lütfen belirtilen aralıkta sayı giriniz");
					break;
			}

		}
		// klavye.close();
	}
}
