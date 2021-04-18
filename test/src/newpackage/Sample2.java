package newpackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample2 {
WebDriver driver;

	public void open() 
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("bhanu3366@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9995644");
		driver.findElement(By.id("u_0_2")).click();
	
		//String str=driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
		//System.out.println("the error message from webpage is"+str);
		driver.navigate().to("https://www.hdfcbank.com");
		driver.findElement(By.id("loginsubmit")).click();
		ArrayList<String>lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(0));
		driver.findElement(By.xpath("//a[text()='Continue to NetBanking']")).click();
	}
	public static void main(String args[]) 
	{
		Sample2 obj=new Sample2();
		obj.open();
	}

}
