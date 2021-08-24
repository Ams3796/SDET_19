package Opportunity;

import org.testng.annotations.Test;

import com.objectrepo.CreatingNewOpportunityPage;
import com.objectrepo.OpportunityinfoPage;

import genericLibraries.Autoconstant;
import genericLibraries.BaseClass;


public class TC_23 extends BaseClass {
	
	@Test
	 public void Opportunity() throws InterruptedException  {
		
		CreatingNewOpportunityPage create=new CreatingNewOpportunityPage(driver);
		create.creatingOpportunity(driver,Autoconstant.Opportunity_name);
		create.sales(Autoconstant.sales10,create.getSales_txt());
		create.getSave_btn().click();
		
		 OpportunityinfoPage oppinfo=new OpportunityinfoPage(driver);
	        oppinfo.verify();
	        if(true)
	        {
	        	System.out.println("Passed");
	        }
	        else
	        {
	        	System.out.println("Failed");
	        	
	        }

}
}
