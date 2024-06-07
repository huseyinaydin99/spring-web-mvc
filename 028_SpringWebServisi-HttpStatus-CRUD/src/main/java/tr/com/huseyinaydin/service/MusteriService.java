package tr.com.huseyinaydin.service;

import java.util.List;

import tr.com.huseyinaydin.model.pojo.entity.Musteri;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public interface MusteriService {
	Musteri findById (long id);
	Musteri findByAdi (String adi);
	List<Musteri> findAllMusteriler ();
	boolean isMusteriExist (Musteri musteri); 
	void saveMusteri (Musteri musteri);
	void updateMusteri (Musteri musteri);
	void deleteMusteriById (long id);
	void deleteAllMusteriler ();
}