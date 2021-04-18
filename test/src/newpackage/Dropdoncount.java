package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdoncount {
	WebDriver driver;

	public void validdropdown()
	{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement day=driver.findElement(By.id("day"));
	Select s=new Select(day);
	WebElement w=s.getFirstSelectedOption();

	System.out.println("Beforeselect the value from dropdown"+w.getText());
	
s.selectByVisibleText("7");
WebElement w1=s.getFirstSelectedOption();
System.out.println("Afterselect the value from dropdown"+w1.getText());
List<WebElement>lst=s.getOptions();
int actualcount=lst.size();
System.out.println("the dropdowncount from the application"+actualcount);
for(WebElement obj:lst)
{
	System.out.println("the alldropdowns values from the application print"+obj.getText());
	int expectedcount=32;
	Assert.assertEquals(actualcount, expectedcount);	

}
System.out.println("the validation pass test is pass");

	}
public static void main(String args[])
{
	Dropdoncount obj=new Dropdoncount();
	obj.validdropdown();
}
	
	 	 	
	}


