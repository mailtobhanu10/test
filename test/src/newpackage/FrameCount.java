package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;



public class FrameCount {
	WebDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/");
		List<WebElement>totalframes=driver.findElements(By.tagName("iframe"));
		System.out.println("total number of frames in a page ->"+totalframes.size());
		driver.switchTo().frame(totalframes.get(1));
	JavaScriptExecutor js=(JavaScriptExecutor)driver;
	
		
		
	}
	
	public static void main(String args[])
	{
		FrameCount obj=new FrameCount();
		obj.open();
	}

}
