package newpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TestSeleniumFb {
	@Test
	public void testFb() throws Exception
	{
		
		ConfigReader obj=new ConfigReader();
		System.setProperty("webdriver.chrome.driver",obj.getChromepath());
		WebDriver driver=new ChromeDriver();
		driver.get(obj.getUrl());
		driver.quit();
		
	}

}
