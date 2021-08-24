package genericLibraries;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriver_Utility {
	
    /**
     * It's going to select the dropdown based on theindex
     * @param element
     * @param value
     */
	public void select_DD(int index,WebElement element)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * It's going to select the dropdown based on value 
	 * @param value
	 * @param element
	 */
	public void select_Dd(String value,WebElement element)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * It's going to select the dropdown based on index
	 * @param element
	 * @param index
	 */
	public void select_DD(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	
	public void actions(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element);
	}
	
	public void actions(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.doubleClick();
	}
	
	public void actions1(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.contextClick();
		
	}
	
	public void random() {
	Random r=new Random();
	int ran=r.nextInt(1000);
	System.out.println(ran);
	}

	/**
	 * It switches the frame based on index
	 * @param driver
	 * @param index
	 */
	public void switchframe(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * It switches the frame based on nameorId
	 * @param driver
	 * @param nameorId
	 */
	public void switchframe(WebDriver driver,String nameorId)
	{
		driver.switchTo().frame(nameorId);
	}
	
	/**
	 * It switches the frame based on the element
	 * @param driver
	 * @param element
	 */
	public void switchframe(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * It's going to perform mousehover action
	 * @param driver
	 * @param element
	 */
	public void movetoelement(WebDriver driver,WebElement element) 
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();;
	}
	
	/**
	 * It's going to perform double click action
	 * @param driver
	 * @param element
	 */
	public void doubleclick(WebDriver driver,WebElement element) 
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();;
	}
	
	/**
	 * It's going to perform rightclick action
	 * @param driver
	 * @param element
	 */
	public void contextclick(WebDriver driver,WebElement element) 
	{
		Actions a=new Actions(driver);
		a.contextClick(element).perform();;
	}
	
	/**
	 * It's going to perform drag and drop action
	 * @param driver
	 * @param element
	 */
	public void draganddrop(WebDriver driver,WebElement src,WebElement dest) 
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).perform();;
	}

	/**
	 * This method will wait until the specified time or until it finds the element
	 * @param driver
	 */
	public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Autoconstant.implicitwait,TimeUnit.SECONDS);
	}
	
	/**
	 * This method will wait until the specified time is over or until it finds the element
	 * @param driver
	 */
    public void visibleelement(WebDriver driver,WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver,Autoconstant.explicitwait);
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
    /**
     * It will wait until the specified time or until it finds the element
     * @param driver
     * @param element
     */
	public void elementclikable(WebDriver driver,WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Autoconstant.explicitwait);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * It switches the window base on title
	 * @param driver
	 * @param title
	 */
	public void switchwindow(WebDriver driver,String title)
	{
		Set<String> win = driver.getWindowHandles();
		Iterator<String> iterator = win.iterator();
		
		while(iterator.hasNext())
		{
			String window = iterator.next();
			String currenttitle = driver.switchTo().window(window).getTitle();
			if(currenttitle.contains(title))
			{
				break;
			}
		}
	}
}

	
	
