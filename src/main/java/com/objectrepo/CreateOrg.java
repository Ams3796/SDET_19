package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrg {
	
	public CreateOrg(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement orglink;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createlink;
	
	@FindBy(name="accountname")
	private WebElement accttxt;
	
	@FindBy(name="website")
	private WebElement websitetxt;
	
	@FindBy(name="tickersymbol")
	private WebElement tickertxt;
	
	@FindBy(xpath="//input[@style='border:1px solid #bababa;']")
	private WebElement membertxt;
	
	@FindBy(id="employees")
	private WebElement emptxt;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement savelink;
	

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getCreatelink() {
		return createlink;
	}

	public WebElement getAccttxt() {
		return accttxt;
	}

	public WebElement getWebsitetxt() {
		return websitetxt;
	}

	public WebElement getTickertxt() {
		return tickertxt;
	}

	public WebElement getMembertxt() {
		return membertxt;
	}

	public WebElement getEmptxt() {
		return emptxt;
	}

	
	public WebElement getSavelink() {
		return savelink;
	}
	
	public void createorgmethod() {
		
	
		orglink.sendKeys();
		createlink.click();
		accttxt.sendKeys();
		websitetxt.sendKeys();
		tickertxt.sendKeys();
		membertxt.sendKeys();
		emptxt.sendKeys();
		emptxt.sendKeys();
		savelink.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
