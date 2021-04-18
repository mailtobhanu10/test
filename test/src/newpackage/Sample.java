package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	WebDriver driver;
	public void name()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
		
	}
	public static void main(String args[])
	{
		Sample obj=new Sample();
		obj.name();
		
	

}}
