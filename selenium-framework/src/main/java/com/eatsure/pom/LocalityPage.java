package com.eatsure.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class LocalityPage {
SoftAssert asrt=new SoftAssert();
	
	//Locator of LogOut button	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logoutButton;
	
	//Locator of HelpMenu
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement helpLink;
	
	//Locator of About Actitime
	@FindBy(xpath="//a[contains(text(),'About actiTIME')]")
	private WebElement aboutActitime;
	
	//Locator of Close Button	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closeButton;
	
	//Locator of Number of users
	@FindBy(xpath="//td[contains(text(),'Number of Users')]")
	private WebElement numberOfUser;
	
	public LocalityPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout()
	{
		logoutButton.click();
	}
	
	public void clickHelpMenu()
	{
		helpLink.click();
	}
	
	public void clickAboutActitime()
	{
		aboutActitime.click();
	}
	
	public void clickClose()
	{
		closeButton.click();
	}
	
	//verify Log out Button display
	
	public void verifyLogout()
	{
		asrt.assertTrue(logoutButton.isDisplayed());
		
		asrt.assertAll();
		
	}
	
	public void verifyPOPUP()
	{
		asrt.assertTrue(numberOfUser.isDisplayed());
		
		asrt.assertAll();
		
	}
	
	public void verifyCloseButton()
	{
		asrt.assertTrue(closeButton.isDisplayed());
		asrt.assertAll();
	}
	
}
