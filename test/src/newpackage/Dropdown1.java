package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown1 {
	@Test
	public void m() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		Select s=new Select(driver.findElement(By.id("selenium_commands")));	
		s.selectByVisibleText("Browser Commands");
		Thread.sleep(3000);
		s.deselectByVisibleText("Browser Commands");
		List<WebElement>lst=s.getOptions();
		int count=lst.size();
		for(int i=0;i<count;i++)
		{
			WebElement ele=lst.get(i);
			String str=ele.getText();
             if(str.equalsIgnoreCase("Navigation Commands"))
            		 {
            	ele.click();
            		 }
		}
	}
	
	

}
