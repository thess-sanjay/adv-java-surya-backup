package demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CompanyConfig.class);
		
		Company c = (Company) context.getBean("c");
		
		System.out.println(c);
	}
}
