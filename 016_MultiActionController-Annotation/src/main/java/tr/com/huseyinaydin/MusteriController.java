package tr.com.huseyinaydin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
@RequestMapping("/musteri")
public class MusteriController extends MultiActionController{

	@RequestMapping("/ekle.nigde")
	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String mesaj = "Müþteri EKLE metodu çalýþtýrýldý.";
		System.out.println(mesaj);
		//ModelAndView modelAndView = new ModelAndView("MusteriView");		
		//modelAndView.addObject("modelNesnesi", mesaj);	
		//return modelAndView;	
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	@RequestMapping("/sil.nigde")
	public ModelAndView sil(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String mesaj = "Müþteri SÝL metodu çalýþtýrýldý.";
		System.out.println(mesaj);
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
	
	@RequestMapping("/duzenle.nigde")
	public ModelAndView duzenle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String mesaj = "Müþteri DÜZENLE metodu çalýþtýrýldý.";
		System.out.println(mesaj);
		return new ModelAndView("MusteriView","musteriModelNesnesi", mesaj);
	}
}
