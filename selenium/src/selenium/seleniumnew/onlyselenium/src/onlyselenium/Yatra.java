package onlyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Yatra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com");
		driver.findElement(By.xpath("//a[@class='blur_class']")).click();
		//driver.findElement(By.id("BE_flight_origin_city")).
		WebElement x=driver.findElement(By.id("BE_flight_origin_city"));
	     x.sendKeys("New Delhi, India (DEL)");
	     x.sendKeys(Keys.ENTER);
	     WebElement x1=driver.findElement(By.id("BE_flight_arrival_city"));
	     x1.sendKeys("Mumbai, India (BOM)");
	     x1.sendKeys(Keys.ENTER);
	     
	

		
	}

}
