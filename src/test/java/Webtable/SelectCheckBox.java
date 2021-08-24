package Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver=new ChromeDriver();
			driver.get("http://localhost:8888/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.findElement(By.name("user_name")).sendKeys("admin");
			Thread.sleep(3000);
			driver.findElement(By.name("user_password")).sendKeys("admin");
			Thread.sleep(3000);
			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Organizations")).click();
			Thread.sleep(3000);
			
			List<WebElement> chkbox=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/input"));
			
				int count =0;
				System.out.println(chkbox.size());
					for (int i = 3; i <= chkbox.size(); i++)
					{
						driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+i+"]/td[1]/input")).click();
						count++;
					}
					  System.out.println(count);
			
			driver.close();

	}

}
