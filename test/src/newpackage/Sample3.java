package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {
	WebDriver driver;
	public void name() throws Exception
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dezlearn.com/testingpage/");
		driver.switchTo().frame("do-it-iframe");
		driver.findElement(By.name("s")).sendKeys("bhanu");
		driver.findElement(By.xpath("//input[@class='search-submit']")).click();
		driver.switchTo().frame("contact-iframe");
		driver.findElement(By.id("ninja_forms_field_11")).sendKeys("bhanu");
		driver.findElement(By.id("ninja_forms_field_12")).sendKeys("bhanu123@gmail.com");
		driver.findElement(By.id("ninja_forms_field_13")).sendKeys("this is the filed in the ");	
		
	}
	public static void main(String args[]) throws Exception
	{
		Sample3 obj=new Sample3();
		obj.name();
		
	

}}
