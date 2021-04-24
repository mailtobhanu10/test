package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("loginbutton")).click();
		/*String B=driver.switchTo().alert().getText();
		System.out.println("the alret message is"+B);
		driver.switchTo().alert().accept();*/
		Alert A=driver.switchTo().alert();
		A.getText();
		A.accept();
		
		
		
		
	}

}
