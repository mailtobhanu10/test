package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Yatra {
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//a[@title='One Way']")).click();
		WebElement a=driver.findElement(By.id("BE_flight_origin_city"));
		a.sendKeys("Hyderabad");
		a.click();
		WebElement a5=driver.findElement(By.id("BE_flight_arrival_city"));
		a5.sendKeys("delhi");
		a5.click();
		
		/*Actions a=new Actions(driver);
		WebElement x=driver.findElement(By.id("BE_flight_origin_city"));
		a.moveToElement(x).perform();
		a.click();*/
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yatra h=new Yatra();
		h.open();
	}

}
