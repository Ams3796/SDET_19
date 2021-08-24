package vtiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData_PropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("../SDET_19/src/test/resources/commondata.properties");	
		Properties prop = new Properties();
		prop.load(fis);
		//String value = prop.getProperty("browser");
		//System.out.println(value);
		
		
            WebDriver driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			
			driver.findElement(By.name("user_name")).sendKeys(prop.getProperty("UN"));
			driver.findElement(By.name("user_password")).sendKeys(prop.getProperty("PWD"));
			driver.findElement(By.id("submitButton")).click();

}  }
