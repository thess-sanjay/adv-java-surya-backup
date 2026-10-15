package list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b")
public class Batch {
	
	@Value("M27")
	private String bcode;
	@Value("Spring")
	private String subject;
	@Value("Suriya")
	private String trainer;
	@Value("10.00AM")
	private String time;
	
	@Autowired
	private List<String> stdNames;
	
	
}
