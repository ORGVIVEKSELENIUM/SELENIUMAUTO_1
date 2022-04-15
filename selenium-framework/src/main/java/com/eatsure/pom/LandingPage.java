package com.eatsure.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class LandingPage {
	
	//Create object of SoftAssert	
		SoftAssert asrt=new SoftAssert();
		
		//Landing URL
		private String URL = "https://staging9-web.eatsure.com/";
		
		//Locate the location
		
		@FindBy(xpath="//*[@placeholder='Please enter your location']")
		private WebElement locationBox;
		
		//Location Selection
		@FindBy(xpath="//ul[@class='LocationListstyle__SearchResult-sc-1moizv4-0 jkofEj']/li[1]")
		private WebElement locationSelection;
		
		//Locate EatSure logo
		@FindBy(xpath="//img[@alt='Eatsure Foodcourt App']")
		private WebElement eatsureIcon;
		
		//Locate Brand logo
		@FindBy(xpath="//div[starts-with(@class,'style__BrandslideWrap-sc')]/a[1]")
		private WebElement brandIcon;
		
		
		

		//Locator of Username TextBox	
		@FindBy(id="username")
		private WebElement unTextBox;
		
		//Locator of Password Textbox	
		@FindBy(name="pwd")
		private WebElement pwdTextBox;
		
		//Locator of Login Button	
		@FindBy(xpath="//div[contains(text(),'Login')]")
		private WebElement loginButton;
		
		// Locator of Message 'Please identify yourself'	
		@FindBy(xpath="//td[contains(text(),'Please identify yourself')]")
		private WebElement identifyMsg;
		
		//Locator of Message 'Username or Password is invalid
		@FindBy(xpath="//span[contains(text(),'invalid.')]")
		private WebElement invalidMsg;
		
		public LandingPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		
		public void setUserName(String UN)
		{
			unTextBox.sendKeys(UN);
		}
		
		public void setPassword(String PWD)
		{
			pwdTextBox.sendKeys(PWD);
		}
		
		public void loginClick()
		{
			loginButton.click();
		}
		
		// Verify Please identify yourself	
		public void verifyIdentifynMsg()
		{
			
			asrt.assertTrue(identifyMsg.isDisplayed());
			asrt.assertAll();
			
		}	
		
		//Verify Invalid username password	
		public void verifyErrMsg()
		{
		
			asrt.assertTrue(invalidMsg.isDisplayed());
			asrt.assertAll();
		}
		

}
