package vtiger_pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepo.CreateOrg;
import com.objectrepo.LoginPage;
import com.objectrepo.LogoutPage;

import genericLibraries.ReadData_propertyfile;

public class CreateOrgWithFields {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		ReadData_propertyfile prop=new ReadData_propertyfile();
        prop.readProp("UN");
		prop.readProp("PWD");
		LoginPage login=new LoginPage(driver);
		login.loginmethod(prop.readProp("UN"),prop.readProp("PWD"));
		driver.close();
		
		
		CreateOrg org=new CreateOrg(driver);
		org.createorgmethod();
		
		
		LogoutPage logout=new LogoutPage(driver);
		logout.LogoutMethod();

	}

}
