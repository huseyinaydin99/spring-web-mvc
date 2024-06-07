package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public class Adres {

	private String acikAdresBilgisi;
	//private String semt, ilce,....

	public String getAcikAdresBilgisi() {
		return acikAdresBilgisi;
	}

	public void setAcikAdresBilgisi(String acikAdresBilgisi) {
		this.acikAdresBilgisi = acikAdresBilgisi;
	}

	@Override
	public String toString() {
		return acikAdresBilgisi;
	}
}