package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet {
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText(" Amritsar (ATQ)")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spicejet n=new Spicejet();
		n.open();
	}

}
