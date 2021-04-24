package onlyselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google2 {

	public static void main(String[] args) throws Exception 
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.id("lst-ib")).sendKeys("facebook");
	driver.findElement(By.name("btnG")).click();
	Thread.sleep(3000);
	List<WebElement> lst=driver.findElements(By.xpath("//a"));
	for(WebElement x:lst)
	System.out.println(x.getText());
	System.out.println("==========================");

	WebElement w=driver.findElement(By.id("brs"));
	lst=w.findElements(By.tagName("a"));
	for(WebElement x:lst)
		System.out.println(x.getText());
	
	
	lst =driver.findElements(By.xpath("//a[contains(text(),'facebook')]"));
	for(int i=0;i<lst.size();i++)
	{
		lst.get(i).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//lst =driver.findElements(By.xpath("//a[contains(text(),'facebook']"));
	}
	
	}

}