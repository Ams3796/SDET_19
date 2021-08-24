package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="user_name")
	private WebElement usernametxt;
	
	@FindBy(name="user_password")
	private WebElement passwordtxt;
	
	@FindBy(id="submitButton")
	private WebElement logintxt;

	public WebElement getUsernametxt() {
		return usernametxt;
	}

	public WebElement getPasswordtxt() {
		return passwordtxt;
	}

	public WebElement getLogintxt() {
		return logintxt;
	}
	
	public void loginmethod(String username,String password)
	{
		usernametxt.sendKeys(username);
		passwordtxt.sendKeys(password);
		logintxt.click();
	}
	
}
