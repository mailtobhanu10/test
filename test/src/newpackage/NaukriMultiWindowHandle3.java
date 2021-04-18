package newpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NaukriMultiWindowHandle3 {
	@Test
	public void multiHandle() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		String parent=driver.getWindowHandle();
		System.out.println("this is the parent window"+parent);

		Set<String>allwindows=driver.getWindowHandles();
		int countallwindows=allwindows.size();
		System.out.println("the total window count"+ countallwindows);
	for(String chaild:allwindows)
	{
		if(!parent.equalsIgnoreCase(chaild))
		{
			driver.switchTo().window(chaild);
			System.out.println("the chaild window tittle is"+driver.getTitle());
			Thread.sleep(3000);
		
			driver.close();
			
			
		}
	}
	driver.switchTo().window(parent);
	System.out.println("the parent window title is"+driver.getTitle());
		
		
	}

}
