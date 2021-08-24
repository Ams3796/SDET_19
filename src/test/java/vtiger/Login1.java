package vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Thread.sleep(3000);
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
		
		
		
		
			

	}

}
