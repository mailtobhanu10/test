package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	//FirefoxDriver driver;
	ChromeDriver driver;
	public void open()
	{
		//driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		System.setProperty("WebDriver.chrome.driver","F:\\softwares\\libraryfiles.exe");
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[text()='Power Banks']"));
	a.moveToElement(e).perform();
	e.click();
	}
	public static void main(String[] args) {
		ActionClass j=new ActionClass();
		j.open();
	}

}
