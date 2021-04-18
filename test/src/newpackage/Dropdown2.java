package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown2 {
	@Test
	public void m()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("u_0_j")).sendKeys("bhanum");
		driver.findElement(By.id("u_0_l")).sendKeys("praksah");
		driver.findElement(By.name("reg_email__")).sendKeys("mailtobhanu10@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("869522");		
				Select s1=new Select(driver.findElement(By.id("day")));
				
				WebElement ele=s1.getFirstSelectedOption();
				String firstselectedoption=ele.getText();
				System.out.println("firstselectedoption");
				s1.selectByIndex(1);
				WebElement ele1=s1.getFirstSelectedOption();
				
				String afterselectthevalue=ele1.getText();
				System.out.println(afterselectthevalue);
				s1.deselectByIndex(1);
				List<WebElement>ddlist=s1.getOptions();
				int count=ddlist.size();
				System.out.println(count);	
				for(int i=0;i<count;i++)
				{
				WebElement ele11=ddlist.get(i);
				String str=ele11.getText();
		       if(str.equalsIgnoreCase("22"))
		       {
		    	   ele11.click();
		       }
		         
		         
				
				
				}
				
				
				
	}

}
