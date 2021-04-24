package onlyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaillogin {
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
	}
public void login()
{
	driver.findElement(By.id("identifierId")).sendKeys("g.bhanuprakash10@gmail.com");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8106775848");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmaillogin k=new Gmaillogin();
		k.open();
		k.login();
	}

}
