package HastaneOtamasyonu;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "loginRegister")
@SessionScoped
public class LoginRegisterDto implements Serializable {
	private static final long serialVersionUID = 8688405085910045789L;

	// nesne değişkenleri
	private long id;
	private String nameSurname;
	private String emailAddress;
	private String password;

	// parametresiz constrcutor
	public LoginRegisterDto() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constrcutor
	public LoginRegisterDto(long id, String nameSurname, String emailAddress, String password) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	// parametreli constrcutor
	public LoginRegisterDto(String nameSurname, String emailAddress, String password) {
		super();
		this.nameSurname = nameSurname;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	// toString

	@Override
	public String toString() {
		return "LoginRegister [id=" + id + ", nameSurname=" + nameSurname + ", emailAddress=" + emailAddress
				+ ", password=" + password + "]";
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
