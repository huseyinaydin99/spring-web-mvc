package tr.com.huseyinaydin;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tr.com.huseyinaydin.Robot;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC
*
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("SpringBeansConfig.xml")
public class MerkezTest {
	
	@Inject //@Autowired
	private Robot robot;
	
	@Test
	public void enjeteDurumu() {
		robot.takilanBasBilgisi();
	}	
}