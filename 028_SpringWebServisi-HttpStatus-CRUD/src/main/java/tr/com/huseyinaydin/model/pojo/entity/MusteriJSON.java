package tr.com.huseyinaydin.model.pojo.entity;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public class MusteriJSON  {
	String adi;
	String bilgi;

	public MusteriJSON() {
		System.out.println("MusteriJSON");
	}

	public MusteriJSON (String adi, String bilgi) {
		this.adi = adi;
		this.bilgi = bilgi;
	}

	public String getAdi() {
		return adi;
	}

	public String getBilgi() {
		return bilgi;
	}
}