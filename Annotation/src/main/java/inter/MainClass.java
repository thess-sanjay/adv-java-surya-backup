package inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DinoConfig.class);
		
		Trex t = (Trex) context.getBean("t");
		
		Brachiosaurus b = (Brachiosaurus) context.getBean("b");
		
		System.out.println(t);
		
		System.out.println(b);
	}
}
