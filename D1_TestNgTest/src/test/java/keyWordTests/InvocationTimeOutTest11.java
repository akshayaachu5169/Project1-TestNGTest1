package keyWordTests;

import org.testng.annotations.Test;

public class InvocationTimeOutTest11 {
@Test(invocationTimeOut = 4000)//closes within 4 secs
	public void loginTest() throws InterruptedException {
	Thread.sleep(5000);
		System.out.println("---login done---");
	}

}
