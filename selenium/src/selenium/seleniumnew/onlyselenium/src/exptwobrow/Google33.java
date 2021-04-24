package exptwobrow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google33 {
	
	@Test
	public void open() throws Exception
	{
        System.setProperty("WebDriver.chrome.driver", "‪‪F:\\softwares\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("facebook");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(5000);
		driver.close();
	}
}


