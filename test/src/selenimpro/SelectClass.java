package selenimpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://m.facebook.com/");
		driver.findElement(By.id("signup-button")).click();
		driver.findElement(By.id("firstname_input")).sendKeys("bhanu");
		driver.findElement(By.id("lastname_input")).sendKeys("prakash");
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();
		WebElement e=driver.findElement(By.id("year"));
		
		Select s=new Select(e);
		List<WebElement>ele=s.getOptions();
		int sww=ele.size();
		for(int i=0;i<sww;i++)
		{
		WebElement ele11=ele.get(i);
		String str=ele11.getText();
       if(str.equalsIgnoreCase("2020"))
       {
    	   ele11.click();
       }
         
         
		
		
	}

}}
