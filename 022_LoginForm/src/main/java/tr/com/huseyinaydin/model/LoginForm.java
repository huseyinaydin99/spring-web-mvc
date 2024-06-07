package tr.com.huseyinaydin.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public class LoginForm {

	@NotEmpty
	@Size(min = 1, max = 100)
	private String kullaniciAdi;

	@NotEmpty
	@Size(min = 1, max = 8)
	private String parola;

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
}