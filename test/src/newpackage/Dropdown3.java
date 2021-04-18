package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown3 {
	@Test
	public void m() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		List<WebElement>muldd=driver.findElements(By.tagName("select"));
	    int count=muldd.size();
	    System.out.println(count);
	   WebElement ele= muldd.get(0);
	 
	   Select s=new Select(ele);
	   s.selectByIndex(1);
	   Thread.sleep(3000);
	   WebElement ele1= muldd.get(1);
	   Select s22=new Select(ele1);
	   s22.selectByVisibleText("Jan");
	  Thread.sleep(3000);
	  WebElement ele2= muldd.get(2);
	  Select s33=new Select(ele2);
	  s33.selectByIndex(2);	  
	  
	   
	   
	    /*for(int i=0;i<count;i++)
	    {
	    	WebElement ele=muldd.get(i);
	    	ele.click();
	  
	    }*/
	}

}
