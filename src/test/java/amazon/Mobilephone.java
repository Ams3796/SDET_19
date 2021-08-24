package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobilephone {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile under 15000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='Redmi']")).click();
	    driver.findElement(By.xpath("//span[text()='Featured']")).click();
		driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
		WebElement price = driver.findElement(By.xpath("//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-price-whole']"));
        System.out.println(price.getText());
        
        
	}

}
