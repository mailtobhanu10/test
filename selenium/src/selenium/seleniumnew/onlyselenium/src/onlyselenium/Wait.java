package onlyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wait {

	FirefoxDriver driver;

public void open()
{
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
}
public void login()
{
	driver.findElement(By.id("email")).sendKeys("saihoney143143@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("bhanudivyalove");
	driver.findElement(By.id("u_0_q")).click();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Facebook j=new Facebook();
j.open();
j.login();
	}}
