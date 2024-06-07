package tr.com.huseyinaydin.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

@Component("registerValidation")
public class RegisterValidation {

	public RegisterValidation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean denetle(Class<?> durum) {
		return RegisterForm.class.isAssignableFrom(durum);
	}

	public void validate(Object hedef, Errors hatalar) {
		RegisterForm registerForm = (RegisterForm) hedef;
		//ValidationUtils.rejectIfEmptyOrWhitespace(hatalar, "kullaniciAdi", "Kullanici adi bos gecilemez.");
		ValidationUtils.rejectIfEmptyOrWhitespace(hatalar, "kullaniciAdi", null, "Kullanici adi bos gecilemez.");
		String kullaniciAdi = registerForm.getKullaniciAdi();
		if (kullaniciAdi.length() < 2) {
			hatalar.reject("kullaniciAdi", "Arkadas daha çok bilgi gir.");
		}
		if (!registerForm.getParola().equals(registerForm.getParolaTekrari())) {
			hatalar.reject("parola", "Girilen parolalar ayni degil!");
		}
	}
}