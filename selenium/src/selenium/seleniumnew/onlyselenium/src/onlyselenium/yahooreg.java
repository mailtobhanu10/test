package onlyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class yahooreg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		WebElement d=driver.findElement(By.xpath("//a[@id='createacc']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(d).perform();
	    d.sendKeys(Keys.ENTER);
	    driver.findElement(By.id("usernamereg-firstName")).sendKeys("bhanu");
	    driver.findElement(By.id("usernamereg-lastName")).sendKeys("prakash");
	    driver.findElement(By.id("usernamereg-yid")).sendKeys("bhanu_prakash27");
	    driver.findElement(By.id("usernamereg-password")).sendKeys("gali_27");
	    Select s4=new Select(driver.findElement(By.name("shortCountryCode")));
	    s4.selectByValue("IN");
	    driver.findElement(By.xpath("//input[@class='phone-no']")).sendKeys("7013852065");
		
	}

}
