package com.creatio.crm.application.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.creation.crm.framwork.web.commons.Webcommons;

public class SignupPageElements extends Webcommons {
	
	@FindBy(xpath="//span[text()=' SIGN UP ']")
	public WebElement signUpbtnInLoginPage;

	@FindBy(xpath="//div[text()='Have an account?']")
	public WebElement createAccountHeaderInSignupClick;
	
	@FindBy(xpath="//input[@aria-label='Business email']")
	 public WebElement businessEmailTxtBox;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	 public WebElement passwordTextbox;
	
	@FindBy(xpath="//span[text()=' CONTINUE ']")
	 public WebElement contiuebtn;
	
	@FindBy(xpath="//div[@class='second-registration-step-container ng-star-inserted']//div[text()='Create a free account']")
	 public WebElement createAccountHeaderClickOnContinue;
	
	@FindBy(xpath="//label[text()='First name']")
	 public WebElement FirstNameLableText;
	
	@FindBy(xpath="//input[@aria-label='First name']")
	 public WebElement FirstNameTextBox;
	
	@FindBy(xpath="//label[text()='Last name']")
	 public WebElement lastNameLableText;
	
	@FindBy(xpath="//input[@aria-label='Last name']")
	 public WebElement lastNameTextBox;
	
	@FindBy(xpath="//label[text()='Company']")
	 public WebElement companyLableText;
	
	@FindBy(xpath="//input[@aria-label='Company']")
	 public WebElement companyTextBox;
	
	@FindBy(xpath="//label[text()='Website']")
	 public WebElement websiteLableText;
	
	@FindBy(xpath="//label[text()='Country']")
	 public WebElement countrylable;
	
	@FindBy(xpath="//input[@aria-label='Country']")
	public WebElement countryTxtbox;
	 
	@FindBy(xpath="//li[@plerdy-tracking-id='30695080901']")
	public WebElement usoption;
	
	@FindBy(xpath="//span[text()='India']")
	 public WebElement countryindiaOption;
	
	@FindBy(xpath="//label[text()='Phone ']")
	 public WebElement phonelableText;
	
	@FindBy(xpath="//input[@aria-label='Phone']")
	 public WebElement phoneTextBox;
	
	@FindBy(xpath="//div[@class='iti__selected-flag']")
	 public WebElement phoneDropDown;
	
	@FindBy(xpath="//span[text()='India (भारत)']")
	 public WebElement phoneOption;
	
	@FindBy(xpath="//input[@aria-label='Website']")
	 public WebElement websiteTextBox;
	
	@FindBy(xpath="//span[@class='back-button-icon ng-star-inserted']")
	 public WebElement backbtn;
	
	@FindBy(xpath="//span[text()=' SIGN UP ']")
	 public WebElement signupbtnCreateaccountpage;
	
	
	
	

}
