package com.creatio.crm.application.tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.creatio.crm.application.steps.CookiesPageSteps;
import com.creatio.crm.application.steps.HomePageSteps;
import com.creatio.crm.application.steps.LoginPageSteps;
import com.creatio.crm.application.steps.SignupPageSteps;
import com.creatio.crm.framework.base.BasePage;
import com.creatio.crm.framework.utilies.ExcelUtil;

public class BaseTest extends BasePage {

	public CookiesPageSteps cookiepage = null;
	public LoginPageSteps loginpage = null;
	public SignupPageSteps signupage=null;
    public HomePageSteps homepage= null;
    
	@BeforeMethod(alwaysRun = true, dependsOnMethods = "setupbrowser")
	public void initializeWeDriverdetails() {
		WebDriver driver = getDriver();
		cookiepage = new CookiesPageSteps(driver);
		loginpage = new LoginPageSteps(driver);
		signupage= new SignupPageSteps(driver);
		homepage= new HomePageSteps(driver);
	}
	

	@DataProvider(name = "testdata")
	public String[][] testData(Method method) {
		String[][] data = ExcelUtil.readExcelData("TestData.xlsx", method.getName());
		return data;
	}
}