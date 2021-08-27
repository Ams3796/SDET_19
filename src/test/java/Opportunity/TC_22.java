package Opportunity;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.objectrepo.CreatingNewOpportunityPage;
import com.objectrepo.OpportunityinfoPage;

import genericLibraries.Autoconstant;
import genericLibraries.BaseClass;


public class TC_22 extends BaseClass {
		
    @Test(groups=("smokeTest"))
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
		        SoftAssert s=new SoftAssert();
		        s.assertEquals(oppinfo.getVerify_text(),"Campaign Information");
		        driver.close();
		}
		

	}

	
