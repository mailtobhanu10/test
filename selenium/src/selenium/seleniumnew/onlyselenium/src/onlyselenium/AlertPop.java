package onlyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
@Test
public class AlertPop {

	//public static void main(String[] //args) throws Exception{
		
		FirefoxDriver driver=new FirefoxDriver();
		
		/*driver.findElement(By.name("userName")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("captchaImage")).sendKeys("");
		driver.findElement(By.name("button")).click();*/
		driver.get("http://www.rediffmail.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.name("proceed")).c
	    Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
	

