package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
	}
	public void login()
	{
	driver.findElement(By.xpath("//a[@id='uh-signin']")).click();	
	driver.findElement(By.id("login-username")).sendKeys("bhanu_prakash1112000@yahoo.com");
	driver.findElement(By.id("login-signin")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yahoo h=new Yahoo();
		h.open();
		h.login();
		
	}

}
