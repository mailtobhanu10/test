package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleCheckboxes {
	@Test
	public void sample()
	{
	WebDriver driver=new FirefoxDriver();	
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
    List<WebElement>checklist=driver.findElements(By.xpath("//input[@type='checkbox']"));
    int count=checklist.size();
    System.out.println("the size is"+count);
    for(int i=0;i<count;i++)
    {
    	WebElement obj=checklist.get(i);
    String str=obj.getAttribute("id");
    if(str.equalsIgnoreCase("code"))
    {
    	obj.click();
    }
    }
    

  
	
	}

}
