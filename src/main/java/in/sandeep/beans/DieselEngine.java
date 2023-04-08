package in.sandeep.beans;

import org.springframework.stereotype.Component;

@Component("eng")
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("Diesel::constructor");
	}
	
	public int start()
	{
		System.out.println("Diesel engine started..");
		
		return 1;
	}
	

	
}
