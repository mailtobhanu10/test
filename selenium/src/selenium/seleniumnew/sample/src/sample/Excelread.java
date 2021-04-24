package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excelread {
	WebDriver driver;
	@Test(dataProvider="Exceldata")
	
		
		public void LoginWordPress(String username,String password) {
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//img[@alt='LOGIN NOW']")).click();
		ArrayList<String>lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.id("User_Id")).sendKeys("usename");
		//driver.findElement(By.("cPin_Id")).click();
		driver.findElement(By.xpath("//div[@class='kpad_mid_vk']")).sendKeys("password");
		//driver.findElement(By.id("password")).sendKeys("2155488848");
		driver.switchTo().window(lst.get(0));
	}
	@DataProvider(name="Exceldata")
	public Object[][]passData() throws BiffException, IOException
		{

		FileInputStream fs=new FileInputStream("F:\\seleniumnew\\testng\\testdata.xlsx");
		Workbook wb=Workbook.getWorkbook(fs);
		Sheet ws=wb.getSheet("sample");//
		for(int r=0; r<ws.getRows();r++)
		{
			for(int c=0; c<ws.getColumns();c++)
			{
				System.out.println(ws.getCell(c,r).getContents());
			};
		}
		
		wb.close();
		return passData();
		}}
	