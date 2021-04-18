package tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("m_login_email")).sendKeys("9");
		driver.findElement(By.id("m_login_password")).sendKeys("A");
		driver.findElement(By.name("login")).click();
		
		
		

	}

}
