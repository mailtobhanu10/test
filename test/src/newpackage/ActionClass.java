package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
	public static void main(String[] args) {
		
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement button= driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions a=new Actions(driver);
		a.moveToElement(button).click();
		List<WebElement>links=driver.findElements(By.xpath("//button[@class='dropbtn']"));
		int totalcount=links.size();
		for(int i=0;i<totalcount;i++)
		{
			
			WebElement elem=links.get(i);
			String str=elem.getAttribute("innerHTML");
			Boolean status=elem.isEnabled();
			System.out.println("links name is"+str+" and the link status is"+status );
			if(str.equalsIgnoreCase("Selenium"))
			{
				elem.click();
				break;
			}
			
		}
				
	}

}
