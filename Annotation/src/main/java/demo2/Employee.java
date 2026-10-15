package demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
public class Employee {
	
	@Value("Sathiya")
	private String name;
	@Value("male")
	private String gender;
	@Value("developer")
	private String job;
	@Value("15000")
	private double sal;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", job=" + job + ", sal=" + sal + "]";
	}
	
	
}
