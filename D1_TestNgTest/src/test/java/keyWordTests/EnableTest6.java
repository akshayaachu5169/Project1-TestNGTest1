package keyWordTests;

import org.testng.annotations.Test;

public class EnableTest6 {
	@Test(priority = 1)
	public void loginTest() {
		System.out.println("login done");
	}

@Test(priority = 2, enabled=false)
	public void regTest() {
		System.out.println("registration done");//do not use comment option to skip
	}                                           //non countable skip
@Test(priority = 3)
	public void bookingTest() {
		System.out.println("booking done");
	}
@Test(priority = 4)
	public void cancelTest() {
		System.out.println("cancellation done");
	}
	
	
	
}
