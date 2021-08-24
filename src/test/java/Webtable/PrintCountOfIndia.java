package Webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCountOfIndia {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
			driver.get("https://olympics.com/tokyo-2020/olympic-games/en/results/all-sports/medal-standings.htm");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			
            
	}

}
