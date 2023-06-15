package annotationsTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterTest3 {
	@BeforeTest
	public void networkIn() {
		System.out.println("...network login done...");
	}
	@AfterTest
	public void networkOut() {
		System.out.println("...network logout done...");
	}
	
	
	@BeforeClass
	public void loginDB() {
		System.err.println("<<<DB login done>>>");
	}

	@AfterClass
	public void logoutDB() {
		System.err.println("<<<DB logout done>>>");
	}

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
