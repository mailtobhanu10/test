package local;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Chrome1 
{
	@Test
	public void open()
	{
		System.setProperty("WebDriver.chrome.driver","F:\\softwares\\libraryfiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.id("loginsubmit")).click();
		ArrayList<String>lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("//a[@href='https://netbanking.hdfcbank.com/netbanking/']")).click();

	}
}
