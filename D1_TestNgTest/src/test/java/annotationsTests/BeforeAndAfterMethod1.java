package annotationsTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod1 {
	@BeforeMethod
	public void openbrowser() {
		System.err.println("***open browser***");
	}
	@AfterMethod
	public void closebrowser() {
		System.err.println("***close browser***");
	}
	
		@Test(priority = 1)
			public void loginTest() {
				System.out.println("login done");
			}

		@Test(priority = 2)
			public void regTest() {
				System.out.println("registration done");
			}
		@Test(priority = 3)
			public void bookingTest() {
				System.out.println("booking done");
			}
		@Test(priority = 4)
			public void cancelTest() {
				System.out.println("cancellation done");
			}
}
