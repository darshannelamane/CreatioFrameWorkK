package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.creation.crm.framwork.web.commons.Webcommons;

public class LoginPageEelements extends Webcommons {
	
	@FindBy(xpath="//span[@class='form-title']")
    public WebElement logintoyourAccountHeader;
	
	@FindBy(xpath="//label[text()='Business email']")
	public WebElement businessEmailText;
	
	@FindBy(xpath="//input[@aria-label='Business email']")
	 public WebElement businessEmailTextBox;
	
	@FindBy(xpath="//a[@plerdy-tracking-id='91341366501']")
	public WebElement forgotPasswordLink;
	
	@FindBy(xpath="//label[text()='Password']")
	public WebElement passWordText;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	public WebElement passwordTextBox;
	
	@FindBy(xpath="//span[text()=' LOG IN ']")
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
	
	@FindBy(xpath="//span[text()='Invalid email or password']")
	public WebElement ErrorMessage;
	

}
