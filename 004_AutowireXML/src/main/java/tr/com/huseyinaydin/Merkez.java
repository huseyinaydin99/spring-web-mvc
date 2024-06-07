package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Ogrenci ogrenci = context.getBean("ogrenci", Ogrenci.class);
		System.out.println(ogrenci);
		Ogrenci ogrenci2 = context.getBean("ogrenci2", Ogrenci.class);
		System.out.println(ogrenci2);
	}
}