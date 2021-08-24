package amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("headphones");
		Thread.sleep(3000);
		
	    List<WebElement> ele1 = driver.findElements(By.id("issDiv7"));
	    System.out.println(ele1.size());
	    Thread.sleep(3000);
	    
		for(WebElement b:ele1)
		{
			System.out.println(b.getText());
		}    
	    
		
		driver.close();
		
		
	}

}
