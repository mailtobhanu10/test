package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HiddenElements {
	@Test
	public void hiddenTest()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>radio=driver.findElements(By.id("male"));
		int totalradiobutton=radio.size();
		System.out.println("the total radio buttons in the page"+totalradiobutton);
		for(int i=0;i<radio.size();i++)
		{
			
			int x=radio.get(i).getLocation().getX();
			if(x!=0)
			{
			radio.get(i).click();	
			break;
			}
		}
	}

}
