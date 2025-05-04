package com.creation.crm.framwork.web.commons;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.creatio.crm.framework.base.BasePage;
import com.creatio.crm.framework.reports.Reports;
import com.creatio.crm.framework.utilies.PropUtil;


public class Webcommons {

	// This is the class will have all the common automation methods using selenium

	// This object creation is to have the driver from the base class and to launch
	// the browser
	public WebDriver driver = new BasePage().getDriver();

	// to launch browser getting URL (here if we want to give multiple url link we
	// can use paramenter feature so we can pass the multiple url in.xml file)
	public Properties prop = PropUtil.readData("Config.properties");// here it will return the loaded property or URL in to
																// prop

	public void LaunchTheAplication() {
		driver.get(prop.getProperty("url"));
	}

	// Method to scrollinTOElement
	public void ScrollinToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", element);
	}

	// Method to click
	public void click(WebElement element) {
		ScrollinToElement(element);
		element.click();
	}

	// method to click hidden element
	public void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	// method to double click
	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
		
	}

	// method to enter values in to textBox
	public void enterText(WebElement textBox, String value) {
		ScrollinToElement(textBox);
		textBox.clear();
		textBox.sendKeys(value);
	}

	// method to enter Textvalue for suggestion using action class
	public void textEnter(WebElement textBox, String Textvalue) {
		ScrollinToElement(textBox);
		textBox.clear();
		Actions action = new Actions(driver);
		action.sendKeys(textBox, Textvalue).perform();
	}

	// Method to select CheckBox
	public void checkBox(WebElement checkBox) {
		ScrollinToElement(checkBox);
		if (!checkBox.isSelected()) {
			checkBox.click();
		}
	}

	// method to select DropDown
	public void selectOPtion(WebElement dropdown, String selectby, String option) {
		ScrollinToElement(dropdown);
		Select s = new Select(dropdown);
         
		if (selectby.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(option);
		}

		else if (selectby.equalsIgnoreCase("value")) {
			s.selectByValue(option);
			
		} else if (selectby.equalsIgnoreCase("index")) {

			s.selectByIndex(Integer.parseInt(option));
		}
	}

	// method to wait
	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// method to wait using implicit wait= wait for element
	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	// method to wait using explicit wait= wait for element till visibility
	public void waitForElement(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// method to wait using explicit wait= wait for element
	public void waitForElement(By locator, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, 0));
	}

	// method to wait using explicit wait= Wait for element to dissapper
	public void waitForElementDisappeared(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	// method to take windowscreenshot
	public static String takeWindowScreenshot(WebDriver driver, String ScreenshotNameAnd) throws IOException {
		String filepath = System.getProperty("user.dir") + "\\Screenshots\\" + ScreenshotNameAnd + "png";
		File screensshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screensshot, new File(filepath));

		return filepath;
	}
       // method to take ElementScreemshot
	   public static String takeElementScreenshot(WebElement element, String ScreenshotName) throws IOException
	   {
		   String filepath= System.getenv("user.dir") +"\\Screenshots\\"+ScreenshotName+"png";
		   File screenshot= element .getScreenshotAs(OutputType.FILE);
		   
		   FileUtils.copyFile(screenshot, new File(filepath));
		   
		   return filepath;
	   }
	   
	   // Get element text method
	   public String getElementText(WebElement element)
	   { 
		  ScrollinToElement(element);
		  return element.getText();
	   }
	   
	   // Get the Window title of the specific tab
	   public String getTitle()
	   {
		  return driver.getTitle();
	   }
	   
	   // method to get attribute value
	   
	   public String attributeValue(WebElement element, String attribute)
	   {
		   return element.getAttribute(attribute);
	   }
	   
	   // method switch to allert and accept it
	   public void switchToAlertAccept()
	   {
		   Alert alert= driver.switchTo().alert();
		   alert.accept();
	   }
	   
	   // method switch to allert and dismiss it
	     public void switchToAlertDismiss()
	     {
	    	 Alert alert= driver.switchTo().alert();
	    	 alert.dismiss();
	     }
	   
	     // method for switch to allert and Get text
	     public String getAlertText()
	     {
	    	 Alert alert= driver.switchTo().alert();
	    	 return alert.getText();
	     }
	     
	     // method switch to frame by index
	     public void switchToFrame(int index)
	     {
	    	 driver.switchTo().frame(index);
	     }
	     
	     // method switch to frame by id or name
	     public void switchToFrame(String idOrName)
	     {
	    	 driver.switchTo().frame(idOrName);
	     }
	    
	     // method switch to frame by framElement
	     public void switchToFrame(WebElement frameElement)
	     {
	    	 driver.switchTo().frame(frameElement);
	     }
	     
	     //method to get current window handle 
	     public String getWindowHandle()
	     {
	    	 return driver.getWindowHandle();
	    	 
	     }
	     
	     //method to get window handle for all window
	     public  Set<String> getWindowHandles()
	     {
	    	 return driver.getWindowHandles();
	    	 
	     }
	     
	  //method switch to required window
	     public void switchToWindow(String handle)
	     {
	    	 driver.switchTo().window(handle);
	     }
	     
	     //Method to verify window title
	     public String windowTitle()
	     {
	    	 return driver.getTitle();
	     }
	     
	     // method to get the Current URL
	     public String getCurrentUrl()
	     {
	    	 return driver.getCurrentUrl();
	     }
	     
	     // switch to the default winddow
	     public void switchToDefaultContent()
	     {
	    	 driver.switchTo().defaultContent();
	     }
	     
	  // generate unique id
	 	public String uniqueId(String format) {
	 		SimpleDateFormat sdf = new SimpleDateFormat(format);
	 		String uniqueId = sdf.format(Calendar.getInstance().getTime());
	 		return uniqueId;
	 	}
	 	
	 	// method is Element is enabled
	 	public boolean isElementEnabled(WebElement element)
	 	{
	 		return element.isEnabled();
	 	}
	     
	 //method for is Element is enabled
	 	 	public boolean isElementDisplayed(WebElement element)
	 	 	{
	 	 		ScrollinToElement(element);
	 	 		return element.isDisplayed();
	 	 	}
	 	 	
	 	// Method to print messages with in the report
	 		public void log(String status, String message) {
	 			if (status.equalsIgnoreCase("pass"))
	 				Reports.logger.pass(message);
	 			else if (status.equalsIgnoreCase("fail"))
	 				Reports.logger.fail(message);
	 			else if (status.equalsIgnoreCase("warning"))
	 				Reports.logger.warning(message);
	 			else if (status.equalsIgnoreCase("info"))
	 				Reports.logger.info(message);
	 		}
	 		
	 		// Method to add screenshot in report
	 		public void addScreenshot(WebElement element, String screenshotName) {
	 			try {
	 				Reports.logger.addScreenCaptureFromPath(takeElementScreenshot(element, screenshotName));
	 			} catch (IOException e) {
	 				e.printStackTrace();
	 			}
	 		}
	 		
}
