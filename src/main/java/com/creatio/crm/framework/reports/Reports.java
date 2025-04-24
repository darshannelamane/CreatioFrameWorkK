package com.creatio.crm.framework.reports;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static ExtentHtmlReporter html=null;// empty Paper to print
	public static ExtentReports extent=null; // Printer, all set configurations to print
	public static ExtentTest logger= null; // ink

	
	@BeforeSuite (alwaysRun=true) // this method is to setting up to print before execution starts, like practically before execution report should be ready to add detais
	public void SetupReport()
	{
		html= new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\"+"AutomationReport.html"); // Creating Empty html report
		extent= new ExtentReports(); //printer setting up for report like layout and all config
		extent.attachReporter(html); // linking empty reporter with all configuration to print, now its all set to print in repory
	}
	
	public void startReporting(String testcase) {
		logger = extent.createTest(testcase); // printing started
		logger.info("Test case execution started for method :" + testcase);
	}

	public void stopReporting() {
		extent.flush();
	}
}
