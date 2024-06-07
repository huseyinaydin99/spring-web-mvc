package tr.com.huseyinaydin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.FileSystemResourceLoader;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

public class AppCalistir {

	public static void main(String[] args) {
		//Araba araba = new Araba();
		BeanFactory context = new XmlBeanFactory(new FileSystemResource("SpringBeansConfig.xml"));
		Araba araba = (Araba) context.getBean("araba");
		araba.hareketeGec();
	}
}