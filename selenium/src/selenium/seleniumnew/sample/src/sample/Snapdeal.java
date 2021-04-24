package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snapdeal {
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//span[text()='Mobile & Tablets']")).click();
		driver.findElement(By.linkText("Screen Guards")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snapdeal u=new Snapdeal();
		u.open();
	}

}
