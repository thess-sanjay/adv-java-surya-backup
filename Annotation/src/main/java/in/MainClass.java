package in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		Student s = (Student) context.getBean("std");
		
		s.m1();
	}
}
 