package amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']"));
		//driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li[2]")).click();
		//driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		//driver.findElement(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li[3]")).click();
		for(WebElement b:ele)
		{
			System.out.print(b.getText());
		
			if(b.getText().equals("Cards"))
				{
					b.click();
				}}
		driver.close();
	
	}
	}
		
		
		




