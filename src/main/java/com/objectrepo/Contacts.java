package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts {
	
	public Contacts(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contact;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement admin;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement sign;

	public WebElement getContact() {
		return contact;
	}

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getSign() {
		return sign;
	}
	
	public void contactsmethod()
	{
		contact.click();
		admin.click();
		sign.click();
	}

}