package genericLibraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.objectrepo.LoginPage;
import com.objectrepo.LogoutPage;


public class BaseClass implements Autoconstant
{
	public WebDriver driver;
	public static WebDriver staticdriver;
	WebDriver_Utility wu=new WebDriver_Utility();
	ReadData_propertyfile prop=new ReadData_propertyfile();
	@BeforeSuite(groups={"smokeTest","regressionTest"})
	public void jdbc_report()
	{
		System.out.println("Connection established");
	}

	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void jdbc_report2()
	{
		System.out.println("Connection disabled");
	}

	//@Parameters("Browser")
	@BeforeClass(groups={"smokeTest","regressionTest"})
	public void launch_browser() throws IOException
	{
		if(prop.readProp("browser").equalsIgnoreCase("chrome"))
			//String Browser1=System.getProperty("Browser");
			//String browser_name ="chrome";
			//if(Browser1.equalsIgnoreCase("chrome"))
		{ 
			driver=new ChromeDriver();
		}

		else if(prop.readProp("browser").equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("browser launch failed");
		}
		driver.get(prop.readProp("url"));
		staticdriver= driver;
	}


	@AfterClass(groups={"smokeTest","regressionTest"})
	void  close_browse()
	{
		driver.close();
	}

	@BeforeMethod(groups={"smokeTest","regressionTest"})
	public void login_page() throws IOException
	{
		LoginPage login=new LoginPage(driver);
		login.loginmethod(prop.readProp("UN"),prop.readProp("PWD"));
	}

	@AfterMethod(groups={"smokeTest","regressionTest"})
	public void logout_page()
	{
		LogoutPage logout=new LogoutPage(driver);
		logout.LogoutMethod();
	}

	public static String getscreenshot(String name) throws IOException 
	{

		File srcfile = ((TakesScreenshot)staticdriver).getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest = new File(destfile);
		FileUtils.copyFile(srcfile,finaldest);
		return destfile;
	}
}

