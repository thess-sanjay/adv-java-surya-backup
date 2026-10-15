package demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("c")
public class Company {

	@Value("QSP")
	private String name;
	@Value("vadapalani")
	private String loc;
	@Value("qsp@gmail.com")
	private String email;
	@Value("1234667890")
	private long phone;
	
	@Autowired
	private Employee employee;

	@Override
	public String toString() {
		return "Company [name=" + name + ", loc=" + loc + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
}
