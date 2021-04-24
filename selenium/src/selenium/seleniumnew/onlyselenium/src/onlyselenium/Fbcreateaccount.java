package onlyselenium;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbcreateaccount {
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}
	public void createaccount()
	{
		driver.findElement(By.id("u_0_1")).sendKeys("suri");
		driver.findElement(By.id("u_0_3")).sendKeys("babu");
		driver.findElement(By.id("u_0_6")).sendKeys("7013852065");
		driver.findElement(By.id("u_0_d")).sendKeys("123456789");
		Select s1=new Select(driver.findElement(By.id("day")));
		s1.selectByValue("4");
		Select s2=new Select(driver.findElement(By.id("month")));
		s2.selectByValue("12");
		Select s3=new Select(driver.findElement(By.id("year")));
		s3.selectByVisibleText("1991");
		driver.findElement(By.id("u_0_h")).click();
		driver.findElement(By.id("u_0_l")).click();
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fbcreateaccount g=new Fbcreateaccount();
		g.open();
		g.createaccount();
	}

}
