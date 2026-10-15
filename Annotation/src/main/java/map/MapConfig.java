package map;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MapConfig {

	@Bean
	public Map<String, String> m1(){
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("rajesh@gmail.com", "rajeshprabha");
		map.put("karthink@gmail.com", "karthick"); 
		map.put("alexa@gmail.com", "alexa");
		map.put("bhuva@gmail.com", "bhuva");
		
		return map;
	}
} 
