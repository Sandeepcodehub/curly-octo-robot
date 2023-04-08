package in.sandeep.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
   @Autowired
// @Qualifier("sandeep") // to identify bean based on the given name for DI.
	private IEngine eng;
	
	public Car() {
		System.out.println("car::constructor");
	}
	
	public void drive()
	{
		
	int	san = eng.start();
		
		if(san >= 1)
			System.out.println("Happy Journey...");
		else
			System.out.println("Engine Problem...");

	}

}
