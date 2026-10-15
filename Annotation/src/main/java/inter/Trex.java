package inter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t")
@Qualifier("trex")


public class Trex implements Dinosaur{
	public void sound() {
		System.out.println("Rumbles and Booming sounds");
	}
}
