package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickon_opportunity {
	
	public clickon_opportunity(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement opportunity_link;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createlink;
	
	public WebElement getOpportunity_link() {
		return opportunity_link;
	}

	public WebElement getCreatelink() {
		return createlink;
	}

	public void opportunity(WebDriver driver) {
		opportunity_link.click();
		createlink.click();
	}
	

}
