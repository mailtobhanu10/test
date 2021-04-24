package sample;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HdfcWindow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hdfcbank.com/");
	driver.findElement(By.id("loginsubmit")).click();
	ArrayList<String>lst=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(lst.get(1));
	driver.findElement(By.xpath("//a[@href='https://netbanking.hdfcbank.com/netbanking/']")).click();
	driver.findElement(By.xpath("//input[@class='input_password']")).sendKeys("bhanu122");
	
	

	

	}

}
