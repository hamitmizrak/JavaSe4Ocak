package HastaneOtamasyonu;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginRegisterController implements IDbConnectionInterface<LoginRegisterDto> {

	private LoginRegisterDto loginRegisterDto;
	private LoginRegisterDao loginRegisterDao;

	public LoginRegisterController() {
		loginRegisterDto = new LoginRegisterDto();
		loginRegisterDao = new LoginRegisterDao();
	}

	@Override
	public void create(LoginRegisterDto t) {
		this.loginRegisterDao.create(t);

	}

	@Override
	public void update(LoginRegisterDto t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(LoginRegisterDto t) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<LoginRegisterDto> list() {
		// TODO Auto-generated method stub
		return null;
	}

	// Kullanıcı adı ve şifresi doğru mu değil mi
	public Boolean isLogin(String email, String password) {

		String dbEmail = "root", dbPassword = "root";
		boolean result = false;

		if ((dbEmail.equalsIgnoreCase(email)) && (dbPassword.equalsIgnoreCase(password))) {
			System.err.println("Admin sayfasına yönlendiriliyor");
			return true;
		} else {
			System.err.println("Kullanıcı adınız veya şifreniz yanlış");
			return false;
		}

	}

	// genel işlemler
	public void commonMethod() {
		Scanner klavye = new Scanner(System.in);
		String email, password;
		int key;

		while (true) {
			System.out.println("\nLütfen emailinizi giriniz");
			email = klavye.nextLine();

			System.out.println("Lütfen şifrenizi giriniz");
			password = klavye.nextLine();

			boolean result = isLogin(email, password);

			if (result) {
				while (true) {
					System.out.println("Lütfen seçim yapınız");
					System.out.println("1-)Ekleme\n2-)Silme\n3-)Güncelle\n4-)Lİsteleme\n5-)Çıkış");
					key = klavye.nextInt();

					switch (key) {
						case 1:
							System.out.println("Ekleme yapılıyor...");
							String name, email2, password2;

							System.out.println("Lütfen ad soyad giriniz");
							klavye.nextLine();
							name = klavye.nextLine();

							System.out.println("Email giriniz");
							email2 = klavye.nextLine();

							System.out.println("Şifre giriniz");
							password2 = klavye.nextLine();

							loginRegisterDto.setNameSurname(name);
							loginRegisterDto.setEmailAddress(email2);
							loginRegisterDto.setPassword(password2);
							this.loginRegisterDao.create(loginRegisterDto);

							break;
						case 2:
							System.out.println("Silme yapılıyor...");
							System.out.println("Lütfen silinecek id giriniz");
							int id = klavye.nextInt();
							loginRegisterDto.setId(id);
							this.loginRegisterDao.delete(loginRegisterDto);
							break;
						case 3:
							System.out.println("Güncelleme yapılıyor...");
							String nameUpdate, emailUpdate, passwordUpdate;
							int updateId;

							System.out.println("Lütfen ad soyad giriniz");
							klavye.nextLine();
							nameUpdate = klavye.nextLine();

							System.out.println("Email giriniz");
							emailUpdate = klavye.nextLine();

							System.out.println("Şifre giriniz");
							passwordUpdate = klavye.nextLine();

							System.out.println("güncellenecek id giriniz");
							updateId = klavye.nextInt();

							loginRegisterDto.setId(updateId);
							loginRegisterDto.setNameSurname(nameUpdate);
							loginRegisterDto.setEmailAddress(emailUpdate);
							loginRegisterDto.setPassword(passwordUpdate);
							this.loginRegisterDao.update(loginRegisterDto);
							break;
						case 4:
							System.out.println("Listeleme yapılıyor...");
							;
							for (LoginRegisterDto temp : this.loginRegisterDao.list()) {
								System.out.println(temp);
							}
							break;
						case 5:
							System.out.println("Çıkış yapılıyor...");
							System.exit(0);
							break;

						default:
							System.out.println("Lütfen belirtilen aralıta değer giriniz");
							break;
					}
				}
			}
		}
	}

	public LoginRegisterDto getLoginRegisterDto() {
		return loginRegisterDto;
	}

	// getter and setter

	public void setLoginRegisterDto(LoginRegisterDto loginRegisterDto) {
		this.loginRegisterDto = loginRegisterDto;
	}

	public LoginRegisterDao getLoginRegisterDao() {
		return loginRegisterDao;
	}

	public void setLoginRegisterDao(LoginRegisterDao loginRegisterDao) {
		this.loginRegisterDao = loginRegisterDao;
	}

}
