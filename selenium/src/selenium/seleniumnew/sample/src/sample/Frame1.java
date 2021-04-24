package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[2]/div/a")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div/iframe")));
		/*WebElement str=driver.findElement(By.xpath("//p[text()='This is a paragraph.']"));
		System.out.println(str);*/
	}

}
