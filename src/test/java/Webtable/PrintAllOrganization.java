package Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllOrganization {

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
			Thread.sleep(3000);
			
			List<WebElement> orgname = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
			Thread.sleep(3000);
			for(int i=0;i<orgname.size();i++)
			{
				String a = orgname.get(i).getText();
				System.out.println(a);
			}
			
			driver.close();
			
	}
	

}
