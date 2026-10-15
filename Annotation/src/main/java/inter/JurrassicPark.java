package inter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("j")
public class JurrassicPark {
	
	@Autowired
	@Qualifier("trex")
	Dinosaur d1;
	
	@Autowired
	@Qualifier("Brachiosaurus")
	Dinosaur d2;
	
	public void getDinosaurSound() {
		d1.sound();
		
		d2.sound();
	}
	
	
}
