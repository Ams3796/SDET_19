package vtiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData_Excel {

	public static void main(String[] args) throws  IOException   {
		
		FileInputStream fis = new FileInputStream("../SDET_19/src/test/resources/Excel.xlsx");
		
		//String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		//System.out.println(value);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		//int rw = sh.getLastRowNum();
		//System.out.println(rw);
		
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		
		 WebDriver driver=new ChromeDriver();
			driver.get(cell.getStringCellValue());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			
			driver.findElement(By.name("user_name")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.name("user_password")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.id("submitButton")).click();
		
//		Row row = sh.getRow(2);
//		Cell cell = row.getCell(0);
//		double Val = cell.getNumericCellValue();
//		System.out.println(Val);
		
//		String c = cell.toString();
//		System.out.println(c);
	
		
		
		
         
	}

}
