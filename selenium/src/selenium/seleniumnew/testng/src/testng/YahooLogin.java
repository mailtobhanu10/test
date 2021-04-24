package testng;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class YahooLogin {
	 WebDriver driver;
		
		public static void main(String[] args) throws Exception
		{
			// read excel
			
			// file for reading
			
			FileInputStream fs=new FileInputStream("F:\\seleniumnew\\testng\\testdata.xlsx");
			
			// get work book in the file
			
			Workbook wb=Workbook.getWorkbook(fs);
			
			// get sheet in the work book
			
			Sheet ws=wb.getSheet("sample");
			
			// for all the rows,cols
			
			for(int r=1;r<ws.getRows();r++) {
				FirefoxDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			
			driver.findElement(By.name("username")).sendKeys(ws.getCell(0,r).getContents());
			driver.findElement(By.name("signin")).click();
			Thread.sleep(5000);		
			
			driver.findElement(By.name("passwd")).sendKeys(ws.getCell(1,r).getContents());
			driver.findElement(By.name("signin")).click();
			
			try
			{
				if(driver.findElement(By.linkText("Sign Out")).isDisplayed())
				{
					System.out.println("Login is success");
					driver.findElement(By.linkText("Sign Out")).click();
				} // if
			} // try
			
			catch(Exception e)
			{
				//String str=driver.findElement(By.id("mbr-login-error")).getText();
				//System.out.println("Login is failed  :"+str);
				} //catch
			
			driver.close();

		}  // for

}}
