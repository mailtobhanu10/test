package onlyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SkiledPool {
	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/products/mobiles-mobile-phones");
        driver.findElement(By.xpath("//span[@class='catText']"));
        
	 
	
		
		
	}
}
