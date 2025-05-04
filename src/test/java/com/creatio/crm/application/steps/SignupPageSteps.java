package com.creatio.crm.application.steps;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.creatio.crm.application.elements.SignupPageElements;
import com.creatio.crm.framework.db.commons.DbCommons.DBCommons;

public class SignupPageSteps extends SignupPageElements {

	public SignupPageSteps(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void signUpbtnDisplayed() {

		Assert.assertTrue(isElementDisplayed(signUpbtnInLoginPage));
		log("pass", "Signup button in login page is displayed");
	}

	public void clickonSignUpLink() {
		jsClick(signUpbtnInLoginPage);
		log("info", "clicked on signup button in login page");
	}

	public void verifyCreateAccountpageiSdisplayedAfterClickedonSingup() {
		waitForElement(createAccountHeaderInSignupClick, 5);
		Assert.assertTrue(isElementDisplayed(createAccountHeaderInSignupClick));
		log("pass", "CreateaccountPageIsDisplayed");
	}
	
	public void enterCredentialsToCreateNewAccount(String mail, String Pswrd) {
	    enterText(businessEmailTxtBox, uniqueId("hhmmdd")+mail);
		enterText(passwordTextbox, Pswrd);
		click(contiuebtn);

		log("info", "Business and email is enterred and clicked on continue button");
	
	}
	
	public void ClickcOnContinueButton()
	{
		click(contiuebtn);
	}
	
	public void verifyCreateFreeAccountPageiSdisplayedAfterClickedOnContinue()
	{ 
		waitForElement(createAccountHeaderClickOnContinue, 10);
		Assert.assertTrue(isElementDisplayed(createAccountHeaderClickOnContinue));
		log("pass", "create New account page is displayed successfully");
	}
	
	public void verifyLableforEachTextBoxLable()
	{
		String actual= getElementText(FirstNameLableText);
	    String expect= prop.getProperty("FirstNameTextBox");
	    Assert.assertEquals(actual, actual);
	    log("pass", "TextBoxlable is displayed correctlty");
	    
	    String actual1= getElementText(lastNameLableText);
	    String expect2= prop.getProperty("lastname");
	    Assert.assertEquals(actual1, expect2);
	    log("pass", "Lastname lable is displayed correctlty in last name text box");
	    
	    String actual3= getElementText(companyLableText);
	    String expect4= prop.getProperty("company");
	    Assert.assertEquals(actual3, expect4);
	    log("pass", "Company lable is displayed correctlty");
	    
	    String actual5= getElementText(websiteLableText);
	    String expect6= prop.getProperty("website");
	    Assert.assertEquals(actual5, expect6);
	    log("pass", "Website lable  is displayed correctlty");
	    
	    String actual7= getElementText(countrylable);
	    String expect8=prop.getProperty("country");
	    Assert.assertEquals(actual7, expect8);
	    log("pass", "country lable  is displayed correctlty");
	    
	    String actual9= getElementText(phonelableText);
	    String expect10=prop.getProperty("phone");
	    Assert.assertEquals(actual9, expect10);
	    log("pass", "phone lable  is displayed correctlty");
	    
	    
	    String actual11= getElementText(signupbtnCreateaccountpage);
	    String expect12=prop.getProperty("signup");
	    Assert.assertEquals(actual11, expect12);
	    log("pass", "Signup button lable  is displayed correctlty");   
	    
	}
	
	public void EntercompanyDetails() throws SQLException
	{
		List<Map<String,String>> data= DBCommons.readData("Select * From COMPANY_INFO");
		    enterText(FirstNameTextBox, data.get(0).get("firstname"));
		    enterText(lastNameTextBox, data.get(0).get("lastname"));
		    enterText(companyTextBox, data.get(0).get("company"));
		    enterText(websiteTextBox, data.get(0).get("website"));
		    textEnter(countryTxtbox, data.get(0).get("country"));
		    waitForElement(countryindiaOption, 5);
		    click(countryindiaOption);
		    wait(6);
		    click(phoneTextBox);
		    wait(3);
		    textEnter(phoneTextBox, "90"+uniqueId("ddMMhhmm"));
		    log("info", "Entered all the company details");
		   	}
	
	 public void CompanydetailsByselectcountryByDropdown() throws SQLException
	 {
		 List<Map<String,String>> data= DBCommons.readData("Select * From COMPANY_INFO");
		    enterText(FirstNameTextBox, data.get(0).get("firstname"));
		    enterText(lastNameTextBox, data.get(0).get("lastname"));
		    enterText(companyTextBox, data.get(0).get("company"));
		    enterText(websiteTextBox, data.get(0).get("website"));
		    selectOPtion(phoneDropDown,"visibletext","India");
		    wait(3); 
		    textEnter(phoneTextBox, "90"+uniqueId("ddMMhhmm"));
		    textEnter(countryTxtbox, data.get(0).get("country"));
		    waitForElement(countryindiaOption, 5);
		    click(countryindiaOption);
		    log("info","Entered companydetails and selected country option by using select class");
	 }
	 
	 public void selectcountrybyclicking() throws SQLException
	 {
		 List<Map<String,String>> data= DBCommons.readData("Select * From COMPANY_INFO");
		    enterText(FirstNameTextBox, data.get(0).get("firstname"));
		    enterText(lastNameTextBox, data.get(0).get("lastname"));
		    enterText(companyTextBox, data.get(0).get("company"));
		    enterText(websiteTextBox, data.get(0).get("website"));
		    click(phoneDropDown);
		    waitForElement(usoption, 4);
		    ScrollinToElement(phoneOption);
		    click(phoneOption);
		    wait(2);
		    enterText(phoneTextBox, "90"+uniqueId("ddMMhhmm"));
		    enterText(countryTxtbox, data.get(0).get("country"));
		    waitForElement(countryindiaOption, 5);
		    click(countryindiaOption);
		    log("info","Entered companydetails and selected country option by using select class");
	 }
	 
	 public void clickOnSignUpbtn()
	    {
	    	click(signupbtnCreateaccountpage);
	    }
    	
}
