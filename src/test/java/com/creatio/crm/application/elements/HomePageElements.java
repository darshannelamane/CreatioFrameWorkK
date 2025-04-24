package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.creation.crm.framwork.web.commons.Webcommons;

public class HomePageElements extends Webcommons {

	@FindBy(xpath="//span[text()='Application Hub']")
	public WebElement homepageHeaderSignup;
	
	@FindBy(xpath="//span[text()='Users']")
	public WebElement homepageHeaderSignin;
	
}
