package map;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a")
public class Application {
	
	@Value("Zomoto")
	private String name;
	@Value("Zomoto")
	private String company;
	@Value("food")
	private String category;
	@Value("50MB")
	private String size;
	@Value("4.5")
	private double rating;
	
	@Autowired
	private Map<String, String> userdetails;   
}