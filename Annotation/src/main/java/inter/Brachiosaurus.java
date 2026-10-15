package inter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("b")
@Qualifier("Brachiosaurus")
@Primary
public class Brachiosaurus implements Dinosaur{
	
	@Override
	public void sound() {
		System.out.println("Hruuuuum");
	}
	
}
