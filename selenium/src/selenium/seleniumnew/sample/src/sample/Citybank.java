package sample;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Citybank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.online.citibank.co.in/");
	driver.findElement(By.xpath("//img[@alt='LOGIN NOW']")).click();
	ArrayList<String>lst=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(lst.get(1));
	driver.findElement(By.id("User_Id")).sendKeys("bhanu155");
	//driver.findElement(By.("cPin_Id")).click();
	driver.findElement(By.xpath("//div[@class='kpad_mid_vk']")).sendKeys("4554444");
	//driver.findElement(By.id("password")).sendKeys("2155488848");
	driver.switchTo().window(lst.get(0));
}}
