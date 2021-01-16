package com.ecodation.util;

import java.util.Scanner;

import com.ecodation.controller.RegisterController;

public class MainClass {
	public static void main(String[] args) {
		RegisterController registerController = new RegisterController();
		
		Scanner klavye = new Scanner(System.in);
		while(true) {
			System.out.println("1-)Crud\n2-)Giriş\n3-)Çıkış");
			int result = klavye.nextInt();
			switch (result) {
				case 1:
					registerController.crudChooise();
					break;
				case 2:
					registerController.loginController();
					break;
				case 3:
					System.out.println("Çıkış yapılıyor.");
					System.exit(0);
					break;
				
				default:
					System.out.println("Lütfen belirtilen alandaki sayıyı giriniz");
					break;
			}
		}
		
	}
}
