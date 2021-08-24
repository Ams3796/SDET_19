package SwitchWindow;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows{
	
public static void main(String[] args) {

        	WebDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			
	    	Set<String> windows = driver.getWindowHandles();
			System.out.print(windows);
			
			Iterator<String> it = windows.iterator();
			
			if(it.hasNext())
			{
				String win = it.next();
            	System.out.println(driver.switchTo().window(win).getTitle());
				if(driver.getTitle().contains("Genpact"));
				{
					System.out.println(win);
				}
				
			}
	}
}


