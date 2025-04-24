package com.creatio.crm.framework.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryListener implements IRetryAnalyzer {

	int count = 0;
	int repeatation = 2;

	@Override
	public boolean retry(ITestResult result) {

		if (!result.isSuccess()) {
			if (count < repeatation) {
				count++;
				return true;
			}

		}
		return false;
	}

}
