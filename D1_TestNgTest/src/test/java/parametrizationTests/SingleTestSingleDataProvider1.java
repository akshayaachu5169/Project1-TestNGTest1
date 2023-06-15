package parametrizationTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleTestSingleDataProvider1 {
@Test(dataProvider = "test data")
	public void loginTest(String browser, String url, String username, String password) {
		
		System.out.println("---open browser---" + browser);
		System.out.println("---enter url---" + url);
		System.out.println("---enter username---" + username);
		System.out.println("---enter password---"+ password);
		
		}
	@DataProvider(name="test data")
	public static Object[] []getloginTest() {
	
		Object [][] data = new Object[3][4];
		
	//1st iteration
		data[0][0]="chrome";
		data[0][1]="vcentry";
		data[0][2]="Akshaya";
		data[0][3]="pass@123";
		
		//2nd iteration
		data[1][0]="firefox";
		data[1][1]="google";
		data[1][2]="Aswin";
		data[1][3]="pass@456";
		
		//3rd iteration
		data[2][0]="ie";
		data[2][1]="flipkart";
		data[2][2]="Aakash";
		data[2][3]="pass@789";
		return data;
	}
	
	
}
