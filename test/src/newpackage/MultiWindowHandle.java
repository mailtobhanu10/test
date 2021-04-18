package newpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiWindowHandle {
	@Test
	public void multiHandle() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle();
		System.out.println("this is the parent window"+parent);
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		Set<String>allwindows=driver.getWindowHandles();
		int countallwindows=allwindows.size();
		System.out.println("the total window count"+ countallwindows);
	for(String chaild:allwindows)
	{
		if(!parent.equalsIgnoreCase(chaild))
		{
			driver.switchTo().window(chaild);
			driver.findElement(By.id("lst-ib")).sendKeys("selenium");
			driver.findElement(By.name("btnK")).click();
			Thread.sleep(3000);
			
		}
	}
	driver.switchTo().window(parent);
	System.out.println("the parent window title is"+driver.getTitle());
		
		
	}

}
