package com.clc.java.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener {
	 static int passCount = 0;
	 static int failCount = 0;
	 static int skipCount = 0;

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		passCount++;
		
	}

	public void onTestFailure(ITestResult result) {
		failCount++;
	}

	public void onTestSkipped(ITestResult result) {
		skipCount++;
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
