package list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BatchConfig {
	
	@Bean
	public List<String> stdNames1(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("ram");
		al.add("mervin");
		al.add("rajesh");
		al.add("praveen");
		
		return al;
	}
	
	@Bean
	public List<String> stdNames2(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("rishika");
		al.add("praba");
		al.add("darwin");
		al.add("yogi");
		 
		return al;
	}

}
