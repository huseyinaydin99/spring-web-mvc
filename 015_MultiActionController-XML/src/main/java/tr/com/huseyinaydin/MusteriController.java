package tr.com.huseyinaydin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public class MusteriController extends MultiActionController{

	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String mesaj = "Müşteri EKLE metodu çalıştırıldı.";
		System.out.println(mesaj);
		//ModelAndView modelAndView = new ModelAndView("MusteriView");		
		//modelAndView.addObject("modelNesnesi", mesaj);	
		//return modelAndView;	
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	public ModelAndView sil(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String mesaj = "Müşteri SİL metodu çalıştırıldı.";
		System.out.println(mesaj);
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	public ModelAndView duzenle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String mesaj = "Müşteri DÜZENLE metodu çalıştırıldı.";
		System.out.println(mesaj);
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
}