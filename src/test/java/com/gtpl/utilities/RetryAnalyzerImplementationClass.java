package com.gtpl.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementationClass implements IRetryAnalyzer {

	int limit = 3;
	int count = 1;
	public boolean retry(ITestResult result) {
		
		while(limit>=count) {
			count++;
			return true;
		}
		
		return false;
	}

}
