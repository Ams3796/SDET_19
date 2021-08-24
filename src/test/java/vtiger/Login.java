package vtiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.objectrepo.LoginPage;

import genericLibraries.ReadData_propertyfile;

public class Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		
		
		LoginPage login=new LoginPage(driver);
		ReadData_propertyfile prop=new ReadData_propertyfile();
        prop.readProp("UN");
		prop.readProp("PWD");
		login.loginmethod(prop.readProp("UN"),prop.readProp("PWD"));
				
		
		
		//driver.findElement(By.name("user_name")).sendKeys("admin");
		//driver.findElement(By.name("user_password")).sendKeys("admin");
		//driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("TestYantra");
		driver.findElement(By.name("website")).sendKeys("nsaakjj");
		driver.findElement(By.name("tickersymbol")).sendKeys("sdkkdh");
		driver.findElement(By.xpath("//input[@style='border:1px solid #bababa;']")).sendKeys("asgy");
		driver.findElement(By.id("employees")).sendKeys("3");
		driver.findElement(By.id("email2")).sendKeys("manitnr93@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("2345678901");
		driver.findElement(By.id("fax")).sendKeys("dscsad");
		driver.findElement(By.id("otherphone")).sendKeys("9876543210");
		driver.findElement(By.id("email1")).sendKeys("anbuamaya1996@gmail.com");
		driver.findElement(By.id("ownership")).sendKeys("isjdis");
		driver.findElement(By.id("siccode")).sendKeys("siccode");
		driver.findElement(By.name("annual_revenue")).sendKeys("456");
		WebElement dropdown = driver.findElement(By.name("industry"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		Thread.sleep(3000);
		WebElement drpdwn = driver.findElement(By.name("accounttype"));
		Select a=new Select(drpdwn);
		a.selectByVisibleText("Customer");
		Thread.sleep(3000);
		WebElement drp = driver.findElement(By.name("assigned_user_id"));
		Select b=new Select(drp);
		b.selectByIndex(0);
		WebElement dr = driver.findElement(By.name("rating"));
		Select c=new Select(dr);
		c.selectByVisibleText("Active");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		
		
		
		
		

	}

}
