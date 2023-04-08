package in.sandeep.beans;

import org.springframework.stereotype.Component;

@Component("sandeep")
public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("Petrol::constructor");
	}
	

	public int start()
	{
		System.out.println("Petrol engine started..");
		
		return 1;
	}
}
