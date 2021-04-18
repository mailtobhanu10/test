package newpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertEx {
	public void open()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dezlearn.com/testingpage");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert a=driver.switchTo().alert();
		
		System.out.println(a.getText());
	}
	public static void main(String args[])
	{
AlertEx obj=new AlertEx();
obj.open();
	}

}
