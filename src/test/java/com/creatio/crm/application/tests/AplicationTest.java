package com.creatio.crm.application.tests;

import java.sql.SQLException;

import org.testng.annotations.Test;

public class AplicationTest extends BaseTest {

//	 (priority = 1)
//	public void VerifyCookieHeaderisDisplayed() {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//
//	}
//
//	(priority = 2, dataProvider = "testdata")
//	public void verifyCookieContentDisplayed(String expectedcontent) {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.verifyCookieContentDisplayed(expectedcontent);
//	}
//
//	  (priority = 3)
//	public void verifyCookiepopupbtnDisplayed() {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.verifyCookiesPopUpSelectionButtons();
//	}
//
//	  (priority = 4)
//	public void creatioLogoCookieBotLogoDisplayed() {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.CreatioLogoinCookiePopUp();
//		cookiepage.verifycookieBotlogo();
//
//	}
//
//	 @Test (priority = 5)
//	public void verifyswitchbuttonsDisplayed() {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.verifyCookiesPopUpSwitchButtons();
//
//	}
//
//	  (priority = 6)
//	public void clickonAllowALlAndVerifyCookiepageDisappear() {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.selectTheCookiesOption("allow all");
//		cookiepage.verifyCookiesPopUpIsClosed();
//
//	}
//
//	  (priority = 7)
//	public void clickonAllowSelectionverifyCookiepageDisappear() {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.selectTheCookiesOption("allow section");
//		cookiepage.verifyCookiesPopUpIsClosed();
//
//	}
//
//	 (priority = 8)
//	public void clickonDeneyCookiepageDisappear() {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.selectTheCookiesOption("Deny");
//		cookiepage.verifyCookiesPopUpIsClosed();
//
//	}
//
//	  (priority = 9)
//	public void verifyNeccesarybuttonisDisable() {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.verifyCookiesPopUpNecessarySwitchButtonIsDisabled();
//
//	}
//
//	  @Test(priority = 10)
//	public void clickonShowDetailsLinkVerifyshowDetailsPageDisplayed() {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.ClickShowdetails();
//		cookiepage.verifyCookiesPopUpExpandedViewPage();
//
//	}
 
//     @Test
//	  (priority = 11, dataProvider = "testdata")
//	public void verufySignupforNewuserAccount(String mail, String paswrd) throws SQLException {
//		loginpage.LaunchTheAplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.selectTheCookiesOption("allow all");
//		cookiepage.verifyCookiesPopUpIsClosed();
//		signupage.clickonSignUpLink();
//		signupage.verifyCreateAccountpageiSdisplayedAfterClickedonSingup();
//		signupage.enterCredentialsToCreateNewAccount(mail, paswrd);
//		signupage.ClickcOnContinueButton();
//		signupage.verifyCreateFreeAccountPageiSdisplayedAfterClickedOnContinue();
//		signupage.verifyLableforEachTextBoxLable();
//		signupage.EntercompanyDetails();
//		signupage.clickOnSignUpbtn();
//		homepage.verifySignupSuccessfull();
//     }
//	
// 
//	   @Test (priority = 12, dataProvider = "testdata")
//	   public void verifySignupPageWhenCountrySelectedBySelectClass(String mail, String Pswrd) throws SQLException {
//		loginpage.launchTheApplication();
//		cookiepage.verifyCookiesPopUpisDisplayed();
//		cookiepage.selectTheCookiesOption("allow all");
//		cookiepage.verifyCookiesPopUpIsClosed();
//		signupage.clickonSignUpLink();
//		signupage.verifyCreateAccountpageiSdisplayedAfterClickedonSingup();
//		signupage.enterCredentialsToCreateNewAccount(mail, Pswrd);
//		signupage.ClickcOnContinueButton();
//		signupage.verifyCreateFreeAccountPageiSdisplayedAfterClickedOnContinue();
//		signupage.verifyLableforEachTextBoxLable();
//		signupage.CompanydetailsByselectcountryByDropdown();
//		signupage.clickOnSignUpbtn();
//		homepage.verifySignupSuccessfull();
//	}
//}

	 @Test (priority = 13, dataProvider = "testdata")
	 public void verifySigninPage(String mail, String paswrd, String isValidUser) {
		loginpage.launchTheApplication("isValidUser");
		cookiepage.verifyCookiesPopUpisDisplayed();
		cookiepage.selectTheCookiesOption("allow all");
		loginpage.verifyLoginHeader();
		loginpage.verifyBusinessEmailPasswordUiText();
		loginpage.verifyloginbtnIsDisplayedAndText();
		loginpage.enterCredential(mail, paswrd);
		loginpage.clickLogibtn();

		boolean flag = false;

		if (isValidUser.equalsIgnoreCase("valid")) {
			flag = true;
		}

		if (flag) {
			homepage.verifySinginSuccessfull();
		} else {
			loginpage.verifyerrorMessageForInvalidUser();
		}

	}

}
