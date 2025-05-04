package com.creatio.crm.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.creatio.crm.framework.reports.Reports;

public class BasePage extends Reports{

//	This class will going to have all common methods related to browser configuration to execute script

	private static WebDriver driver = null;

	// This method will launch thr browser based on the browser name coming from
	// runner file
	@BeforeMethod(alwaysRun = true)
	@Parameters(value = "browser")
	public void setupbrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			Assert.fail("Wrong browser");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	// to Teardown browser
   @AfterMethod
	public void tearDownBrowser() {
		driver.quit();
	}

	// This method is to utilise the driver in other required class since driver has
	// delclared encapsulation so creating public method making use of it in
	// required class
	public WebDriver getDriver() {
		return driver;
	}

	// this Method is to update or modify the new driver value from all other class
	// if navigated to different from base.
	public void setDriver(WebDriver newDriver) {
		driver = newDriver;
	}

}
