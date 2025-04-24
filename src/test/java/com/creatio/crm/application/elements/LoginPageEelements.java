package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.creation.crm.framwork.web.commons.Webcommons;

public class LoginPageEelements extends Webcommons {
	
	@FindBy(xpath="//span[@class='form-title']")
    public WebElement logintoyourAccountHeader;
	
	@FindBy(xpath="//label[@plerdy-tracking-id='32605838501']")
	public WebElement businessEmailText;
	
	@FindBy(xpath="//input[@id='6fcf3b7d-1abf-12aa-3e7c-5113c368b669']")
	 public WebElement businessEmailTextBox;
	
	@FindBy(xpath="//a[@plerdy-tracking-id='91341366501']")
	public WebElement forgotPasswordLink;
	
	@FindBy(xpath="//label[@plerdy-tracking-id='14046468001']")
	public WebElement passWordText;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	public WebElement passwordTextBox;
	
	@FindBy(xpath="//button[@plerdy-tracking-id='31811135501']")
	public WebElement loginbutton;
	
	@FindBy(xpath="//img[@class='icon-LinkedIn']")
	public WebElement linkedInIcon;
	
	@FindBy(xpath="//img[@class='icon-google']")
	public WebElement googleIcon;
	
	@FindBy(xpath="//img[@class='icon-facebook']")
	public WebElement facebookIcon;
	
	@FindBy(xpath="//span[text()='Don’t have an account?']")
	public WebElement signUpHeader;
	
	@FindBy(xpath="//span[text()=' SIGN UP ']")
	public WebElement signUpLink;
	
	@FindBy(xpath="error message")
	public WebElement ErrorMessage;
	

}
