package tr.com.huseyinaydin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@Controller
@RequestMapping("/market")
public class AnasayfaController {

	@RequestMapping(value = "/gida")
	public ModelAndView gidaReyonu() {
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		modelAndView.addObject("duyuruMesaji", "Elmalarda %50 indirim var.");
		return modelAndView;
	}

	@RequestMapping(value = "/giyim")
	public ModelAndView giyimReyonu() {
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		modelAndView.addObject("duyuruMesaji", "Eteklerde %25 indirim var.");
		return modelAndView;
	}

	@RequestMapping(value = "/giyim/kislik/palto/deri")
	public ModelAndView giyimKislikPaltoDeriReyonu() {
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		modelAndView.addObject("duyuruMesaji", "Henüz indirim yok.");
		return modelAndView;
	}
}