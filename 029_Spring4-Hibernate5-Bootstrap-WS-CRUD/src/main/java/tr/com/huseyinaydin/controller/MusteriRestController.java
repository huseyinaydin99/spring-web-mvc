package tr.com.huseyinaydin.controller;

import tr.com.huseyinaydin.model.pojo.entity.Musteri;
import tr.com.huseyinaydin.service.MusteriService;

import org.jboss.logging.Logger;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@RestController
public class MusteriRestController {

	@Inject // @Autowired
	private MusteriService musteriService;

	private static final Logger logger = Logger.getLogger(MusteriRestController.class);

	public MusteriRestController() {
		System.out.println("MusteriController()");
	}

	@RequestMapping(value = "/musteri/", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Musteri> findAllMusteriler() {
		List<Musteri> musteriler = musteriService.findAllMusteri();
		return musteriler;
	}

	@RequestMapping(value = "/musteri/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Musteri findAllMusteriler(@PathVariable("id") long id) {
		Musteri musteri = musteriService.findMusteri(id);
		return musteri;
	}
}