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

@Component("kirmiziBas")
public class Kirmizi implements Bas {

	public void olustur() {
		System.out.println("KIRMIZI baş robota eklendi.");
	}
}