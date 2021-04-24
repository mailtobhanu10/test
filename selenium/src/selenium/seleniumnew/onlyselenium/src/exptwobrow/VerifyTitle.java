package exptwobrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
WebDriver driver;
@Test
@Parameters("browser")
public void verifyPageTitle(String browsername)
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
	driver.manage().window();
	driver.get("www.learn_automation.com");
	System.out.println(driver.getTitle());
	driver.quit();
}
}