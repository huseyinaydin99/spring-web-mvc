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

@Component("sariBas")
public class Sari implements Bas {

	public void olustur() {
		System.out.println("SARI baş robota eklendi.");
	}
}