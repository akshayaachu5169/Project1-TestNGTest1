package assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest2 {
@Test
	public void validateTest() {
		System.out.println("---validation started---");
		
	String	Expectedresult = "google";
	String Actualresult="googl";
	
	SoftAssert s = new SoftAssert();
	s.assertEquals(Actualresult,Expectedresult );
	
	System.out.println("---validation completed---");
	s.assertAll();//used for report generation
	//it should be given at last
}
}