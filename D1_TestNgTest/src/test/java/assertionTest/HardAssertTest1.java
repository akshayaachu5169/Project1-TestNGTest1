package assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest1 {
@Test
	public void validateTest() {
		System.out.println("---validation started---");
		
	String	Expectedresult = "google";
	String Actualresult="yahoo";
	
	Assert.assertEquals(Actualresult, Expectedresult);
	
	System.out.println("---validation completed---");
	}
	
	
}
