package com.ecodation.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import com.ecodation.dao.RegisterDao;
import com.ecodation.dto.RegisterDto;
import com.ecodation.util.IDbConnection;

public class RegisterController implements Serializable , IDbConnection<RegisterDto> {
	private static final long serialVersionUID = 1900648399094868176L;
	
	private RegisterDto registerDto;
	private RegisterDao registerDao;
	
	public RegisterController() {
		registerDto = new RegisterDto();
		registerDao = new RegisterDao();
		list();
	}
	
	// login method
	/*
	public void loginController() {
		Scanner klavye = new Scanner(System.in);
		String userName , userPassword;
		String dbUserName = "root" , dbUserPassword = "root";
		int counter = 3;
	
		while (counter > 0) {
			System.out.println("Email adresiniz");
			userName = klavye.nextLine();
			
			System.out.println("Şifreniz adresiniz");
			userPassword = klavye.nextLine();
			
			if ((userName.equals(dbUserName)) && (userPassword.equals(dbUserPassword))) {
				System.out.println("anasayfaya giriş yapılıyor.");
				break;
			}
			counter--;
			System.out.println("kalan hakkınız: " + counter);
			if (counter <= 0) {
				System.out.println("kalan hakkınız: " + counter);
				System.out.println("Kartınız bloke oldu Müşteri hizmetlerini arayınız 0850 99 66 22");
				System.exit(0);
			}
		}
	}*/
	
	public void loginController() {
		Scanner klavye = new Scanner(System.in);
		String userName , userPassword;
	
		int counter = 3;
	
		while (counter > 0) {
			System.out.println("Email adresiniz");
			userName = klavye.nextLine();
			
			System.out.println("Şifreniz adresiniz");
			userPassword = klavye.nextLine();
			
			if (dbSearch(userName,userPassword)) {
				System.out.println("anasayfaya giriş yapılıyor.");
				break;
			}
			counter--;
			System.out.println("kalan hakkınız: " + counter);
			if (counter <= 0) {
				System.out.println("kalan hakkınız: " + counter);
				System.out.println("Kartınız bloke oldu Müşteri hizmetlerini arayınız 0850 99 66 22");
				System.exit(0);
			}
		}
	}
	
	//database arama yapacak
	public boolean dbSearch(String userName,String userPassword) {
		return this.registerDao.searchUser(userName,userPassword);
	}
	
	// CRUD condition
	public  void crudChooise() {
		while(true) {
		System.out.println("Lütfen bir seçim yapınız.");
		System.out.println("1-)ekleme\n2-)Silme\n3-)Güncelleme\n4-)Liste\n5-)Çıkış\n");
		System.out.println("---------------");
		Scanner klavye = new Scanner(System.in);
		int result = klavye.nextInt();
		RegisterDto registerDto=new RegisterDto();
		switch (result) {
			case 1:
				Scanner klavye1 = new Scanner(System.in);
				System.out.println("\n Ekleme yapılıyor...");
				String emailAddress,password;
				System.out.println("email adresini giriniz");
				emailAddress=klavye1.nextLine();
				System.out.println("şifre  giriniz");
				password=klavye1.nextLine();
				//registerDto=null;
				registerDto.setUserEmail(emailAddress);
				registerDto.setUserPassword(password);
				create(registerDto);
				break;
			
			case 2:
				Scanner klavye2 = new Scanner(System.in);
				System.out.println("\n Silme yapılıyor...");
				long id;
				System.out.println("silmek istediğiniz id yazınız");
				id=klavye2.nextLong();
				delete(id);
				break;
			
				
			case 3:
				Scanner klavye3 = new Scanner(System.in);
				System.out.println("\n güncelleme yapılıyor...");
				String emailAddressUpdate,passwordUpdate;
				long idUpdate;
			
				System.out.println("güncellenek email adresini giriniz");
				emailAddressUpdate=klavye3.nextLine();
				System.out.println("güncellenek şifre  giriniz");
				passwordUpdate=klavye3.nextLine();
				System.out.println("güncellenek id numarasını giriniz");
				idUpdate=klavye3.nextLong();
				registerDto.setId(idUpdate);
				registerDto.setUserEmail(emailAddressUpdate);
				registerDto.setUserPassword(passwordUpdate);
				update(registerDto);
				break;
			
			case 4:
				System.out.println("\n Listeleme yapılıyor...");
				for( RegisterDto dto  : list()) {
					System.out.println(dto);
				}
				
				break;
			
			case 5:
				System.out.println("\n Çıkış yapılıyor");
				System.exit(0);
				break;
			
			default:
				System.out.println("Lütfen belirtilen alan sayısını giriniz.");
				break;
		}
	}
		
	}
	
	@Override
	public void create(RegisterDto registerDto) {
		this.registerDao.create(registerDto);
		System.out.println("controller create success.");
		
	}
	
	@Override
	public void update(RegisterDto registerDto) {
		this.registerDao.update(registerDto);
		System.out.println("controller update success.");
		
	}
	
	@Override
	public void delete(long id) {
		this.registerDao.delete(id);
		System.out.println("controller delete success.");
		
	}
	
	@Override
	public ArrayList<RegisterDto> list() {
		return this.registerDao.list();
	}
	
	// getter and setter
	public RegisterDto getRegisterDto() {
		return registerDto;
	}
	
	public void setRegisterDto(RegisterDto registerDto) {
		this.registerDto = registerDto;
	}
	
	public RegisterDao getRegisterDao() {
		return registerDao;
	}
	
	public void setRegisterDao(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}
	
}
