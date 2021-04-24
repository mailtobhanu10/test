package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.slideshare.net/login");
	}
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("bhanu");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("6566564");
        driver.findElement(By.xpath("//input[@id='remember']")).click();
        driver.findElement(By.xpath("//button[@id='login_from_loginpage']")).click();
        String str=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/fieldset/div[3]")).getText();
	     
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xpath b=new Xpath();
		b.open();
		b.login();

	}

}
