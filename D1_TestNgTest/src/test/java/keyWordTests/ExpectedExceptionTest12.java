package keyWordTests;

import org.testng.annotations.Test;

public class ExpectedExceptionTest12 {
@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void loginTest() {
	//int i =1/0;
	String a =null;
	String b=a.concat("abc");
		System.out.println("---login done---");
		
		
	}
	
}
