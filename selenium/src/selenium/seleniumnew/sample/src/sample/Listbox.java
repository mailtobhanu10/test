package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Listbox {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.id("eLogin")).sendKeys("bhanuprakashg27@gmail.com");

		driver.findElement(By.id("pLogin")).sendKeys("bhavani10");
		driver.findElement(By.xpath("//button[@class='blueBtn']")).click();
			
		
}}
