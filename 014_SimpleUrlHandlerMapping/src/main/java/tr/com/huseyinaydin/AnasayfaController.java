package tr.com.huseyinaydin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public class AnasayfaController extends AbstractController{
	//yol: http://localhost:8080/014_SimpleUrlHandlerMapping/*/anasayfa.htm
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("sayfa", "Anasayfa");	
		return modelAndView;
	}
}