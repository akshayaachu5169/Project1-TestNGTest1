package keyWordTests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLogTest9 {

	@Test(priority = 1, description = "logging in for tickets")
	public void loginTest() {
		System.out.println("login done");
		Reporter.log("---login enabled---");
	}

@Test(priority = 2, description = "registration for booking air tickets")
	public void regTest() {
		System.out.println("registration done");
		Reporter.log("---registration enabled---");
	}
@Test(priority = 3, description = "booking tickets to Bangalore")
	public void bookingTest() {
		System.out.println("booking done");
		Reporter.log("---booking enabled---");
	}
@Test(priority = 4, description = "incase of cancellation")
	public void cancelTest() {
		System.out.println("cancellation done");
		Reporter.log("---cancellation enabled---");
	}
	
	
	
}
