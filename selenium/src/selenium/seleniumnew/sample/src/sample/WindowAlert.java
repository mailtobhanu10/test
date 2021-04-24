package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.findElement(By.name("searchBtn")).click();
		String Alert_Message=driver.switchTo().alert().getText();
		System.out.println("Alert message is +"+Alert_Message);
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
