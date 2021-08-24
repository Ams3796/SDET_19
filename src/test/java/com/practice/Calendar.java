package com.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar {
	public static void main(String[]args) throws InterruptedException {
		Date dateobj=new Date();
		
		String currentdate=dateobj.toString();
		
		String[] arr=currentdate.split("");
		
		String day=arr[0];
		String month=arr[1];
		String todaysdate=arr[2];
		String year=arr[5];
		
		String MMT_date=day+""+month+""+todaysdate+""+year;
		System.out.println(MMT_date);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(3000);
	    Actions a=new Actions(driver);
	    a.moveByOffset(10,10).click().perform();
	    Thread.sleep(3000);
	   
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("BOM");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("BLR");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	    Thread.sleep(3000);
	    
	    int count=0;
	    while(count<=11) {
	    	try {
	    	driver.findElement(By.xpath("//div[@aria-label='Mon Nov 08 2021']")).click();
	    	
	    	
	    }
	    catch(Exception e) {
	    	driver.findElement(By.id("//span[@aria-label='Next Month']")).click();
	    	count++;
	    }
	    driver.findElement(By.id("//span[@aria-label='Next Month']")).click();
	    driver.findElement(By.id("//span[@aria-label='Next Month']")).click();
	}
}
}
