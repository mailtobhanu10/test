package onlyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class yahoo {
	@Test
	public void test()
	{
FirefoxDriver driver=new FirefoxDriver();
driver.manage().window();
driver.get("https://login.yahoo.com");
driver.findElement(By.id("login-username")).sendKeys("bhanu_prakash1112000@yahoo.com");
driver.findElement(By.name("signin")).click();
driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("8106775848");
driver.findElement(By.id("login-signin")).click();
String str=driver.findElement(By.xpath("//p[@class='error-msg']")).getText();
System.out.println(str);

	}}
	
