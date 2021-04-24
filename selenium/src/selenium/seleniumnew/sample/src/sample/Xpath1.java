package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1 {
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	}
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys("bhanu");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("5451545");
		//driver.findElement(By.xpath(xpathExpression))
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xpath1 l=new Xpath1();
		l.open();
		l.login();
	}

}
