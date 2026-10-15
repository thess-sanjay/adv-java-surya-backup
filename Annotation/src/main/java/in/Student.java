package in;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("std")
@Scope("prototype")
public class Student {
	
	public void m1() {
		System.out.println("Hello World");
	}
}
