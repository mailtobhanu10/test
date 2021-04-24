package sample;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.hdfcbank.com");
		
		driver.findElement(By.id("loginsubmit")).click();
		//get address of all the windows /tabs
		ArrayList<String>  lst=new ArrayList<String>(driver.getWindowHandles());

		// focus to 2nd window
		driver.switchTo().window(lst.get(1)); 
		driver.findElement(By.xpath("//a[@href='https://netbanking.hdfcbank.com/netbanking/']")).click();
		
		//focus to the Frame
		driver.switchTo().frame("login_page");
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("78789876");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		//focus to alert
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

	}
	}


