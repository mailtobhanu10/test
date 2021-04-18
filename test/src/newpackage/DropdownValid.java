package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import testng.framework.Assert;

public class DropdownValid {
	@Test
	public void facebookDropDownValid()
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
WebElement dd=driver.findElement(By.id("day"));
Select s=new Select(dd);
WebElement str=s.getFirstSelectedOption();
String firstselectoption=str.getText();
System.out.println("the 1st selected option"+firstselectoption);
List<WebElement>allvalues=s.getOptions();
int ddcount=allvalues.size();
org.testng.Assert.assertEquals(32, ddcount);

for(int i=0;i<ddcount;i++)
{
	WebElement ele=allvalues.get(i);
	String str23=ele.getText();
	if(str23.equals("29"))
	{
		ele.click();
		System.out.println("the element is clicked sucessfully");
	}
}



	
	}

}
