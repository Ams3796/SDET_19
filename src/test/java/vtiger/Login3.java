package vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("TY1");
		driver.findElement(By.name("website")).sendKeys("ffeef");
		driver.findElement(By.name("tickersymbol")).sendKeys("fgre");
		driver.findElement(By.xpath("//input[@style='border:1px solid #bababa;']")).sendKeys("ewqey");
		driver.findElement(By.id("employees")).sendKeys("5");
		driver.findElement(By.id("email2")).sendKeys("manitnr93@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("4567892345");
		driver.findElement(By.id("fax")).sendKeys("dscsad");
		driver.findElement(By.id("otherphone")).sendKeys("9675426677");
		driver.findElement(By.id("email1")).sendKeys("anbuamaya1996@gmail.com");
		driver.findElement(By.id("ownership")).sendKeys("rger");
		driver.findElement(By.id("siccode")).sendKeys("weifjoi");
		driver.findElement(By.name("annual_revenue")).sendKeys("4444");
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
