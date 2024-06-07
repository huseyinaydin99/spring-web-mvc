package tr.com.huseyinaydin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class AnasayfaController {
	
	@RequestMapping(value="/AnasayfaView", method = RequestMethod.GET)
	public ModelAndView selamAcilis() {
		String mesaj = "Selamlar Spring MVC ";
		return new ModelAndView("AnasayfaView", "modelNesnesiMesaj", mesaj);
	}
}