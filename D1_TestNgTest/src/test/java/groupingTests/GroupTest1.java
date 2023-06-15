package groupingTests;

import org.testng.annotations.Test;

public class GroupTest1 {
	@Test(priority = 1, groups = {"booking", "cancel","reg"})
	public void loginTest() {
		System.out.println("login done");
	}

@Test(priority = 2, groups = {"booking","reg"})
	public void regTest() {
		System.out.println("registration done");
	}
@Test(priority = 3, groups = {"booking", "cancel"})
	public void bookingTest() {
		System.out.println("booking done");
	}
@Test(priority = 4, groups= "cancel")
	public void cancelTest() {
		System.out.println("cancellation done");
		}
}
