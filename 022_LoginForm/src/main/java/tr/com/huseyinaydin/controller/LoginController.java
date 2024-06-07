package tr.com.huseyinaydin.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tr.com.huseyinaydin.model.LoginForm;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@Controller
@RequestMapping("loginform.html")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String gosterLoginForm(Map<String, LoginForm> model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "loginform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String denetleLoginForm(@Valid LoginForm loginForm, BindingResult result, Map<String, LoginForm> model) {
		if (result.hasErrors()) {
			return "loginform";
		}
		String kullaniciAdi = "root";
		String parola = "toor";
		loginForm = model.get("loginForm");
		if (!loginForm.getKullaniciAdi().equals(kullaniciAdi) || !loginForm.getParola().equals(parola)) {
			return "loginform";
		}
		model.put("loginForm", loginForm);
		return "basarili";
	}
}