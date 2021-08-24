package com.practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInDynamicxpath {

	    @Test(dataProvider="getCities")
	    public void selectcities(String src,String dest) throws InterruptedException 
	    {
        
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(3000);
	    Actions a=new Actions(driver);
	    a.moveByOffset(10,10).click().perform();
	    Thread.sleep(3000);
	   
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(src);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//p[text()='"+src+"']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(dest);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//p[text()='"+dest+"']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	    Thread.sleep(3000);
	    
	    }
	    @DataProvider
		public Object[][] getCities()
		{	
		     Object[][]arr=new Object[1][2];
		     
		     arr[0][0]="BOM";
		     arr[0][1]="DEL";
		     
		     arr[1][0]="BOM";
		     arr[1][1]="PNQ";
		     
		     arr[2][0]="PNQ";
		     arr[2][1]="BLR";
		     
		    
		     
		     return arr;
		
}	
}
