package onlyselenium;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HanleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.online.citibank.co.in/");
		/*driver.findElement(By.xpath("//img[@title='LOGIN NOW']")).click();
		//ArrayList<String>Lst=new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(Lst.get(1));

String ParentWindow=driver.getWindowHandle();
for(String SubWindow:driver.getWindowHandles());
{
driver.switchTo().Window(SubWindow);
}
		String str=driver.findElement(By.xpath("//div[@class='bold']")).getText();
		System.out.println(str);-*/
		driver.get("https://www.hdfcbank.com");
		driver.findElement(By.id("loginsubmit")).click();
		ArrayList<String>Lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Lst.get(1));
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		driver.switchTo().frame("login_page");//frame handle by name
		driver.findElement(By.name("fldLoginUserId")).sendKeys("9994499");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		driver.findElement(By.name("fldPassword")).sendKeys("9984454");
		driver.findElement(By.xpath("//img[@alt='Login']")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		
		
	

	}	
	}


