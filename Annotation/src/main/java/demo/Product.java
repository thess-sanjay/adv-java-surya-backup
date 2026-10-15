package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Product {
	
	@Value("1")
	private int id;
	
	@Value("laptop")
	private String name;
	
	@Value("hp")
	private String brand;
	
	@Value("45000")
	private double price;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
