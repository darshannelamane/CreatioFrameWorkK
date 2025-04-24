package com.creatio.crm.application.steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.creatio.crm.application.elements.CookiesPageElements;

public class CookiesPageSteps extends CookiesPageElements {

	public CookiesPageSteps(WebDriver driver) { // this parameterized constructor will avoid to having init element and
												// webdriver details in each e
		PageFactory.initElements(driver, this); // since its parameterized constructor with init element method it will
												// initialze webDruver details to all required method and web elements
	}

	public void verifyCookiesPopUpisDisplayed() {
		waitForElement(cookiesHeader, 30);
		Assert.assertTrue(isElementDisplayed(cookiesHeader));
		log("pass", "Cookiepop up displayed successfull");
	}

	public void verifyCookieContentDisplayed(String expectedcontent) {
		Assert.assertTrue(isElementDisplayed(cookiesContent));
		log("pass", "CookieContent is Displayed");
		String actualcontent = getElementText(cookiesContent);
		Assert.assertEquals(actualcontent, expectedcontent + " the \"About\" tab ");
		log("pass", "Corrrectcookie is displayed as per the requirement mentined in the doc");
		log("info", actualcontent);

	}

	public void verifyCookiesPopUpSelectionButtons() {
		Assert.assertTrue(isElementDisplayed(allowAllBtn));
		log("pass", "AllowAll button is Displayed Successfully");
		Assert.assertTrue(isElementDisplayed(allowSelectionBtn));
		log("pass", "Allow Section button is Displayed Successfully");
		Assert.assertTrue(isElementDisplayed(denyBtn));
		log("pass", "Deny button is Displayed Successfully");

	}

	public void verifyCookiesPopUpSwitchButtons() {
		Assert.assertTrue(isElementDisplayed(necessarySwitchtn));
		log("pass", "Neccesary switchButton is displayed succcessfully");
		Assert.assertTrue(isElementDisplayed(preferencesSwitchBtn));
		log("pass", "Preference switch is Displayed Successfully");
		Assert.assertTrue(isElementDisplayed(statisticsSwitchBtn));
		log("pass", "Statics switch button is Displayed Successfully");
		Assert.assertTrue(isElementDisplayed(marketingSwitchBtn));
		log("pass", "Marketing switch button is Displayed Successfully");
		Assert.assertTrue(isElementDisplayed(showDetailsLink));
		log("pass", "Show details switch button is Displayed Successfully");

	}

	public void verifyCookiesPopUpNecessarySwitchButtonIsDisabled() {
		Assert.assertTrue(!isElementEnabled(necessarySwitchtn));
		log("pass", "Neccasary button is displayed and its disabled");

	}

	public void selectTheCookiesOption(String option) {
		if (option.equalsIgnoreCase("Allow all")) {
			click(allowAllBtn);
		} else if (option.equalsIgnoreCase("Allow Section")) {
			click(allowSelectionBtn);
		} else if (option.equalsIgnoreCase("deny")) {
			click(denyBtn);
		}

		log("pass", "Clicked on the " + option + " button in the Cookies Pop-up");
	}

	public void verifyCookiesPopUpIsClosed() {
		waitForElementDisappeared(cookiesHeader, 30);
		log("pass", "CookiePage is Dissapered after clicking cookie button");
	}

	public void ClickShowdetails() {
		click(showDetailsLink);
		log("pass", "Clicked on show details link");
	}

	public void verifyCookiesPopUpExpandedViewPage() {
		waitForElement(cookiePopUpExpandedDetails, 10);
		log("pass", "cookiePopUp Expanded diplayed");
	}

	public void cookiesBotbtnsClick(String option) {
		if (option.equalsIgnoreCase("preference")) {
			click(preferencesSwitchBtn);
		}
		if (option.equalsIgnoreCase("static")) {
			click(statisticsSwitchBtn);
		}
		if (option.equalsIgnoreCase("marketing")) {
			click(marketingSwitchBtn);
		}
	}

	public void verifyShowDetailsLink() {
		Assert.assertTrue(isElementEnabled(showDetailsLink));
		log("Pass", "Show Details link is Enabled");
	}

	public void CreatioLogoinCookiePopUp() {
		Assert.assertTrue(isElementDisplayed(creatioLogo));
		log("Pass", "Creatio Logo is displayed successfully");
	}

	public void verifycookieBotlogo() {
		Assert.assertTrue(isElementDisplayed(cookiebotLogo));
		log("Pass", "Cookie bot Logo is displayed successfully");
	}

}
