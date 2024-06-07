package tr.com.huseyinaydin;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/market")
public class AnasayfaController {

	@RequestMapping(value = "/{turu}/{oran}", method = RequestMethod.GET)
	public ModelAndView gidaReyonu(@PathVariable Map<String, String> vals) { 
		System.out.println("metot çalıştı");
		String turu = vals.get("turu").toString();
		String oran = vals.get("oran").toString();
		System.out.println(turu + " " + oran);
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		if(sayiDenetimi(oran)){
			oran = "0";
		}
		String duyuruMesaji;	
		if(0 < Integer.valueOf(oran) ){
			duyuruMesaji = "<br /> <b> Türü: </b>  "  + turu.toUpperCase() + 
					       "<br /> <b> İndirim Oranı :</b>  %"  + oran;
		}else{
			duyuruMesaji = "<br /> <b> Türü: </b>  "  + turu.toUpperCase() + 
				           "<br /> <b style = background-color:#F6CECE> Henüz bir indirim yok.</b> ";
		}	
		modelAndView.addObject("duyuruMesaji", duyuruMesaji);
		return modelAndView;
	}
	
	public static boolean sayiDenetimi(String gelenDeger) {
		for(char ch: gelenDeger.toCharArray()){
			if (Character.isDigit(ch)) {
				return false;
			}
		}	
		return true;
	}
}