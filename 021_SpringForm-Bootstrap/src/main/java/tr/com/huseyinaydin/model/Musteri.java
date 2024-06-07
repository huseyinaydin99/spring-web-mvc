package tr.com.huseyinaydin.model;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Web MVC
 *
 */

public class Musteri {
	private String musteriAdi;
	private String musteriSoyadi;
	private String musteriEposta;

	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	public String getMusteriSoyadi() {
		return musteriSoyadi;
	}

	public void setMusteriSoyadi(String musteriSoyadi) {
		this.musteriSoyadi = musteriSoyadi;
	}

	public String getMusteriEposta() {
		return musteriEposta;
	}

	public void setMusteriEposta(String musteriEposta) {
		this.musteriEposta = musteriEposta;
	}
}