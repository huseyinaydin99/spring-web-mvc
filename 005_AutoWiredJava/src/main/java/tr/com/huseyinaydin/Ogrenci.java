package tr.com.huseyinaydin;

import org.springframework.beans.factory.annotation.Required;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public class Ogrenci {
	
	private String adi;
	private String soyadi;
	private Long numarasi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public Long getNumarasi() {
		return numarasi;
	}

	@Required
	public void setNumarasi(Long numarasi) {
		this.numarasi = numarasi;
	}
}