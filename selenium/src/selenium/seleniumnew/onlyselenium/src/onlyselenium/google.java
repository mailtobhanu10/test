//firefox driver is the class
//get url is the opne the browser
//findelement(by)-->find element in the browser and returns webelement
//quit()-->close all the browsers opened during run time


package onlyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {
	
		FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
public void search()
{
	driver.findElement(By.id("lst-ib")).sendKeys("facebook");
	driver.findElement(By.name("btnK")).click();
	driver.quit();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
google g=new google();
g.open();
g.search();
	}

}
