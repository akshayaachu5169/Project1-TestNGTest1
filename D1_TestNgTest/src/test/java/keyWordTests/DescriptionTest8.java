package keyWordTests;

import org.testng.annotations.Test;

public class DescriptionTest8 {
	@Test(priority = 1, description = "logging in for tickets")
	public void loginTest() {
		System.out.println("login done");
	}

@Test(priority = 2, description = "registration for booking air tickets")
	public void regTest() {
		System.out.println("registration done");
	}
@Test(priority = 3, description = "booking tickets to Bangalore")
	public void bookingTest() {
		System.out.println("booking done");
	}
@Test(priority = 4, description = "incase of cancellation")
	public void cancelTest() {
		System.out.println("cancellation done");
	}
}
