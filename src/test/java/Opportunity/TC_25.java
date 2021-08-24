package Opportunity;

import org.testng.annotations.Test;

import com.objectrepo.CreatingNewOpportunityPage;

import genericLibraries.Autoconstant;
import genericLibraries.BaseClass;

public class TC_25 extends BaseClass {

	@Test
	public void Opportunity() throws InterruptedException  {
		
		CreatingNewOpportunityPage create=new CreatingNewOpportunityPage(driver);
		create.creatingOpportunity(driver,Autoconstant.Opportunity_name);
		create.sales(Autoconstant.sales10,create.getSales_txt());
		create.getCancel_btn().click();
		
	}
	

}
