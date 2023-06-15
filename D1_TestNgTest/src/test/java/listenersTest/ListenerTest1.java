package listenersTest;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerTest1 implements ITestListener {


	public void onStart(ITestContext context) {
		System.out.println("program starts");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("program ends");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("program passed");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("program failed");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("program skipped");
	}
	
	
}
