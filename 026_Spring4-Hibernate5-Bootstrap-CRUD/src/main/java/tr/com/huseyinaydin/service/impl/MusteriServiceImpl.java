package tr.com.huseyinaydin.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.huseyinaydin.model.pojo.entity.Musteri;
import tr.com.huseyinaydin.repository.dao.MusteriDao;
import tr.com.huseyinaydin.service.MusteriService;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@Service
@Transactional
public class MusteriServiceImpl implements MusteriService {

	@Inject  //@Autowired
	private MusteriDao musteriDao;

	public MusteriServiceImpl() {
		System.out.println("MusteriServiceImpl");
	}
	
	@Override
	public long createMusteri(Musteri musteri) {
		return musteriDao.createMusteri(musteri);
	}

	@Override
	public Musteri updateMusteri(Musteri musteri) {
		return musteriDao.updateMusteri(musteri);
	}

	@Override
	public void deleteMusteri(long musteriId) {
		musteriDao.deleteMusteri(musteriId);
	}

	@Override
	public List<Musteri> findAllMusteri() {
		return musteriDao.findAllMusteri();
	}

	@Override
	public Musteri findMusteri(long musteriId) {
		return musteriDao.findMusteri(musteriId);
	}

	@Override
	public List<Musteri> findMusteriler(String musteriAdi) {
		return musteriDao.findMusteriler(musteriAdi);
	}
}