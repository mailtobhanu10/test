package newpackage;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FbLogin {
	@Test
	public void fbLogin() throws Exception
	{
		try
		{
		File f1=new File("‪‪‪‪‪E:\\bhanutest.xlsx");
		FileInputStream fis1=new FileInputStream(f1);
		XSSFWorkbook wb1=new XSSFWorkbook();
		XSSFSheet ws1=wb1.getSheet("Sheet1");
		int count=ws1.getLastRowNum();
		System.out.println("the row count is"+count);
		for(int i=0;i<count;i++)
		{
			String email=ws1.getRow(i).getCell(0).getStringCellValue();
			String password=ws1.getRow(i).getCell(1).getStringCellValue();
			
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_3")).click();
	}
	

}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
	}}
		}
