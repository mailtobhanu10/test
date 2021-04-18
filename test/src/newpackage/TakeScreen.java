package newpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreen {
	WebDriver driver;
	public void open() throws Exception
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("bhanu3366@gmail.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
				
		FileUtils.copyFile(src, new File("F:\\my project all\\practiseall\\screenshots.png"));
		driver.findElement(By.id("pass")).sendKeys("552144");
		driver.findElement(By.id("u_0_8")).click();
		
	}
		public static void main(String args[])throws Exception
		{
			TakeScreen obj=new TakeScreen();
			obj.open();
			
		}
	}


