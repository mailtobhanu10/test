package exptwobrow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BhanuIe {
	public void open1() throws Exception
	{
        System.setProperty("WebDriver.IE.driver", "‪‪‪F:\\softwares\\exefiles\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("facebook");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
