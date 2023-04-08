package in.sandeep.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class ElectricEngine implements IEngine {

	public ElectricEngine() {
		System.out.println("Electric::constructor");
	}
	
	public int start()
	{
		System.out.println("Electric engine started..");
		
		return 1;
	}
}
