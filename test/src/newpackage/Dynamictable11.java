package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dynamictable11 {
	@Test
	public void m()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
	//	driver.findElement(By.xpath("//a[contains(text(),'Features')]/parent::*/following-sibling::li[1]/a")).click();

//driver.findElement(By.xpath("//a[contains(text(),'Features')]/parent::*/following-sibling::li[1]/a")).click();

//WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Clients'"));
				//WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Clients')]"));
//driver.findElement(By.xpath("//div[@class='header__container']/child::nav/child::ul/li[3]/a")).click();
driver.findElement(By.xpath("//a[contains(text(),'Clients')]/parent::*/preceding-sibling::li[2]/a")).click();
		

	}}

	
