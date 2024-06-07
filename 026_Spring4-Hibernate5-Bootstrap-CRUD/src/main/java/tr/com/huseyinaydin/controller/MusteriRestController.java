package tr.com.huseyinaydin.controller;

import tr.com.huseyinaydin.model.pojo.entity.Musteri;
import tr.com.huseyinaydin.service.MusteriService;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.inject.Inject;

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

	@RequestMapping(value = "/uretjson/listAllMusteri")
	public Musteri findAllMusteri() {
		logger.info("Tüm musteriler.");
		Musteri musteri2 = new Musteri();
		List<Musteri> musteriListe = musteriService.findAllMusteri();
		for (Musteri musteri : musteriListe) {
			logger.info("Musteri Liste:" + musteri);
			return musteri;
		}
		return musteri2;
	}
}