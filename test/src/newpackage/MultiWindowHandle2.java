package newpackage;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiWindowHandle2 {
	@Test
	public void multiHandle() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle();
		System.out.println("this is the parent window"+parent);
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		ArrayList<String>allwindows=new ArrayList<String>(driver.getWindowHandles());
		int countallwindows=allwindows.size();
		System.out.println("the total window count"+ countallwindows);
		driver.switchTo().window(allwindows.get(1));	
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		driver.switchTo().window(allwindows.get(0));
	    System.out.println("the parent window tittle is"+driver.getTitle());
	

		
		
	}

}
