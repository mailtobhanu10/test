package sample;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLinks {
	
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stu
			FirefoxDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in");
			/*driver.findElement(By.id("lst-ib")).sendKeys("selenium");
			driver.findElement(By.name("btnK")).click();*/
			driver.findElement(By.id("lst-ib")).sendKeys("selenium");
			driver.findElement(By.name("btnK")).click();
			
			Thread.sleep(2000);
			List<WebElement> lst=driver.findElements(By.xpath("//a"));
			for(WebElement x:lst)
			{
				System.out.println(x.getText());
				System.out.println("==================");
				WebElement W=driver.findElement(By.id("brs"));
				lst=W.findElements(By.tagName("a"));
				for(WebElement x1:lst)
				{
					System.out.println(x.getText());
				}
				
			}
		}
		

	}


