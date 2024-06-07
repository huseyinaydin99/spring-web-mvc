package tr.com.huseyinaydin;

import org.springframework.stereotype.Component;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@Component("lacivertBas")
public class Lacivert implements Bas {

	public void olustur() {
		System.out.println("LACİVERT baş robota eklendi.");
	}
}