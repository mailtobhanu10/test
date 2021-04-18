package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleValidlinks {
	WebDriver driver;

	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		List<WebElement>lst=driver.findElements(By.xpath("//a"));
		int count=lst.size();
		System.out.println("the count is"+count);
		for(WebElement obj:lst)
		{
			System.out.println(obj.getText());
		}
	//recognise the duplicate elemements
		List<WebElement>list2=driver.findElements(By.xpath("//a[text()='shopping']"));
		lst.get(1).click();
		
		
	}
			
	public static void main(String args[])
	{
		GoogleValidlinks obj=new GoogleValidlinks();
		obj.open();
		
		
	}

}
