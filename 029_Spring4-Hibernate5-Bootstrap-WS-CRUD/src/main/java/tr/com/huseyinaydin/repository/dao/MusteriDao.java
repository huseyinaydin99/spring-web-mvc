package tr.com.huseyinaydin.repository.dao;

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

public interface MusteriDao {
    public long createMusteri(Musteri musteri);
    public void deleteMusteri(long musteriId);
    public Musteri updateMusteri(Musteri musteri);
    public List<Musteri> findAllMusteri();
    public Musteri findMusteri(long musteriId);
    public List<Musteri> findMusteriler(String musteriAdi);
}