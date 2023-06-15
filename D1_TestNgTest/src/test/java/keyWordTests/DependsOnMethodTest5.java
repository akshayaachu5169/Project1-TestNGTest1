package keyWordTests;

import org.testng.annotations.Test;

public class DependsOnMethodTest5 {
@Test(priority =1)
	public void loginTest() {
		System.out.println("login done");
	}

@Test(priority = 2, dependsOnMethods="loginTest")
public void regTest() {
	int i =1/0;
	
	System.out.println("registration done");
}
@Test(priority = 3,dependsOnMethods="regTest")
public void bookingTest() {
	System.out.println("booking done");
}

@Test(priority = 4, dependsOnMethods="bookingTest")

public void cancelTest() {
	System.out.println("cancel done");
}
//countable skip

}
