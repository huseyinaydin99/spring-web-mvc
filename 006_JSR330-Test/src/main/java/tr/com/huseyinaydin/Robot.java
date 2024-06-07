package tr.com.huseyinaydin;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@Component("robot")
@Scope("prototype")
public class Robot {
	
	//JSR-330
	@Inject  			   //@Autowired   
	@Named("lacivertBas")  //@Qualifier("lacivertBas")
	private Bas bas;
	
	public Robot() {
		System.out.println("Robotun düğmesine basıldı.");
	}
	
	public void takilanBasBilgisi() {
		bas.olustur();
	}
}