package tr.com.huseyinaydin.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.com.huseyinaydin.model.pojo.entity.MusteriJSON;
import tr.com.huseyinaydin.model.pojo.entity.MusteriXML;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@RestController
public class DepoTakipController {
	
	@RequestMapping("/uretjson/{musteriadi}")
	public MusteriJSON uretjson(@PathVariable("musteriadi") String musteriadi) {		
		MusteriJSON sonucjson = new MusteriJSON(musteriadi, "JSON "+ musteriadi);
		return sonucjson;
	}
	
	@RequestMapping("/uretxml/{musteriadi}")
	public MusteriXML uretxml(@PathVariable("musteriadi") String musteriadi) {		
		MusteriXML sonucxml = new MusteriXML(musteriadi, "XML "+ musteriadi);
		return sonucxml;
	}  
}