package retryTests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest2 implements IRetryAnalyzer {
	//ITestResult- result passed or failed
   //IRetryAnalyser - it will retry many times
	public int count =0;
	public int max=5;
	
	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			if(count<max) {
				count++;
				result.setStatus(ITestResult.FAILURE);
				return true;	
			}else {
				result.setStatus(ITestResult.FAILURE);
			}
			
			
		}else {
			result.setStatus(ITestResult.SUCCESS);
		}
		
		return false;
	}

	
	
	
}
