package Opportunity;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.objectrepo.CreatingNewOpportunityPage;

import genericLibraries.Autoconstant;
import genericLibraries.BaseClass;

public class TC_24 extends BaseClass {
	@Test
	 public void Opportunity() throws InterruptedException  {
		
		CreatingNewOpportunityPage create=new CreatingNewOpportunityPage(driver);
		create.notclick_mandatory(driver);
		create.sales(Autoconstant.sales10,create.getSales_txt());
		create.getSave_btn().click();
		Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
	}

}
