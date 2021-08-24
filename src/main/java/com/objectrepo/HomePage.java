package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
        
	    public HomePage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	
     	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
		private WebElement homepg;
     	
     	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
     	private WebElement adminlink;
     	
     	@FindBy(xpath="//a[text()='Sign Out']")
     	private WebElement sign;

		public WebElement getHomepg() {
			return homepg;
		}

		public WebElement getAdminlink() {
			return adminlink;
		}

		public WebElement getSign() {
			return sign;
		}
		
		public void homemethod()
		{
			homepg.click();
//			adminlink.click();
//			sign.click();
		}
//		
		
	}


