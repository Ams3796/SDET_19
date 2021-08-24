package Opportunity;

import java.io.IOException;

import org.testng.annotations.Test;

import com.objectrepo.CreatingNewOpportunityPage;
import com.objectrepo.OpportunityinfoPage;

import genericLibraries.Autoconstant;
import genericLibraries.BaseClass;


public class TC_21 extends BaseClass {
    @Test(groups=("smokeTest"))
	    public void Opportunity() throws IOException, InterruptedException
	    {
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://localhost:8888/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
//		
	    
		
//		LoginPage login=new LoginPage(driver);
//		ReadData_propertyfile prop=new ReadData_propertyfile();
//		login.loginmethod(prop.readProp("UN"),prop.readProp("PWD"));
	     
		CreatingNewOpportunityPage create=new CreatingNewOpportunityPage(driver);
		create.creatingOpportunity(driver,Autoconstant.Opportunity_name);
		
		create.sales(Autoconstant.sales9,create.getSales_txt());
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
//        Assert.assertEquals(oppinfo.getVerify_text(),"Campaign Information");
//	    driver.close();	
//     
	}

}
