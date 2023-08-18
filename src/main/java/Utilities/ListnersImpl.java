package Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImpl implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started"+ result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed"+ result.getName());
	  }
	

}
