package tr.com.huseyinaydin.model.pojo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@XmlRootElement(name="musteri")
public class MusteriXML {

	String adi;
	String bilgi;

	public MusteriXML() {
	System.out.println("MusteriXML");
	}

	public MusteriXML(String adi, String bilgi) {
		this.adi = adi;
		this.bilgi = bilgi;
	}

	@XmlElement
	public String getAdi() {
		return adi;
	}

	@XmlElement
	public String getBilgi() {
		return bilgi;
	}
}