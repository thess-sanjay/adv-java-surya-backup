package com;

import org.springframework.stereotype.Component;

@Component("e1")
public class Employee {
	public Employee() {
		System.out.println("Employee class Constructor called!!!");
	}
	
	public void m1() {
		System.out.println("Hello World!!!");
	}
}
