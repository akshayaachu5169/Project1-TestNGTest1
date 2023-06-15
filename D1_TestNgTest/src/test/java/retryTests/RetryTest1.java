package retryTests;

import org.testng.annotations.Test;

public class RetryTest1 {
@Test(retryAnalyzer = RetryTest2.class)
	public void retryTest() {
		System.out.println("---program initiated---");
		int i=1/0;
		System.out.println("---program closed---");
	}
	
	
}
