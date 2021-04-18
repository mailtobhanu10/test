package selenimpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://m.facebook.com/");
		//driver.findElement(By.id("m_login_email")).sendKeys("bhanu.p@gmail.com");
		//driver.findElement(By.name("email")).sendKeys("wmkmkwmkw");
		//driver.findElement(By.xpath("//input[@id='m_login_email']")).sendKeys("njnsnsjn");	
		 //driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("bhanu");
         //driver.findElement(By.xpath("//input[@class='_56bg _4u9z _5ruq _8qtn']")).sendKeys("jii");
         //driver.findElement(By.xpath(""))
		driver.findElement(By.id("signup-button")).click();
		driver.findElement(By.id("firstname_input")).sendKeys("bhanu");
		driver.findElement(By.id("lastname_input")).sendKeys("prakash");
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();
         WebElement e=driver.findElement(By.id("day"));
         Select s=new Select(e);
         s.selectByIndex(0);
         
        WebElement mon=driver.findElement(By.id("month"));
        Select ss=new Select(mon);
        WebElement lst=ss.getFirstSelectedOption();
        String str=lst.getText();
        System.out.println(str);
        
        WebElement mon1=driver.findElement(By.id("year"));
        Select sss=new Select(mon1);
     String nn=mon1.getText();
     System.out.println(nn);
	
	         
     }
	
        
        
        
        
}

      