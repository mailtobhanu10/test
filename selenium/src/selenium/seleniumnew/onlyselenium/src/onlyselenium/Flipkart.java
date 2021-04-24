package onlyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
@Test
public void flipkartLink(){
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	WebElement x=driver.findElement(By.xpath("//span[text()='Women']"));
	Actions a=new Actions(driver);
	a.moveToElement(x).perform();
	driver.findElement(By.linkText("Sports Shoes")).click();
}}