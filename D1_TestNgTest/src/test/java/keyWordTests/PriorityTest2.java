package keyWordTests;

import org.testng.annotations.Test;

public class PriorityTest2 {
	@Test(priority = -1)
	public void networkTest() {
		System.out.println("network done");
	}
	
	@Test(priority = 0)
	public void DBTest() {
		System.out.println("DB done");
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
