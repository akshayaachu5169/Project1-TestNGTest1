package parameterTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest1 {
@Test()
@Parameters({"browser","url","username","password"})
	public void loginTest(String browser, String url,String username, String password) {
		System.out.println("---open browser---" + browser);
		System.out.println("---enter url---" + url);
		System.out.println("---enter username---" + username);
		System.out.println("---enter password---" + password);
		System.out.println("---click login---");

}
	
	
	
}
