package tr.com.huseyinaydin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tr.com.huseyinaydin.model.Kullanici;

@Controller
public class AnasayfaController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/basitForm", method = RequestMethod.GET)
	public ModelAndView basitForm() {
		ModelAndView modelAndView = new ModelAndView("basitForm");
		modelAndView.addObject("kullanici", new Kullanici());
		return modelAndView;
	}
	
	@RequestMapping(value="/formsonuc.html", method = RequestMethod.POST)
	public ModelAndView formsonuc(@ModelAttribute Kullanici kullanici, Model model) {
		ModelAndView modelAndView = new ModelAndView("formsonuc");
		modelAndView.addObject("kullanici", kullanici);
		return modelAndView;
	}
}