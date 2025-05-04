package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.creatio.crm.application.elements.LoginPageEelements;

public class LoginPageSteps extends LoginPageEelements {
	
	
	public LoginPageSteps(WebDriver diver)
	{
		PageFactory.initElements(diver, this);
	}
	public void launchTheApplication(String isValidUser)
	{
		LaunchTheAplication();
		if(isValidUser.equalsIgnoreCase("valid"))
		{
		Assert.assertEquals(getTitle(), prop.getProperty("title"));
		log("pass", "Application is launched and Title is matching");
		}
		else
		{
			Assert.assertEquals(getTitle(), prop.getProperty("titl"));
			log("pass", "Application is launched and Title is matching");
		}
	}
	
	public void verifyLoginHeader()
	{
		waitForElement(logintoyourAccountHeader, 9);
		Assert.assertEquals(getElementText(logintoyourAccountHeader), prop.getProperty("loginheader"));
		log("pass", "Login header is displayed successfully");
	}
	
	public void verifyBusinessEmailPasswordUiText()
	{
		Assert.assertEquals(getElementText(businessEmailText), prop.getProperty("businessText"));
		Assert.assertEquals(getElementText(passWordText), prop.getProperty("passwordText"));
		log("pass", "Login and password text is succsesully present");
	}
	
	public void verifyloginbtnIsDisplayedAndText()
	{
		Assert.assertTrue(isElementDisplayed(loginbutton));
		Assert.assertEquals(getElementText(loginbutton), prop.getProperty("loginButton"));
		log("pass","Login button its text displayed successfully");	
	}
	
	public void enterCredential(String userName, String password)
	{
		enterText(businessEmailTextBox, userName );
		enterText(passwordTextBox, password);
	}
	
	public void clickLogibtn()
	{
		click(loginbutton);
		log("info", "clicked on login button");
	}
	
	public void verifyerrorMessageForInvalidUser()
	{
		waitForElement(ErrorMessage, 5);
		Assert.assertTrue(isElementDisplayed(ErrorMessage));
		String errorMessage= getElementText(ErrorMessage);
		log("pass", "For invalid user erorr message is displaying the error message is :"+errorMessage);
	}

}
