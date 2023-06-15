package parametrizationTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

//used in rare cases
public class MultipleTestSingleDataProvider3 {
	String browser;
	String url;
	String username;
	String password;
	String ticket1;
	String ticket2;
@Factory(dataProvider ="test data")
	 MultipleTestSingleDataProvider3(String browser, String url, String username, String password, String ticket1,
			String ticket2) {
		this.browser = browser;
		this.url = url;
		this.username = username;
		this.password = password;
		this.ticket1 = ticket1;
		this.ticket2 = ticket2;
	}

	@Test(priority = 1)
	public void loginTest() {

		System.out.println("---open browser---" + browser);
		System.out.println("---enter url---" + url);
		System.out.println("---enter username---" + username);
		System.out.println("---enter password---" + password);

	}

	@Test(priority = 2)
	public void bookingTest() {
		System.err.println("---navigate to booking page---");
		System.out.println("---book Ticket1---" + ticket1);
		System.out.println("---book Ticket2---" + ticket2);
		System.err.println("---Booking done---");
	}

	@DataProvider(name = "test data")
	public static Object[][] getbookingTest() {
		Object[][] data = new Object[3][6];
		// 1st iteration
		data[0][0] = "chrome";
		data[0][1] = "vcentry";
		data[0][2] = "Akshaya";
		data[0][3] = "pass@123";
		data[0][4] = "air ticket1";
		data[0][5] = "air ticket2";

		// 2nd iteration
		data[1][0] = "firefox";
		data[1][1] = "google";
		data[1][2] = "Aswin";
		data[1][3] = "pass@456";
		data[1][4] = "bus ticket1";
		data[1][5] = "bus ticket2";

		// 3rd iteration
		data[2][0] = "ie";
		data[2][1] = "flipkart";
		data[2][2] = "Aakash";
		data[2][3] = "pass@789";
		data[2][4] = "train ticket1";
		data[2][5] = "train ticket2";

		return data;
	}
}
