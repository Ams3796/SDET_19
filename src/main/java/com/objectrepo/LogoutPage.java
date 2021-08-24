package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	String WebDriver = null;



	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminlink;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutlink;

	

	public WebElement getAdminlink() {
		return adminlink;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	
	public void LogoutMethod()
	{
		
		adminlink.click();
		signoutlink.click();
		
	}

	
	}


