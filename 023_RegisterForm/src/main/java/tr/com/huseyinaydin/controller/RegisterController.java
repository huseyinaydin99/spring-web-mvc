package tr.com.huseyinaydin.controller;

import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tr.com.huseyinaydin.model.RegisterForm;
import tr.com.huseyinaydin.model.RegisterValidation;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@Controller
@RequestMapping("registerform.html")
public class RegisterController {

	@Autowired
	@Qualifier("registerValidation")
	private RegisterValidation registerValidation;
	
	public void setRegisterValidation(RegisterValidation registerValidation) {
		this.registerValidation = registerValidation;
	}
	
	public RegisterValidation getRegisterValidation() {
		return registerValidation;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView gosterRegisterForm() {
		RegisterForm registerForm = new RegisterForm();
		ModelAndView modelAndView = new ModelAndView("registerform");
		modelAndView.addObject("registerForm", registerForm);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String denetleRegisterForm(@Valid RegisterForm registerForm, BindingResult result, ModelAndView model) {
		registerValidation.validate(registerForm, result);
		if (result.hasErrors()) {
			return "registerform";
		}
		model.addObject("registerform", registerForm);
		return "basarili";
	}
}