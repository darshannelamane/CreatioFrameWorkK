package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.creatio.crm.application.elements.HomePageElements;

public class HomePageSteps extends HomePageElements {
   
	public HomePageSteps(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifySignupSuccessfull()
	{
		waitForElement(homepageHeaderSignup, 50);
		Assert.assertTrue(isElementDisplayed(homepageHeaderSignup));
		log("pass", "signup successfull and created new account");
	}
	
	public void verifySinginSuccessfull()
	{
		waitForElement(homepageHeaderSignin, 20);
		Assert.assertTrue(isElementDisplayed(homepageHeaderSignin));
		log("pass", "Sign in successfull for existing account with valid user");
	}
	
}
