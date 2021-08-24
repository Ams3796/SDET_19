package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericLibraries.Autoconstant;
import genericLibraries.Random_Number;
import genericLibraries.WebDriver_Utility;

public class CreatingNewOpportunityPage extends WebDriver_Utility {
	
	public CreatingNewOpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement opportunity_link;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createlink;
	
	@FindBy(name="potentialname")
	private WebElement Opportunity_name;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement Org_lookupbtn;
	
	@FindBy(name="search_text")
	private WebElement childwin_searchtxt;
	
	@FindBy(name="search")
	private WebElement childwin_searchbtn;
	
	@FindBy(xpath="//table[@class='small']/tbody/tr[2]/td[1]/a")
	private WebElement childwin_orgname;
	
	@FindBy(xpath="//input[@type='radio'][2]")
	private WebElement Group_radiobtn;
	
	@FindBy(name="assigned_group_id")
	private WebElement assigned_groupid;
	
	@FindBy(id="jscal_trigger_closingdate")
	private WebElement closing_date;
	
	@FindBy(xpath="//div[@class='calendar']/table/tbody/tr[4]/td[7]")
	private WebElement choose_date;

	@FindBy(name="sales_stage")
	private WebElement sales_txt;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement save_btn;
	
	@FindBy(xpath="//div[@class='small']/../../..//span[@class='dvHeaderText']")
	private WebElement verify_txt;

	@FindBy(xpath="//input[@value='  Cancel  ']")
	private WebElement cancel_btn;

    public WebElement getOpportunity_link() {
		return opportunity_link;
	}


	public WebElement getCreatelink() {
		return createlink;
	}

	public WebElement getOpportunity_name() {
		return Opportunity_name;
	}
	
	public WebElement getOrg_lookupbtn() {
		return Org_lookupbtn;
	}


	public WebElement getChildwin_searchtxt() {
		return childwin_searchtxt;
	}


	public WebElement getChildwin_searchbtn() {
		return childwin_searchbtn;
	}


	public WebElement getChildwin_orgname() {
		return childwin_orgname;
	}


	public WebElement getGroup_radiobtn() {
		return Group_radiobtn;
	}


	public WebElement getAssigned_groupid() {
		return assigned_groupid;
	}

	public WebElement getClosing_date() {
		return closing_date;
	}

	public WebElement getChoose_date() {
		return choose_date;
	}

    public WebElement getSales_txt() {
		return sales_txt;
	}

    public WebElement getSave_btn() {
		return save_btn;
	}
    
    public WebElement getCancel_btn() {
		return cancel_btn;
	}
	
	public WebElement getVerify_txt() {
		return verify_txt;
	}

    public void creatingOpportunity(WebDriver driver,String Opportunity_Name) throws InterruptedException {
		
		opportunity_link.click();
		createlink.click();
		Random_Number r=new Random_Number();
		int random = r.random_data();
		Opportunity_name.sendKeys(Opportunity_Name+random);
		Org_lookupbtn.click();
		switchwindow(driver,Autoconstant.Org_childwindow);
		childwin_searchtxt.sendKeys("TY");
		Thread.sleep(3000);
		childwin_searchbtn.click();
		Thread.sleep(3000);
		childwin_orgname.click(); 
		Thread.sleep(3000);
		switchwindow(driver,Autoconstant.mainwindow);
		Group_radiobtn.click();
		assigned_groupid.click();
		select_DD(2,assigned_groupid);
		closing_date.click();
		choose_date.click();
}
	public void sales(String value,WebElement element)
	{
		sales_txt.click();
		select_Dd(value, element);
	}
	
	public void notclick_mandatory(WebDriver driver) throws InterruptedException {
		opportunity_link.click();
		createlink.click();
//		Random_Number r=new Random_Number();
//		int random = r.random_data();
//		Opportunity_name.sendKeys(Opportunity_Name+random);
		Org_lookupbtn.click();
		switchwindow(driver,Autoconstant.Org_childwindow);
		childwin_searchtxt.sendKeys("TY");
		Thread.sleep(3000);
		childwin_searchbtn.click();
		Thread.sleep(3000);
		childwin_orgname.click(); 
		Thread.sleep(3000);
		switchwindow(driver,Autoconstant.mainwindow);
		Group_radiobtn.click();
		assigned_groupid.click();
		select_DD(2,assigned_groupid);
		closing_date.click();
		choose_date.click();
	}
}

		
