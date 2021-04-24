package onlyselenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class YahooExcelIn {
	static FirefoxDriver driver;
	public static void main(String[] args) throws BiffException, IOException {
	
		FileInputStream fsr=new FileInputStream("‪F:\bhanu22.xlsx");
		Workbook wb=Workbook.getWorkbook(fsr);
		Sheet ws=wb.getSheet("sample");
		for(int r=1;r<ws.getRows();r++)
		{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		driver.findElement(By.id("login-username")).sendKeys(ws.getCell(0,r).getContents());
		driver.findElement(By.name("signin")).click();
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys(ws.getCell(1,r).getContents());
		driver.findElement(By.id("login-signin")).click();
		
		try
		{
			if(driver.findElement(By.linkText("signout")).isDisplayed())
					{
				System.out.println("login is success");
				driver.findElement(By.linkText("signout")).click();
			}}
			catch(Exception E)
			{

String str=driver.findElement(By.id("mbr-login-error")).getText();
System.out.println("login is failed:+str");
			}
			driver.close();
			}}}
			
