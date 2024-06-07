package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public class Araba {
	
	private Yakit yakit;
	
	public Araba() {
		this.yakit = new Yakit();
	}

	public void hareketeGec() {
		yakit.depo();
		System.out.println("Araba harekete geçti.");
	}
}