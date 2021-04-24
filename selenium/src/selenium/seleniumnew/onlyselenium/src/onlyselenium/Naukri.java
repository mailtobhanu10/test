package onlyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		driver.findElement(By.id("eLogin")).sendKeys("bhanuprakashg27@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("bhanug27");
		driver.findElement(By.xpath("//button[@class='blueBtn']")).click();
		//driver.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view')]")).click();
		WebElement a=driver.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view')]"));
        Actions a4=new Actions(driver);
        a4.moveToElement(a);
        a4.perform();
        a4.sendKeys(Keys.ENTER);
        
	
	}}
