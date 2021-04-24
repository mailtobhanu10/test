package exptwobrow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google1 {
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void search(String browsername) throws Exception
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
		driver=new FirefoxDriver();
	}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("WebDriver.chrome.driver", "‪‪F:\\softwares\\exefiles\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("WebDriver.ie.driver", "‪F:\\softwares\\exefiles\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	
   driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.id("lst-ib")).sendKeys("facebook");
	driver.findElement(By.name("btnG")).click();
	Thread.sleep(5000);
	driver.close();
}}
