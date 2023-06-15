package failedCaseExecution;

import org.testng.annotations.Test;

public class SampleFailedCaseTest {
	
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
			int i =1/0;
				System.out.println("booking done");
			}
		@Test(priority = 4)
			public void cancelTest() {
				System.out.println("cancellation done");
				}

	}

	
	
	
	

