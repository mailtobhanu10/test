package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleRadioButtons {
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
       List<WebElement>lst=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
       int radiocount=lst.size();
       System.out.println("the radio count is"+radiocount);
       for(int i=0;i<radiocount;i++)
       {
    	   WebElement ele=lst.get(i);
    	   String str=ele.getAttribute("value");
    	   if(str.equalsIgnoreCase("java"))
    	   {
    		   ele.click();
    	   }
       }
	}}