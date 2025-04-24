package com.creatio.crm.application.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.creation.crm.framwork.web.commons.Webcommons;

public class SignupPageElements extends Webcommons {
	
	@FindBy(xpath="//span[text()=' SIGN UP ']")
	public WebElement signUpbtnInLoginPage;

	@FindBy(xpath="//div[@plerdy-tracking-id='94262047701']")
	public WebElement createAccountHeaderInSignupClick;
	
	@FindBy(xpath="//input[@plerdy-tracking-id='91655236301']")
	 public WebElement businessEmailTxtBox;
	
	@FindBy(xpath="//input[@plerdy-tracking-id='87825914101']")
	 public WebElement passwordTextbox;
	
	@FindBy(xpath="//span[@plerdy-tracking-id='60824679301']")
	 public WebElement contiuebtn;
	
	@FindBy(xpath="//div[@plerdy-tracking-id='94262047702']")
	 public WebElement createAccountHeaderClickOnContinue;
	
	@FindBy(xpath="//label[text()='First name']")
	 public WebElement FirstNameLableText;
	
	@FindBy(xpath="//input[@plerdy-tracking-id='64092108301']")
	 public WebElement FirstNameTextBox;
	
	@FindBy(xpath="//label[text()='Last name']")
	 public WebElement lastNameLableText;
	
	@FindBy(xpath="//input[@plerdy-tracking-id='52671715501']")
	 public WebElement lastNameTextBox;
	
	@FindBy(xpath="//label[text()='Company']")
	 public WebElement companyLableText;
	
	@FindBy(xpath="//input[@plerdy-tracking-id='26264823901']")
	 public WebElement companyTextBox;
	
	@FindBy(xpath="//label[text()='Website']")
	 public WebElement websiteLableText;
	
	@FindBy(xpath="//label[text()='Country']")
	 public WebElement countrylable;
	
	@FindBy(xpath="//input[@aria-label='Country']")
	public WebElement countryTxtbox;
	 
	@FindBy(xpath="//li[@plerdy-tracking-id='30695080901']")
	public WebElement usoption;
	
	@FindBy(xpath="//span[@plerdy-tracking-id='64655880201']")
	 public WebElement countryindiaOption;
	
	@FindBy(xpath="//label[text()='Phone ']")
	 public WebElement phonelableText;
	
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c81281293-8']")
	 public WebElement phoneTextBox;
	
	@FindBy(xpath="//div[@plerdy-tracking-id='55504819501']")
	 public WebElement phoneDropDown;
	
	@FindBy(xpath="//span[text()='India (भारत)']")
	 public WebElement phoneOption;
	
	@FindBy(xpath="//input[@plerdy-tracking-id='15167237101']")
	 public WebElement websiteTextBox;
	
	@FindBy(xpath="//span[@class='back-button-icon ng-star-inserted']")
	 public WebElement backbtn;
	
	@FindBy(xpath="//button[@plerdy-tracking-id='25529559701']")
	 public WebElement signupbtnCreateaccountpage;
	
	
	
	

}
