package newpackage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example {
	WebDriver driver;
	public void open()
	{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dezlearn.com/testingpage/");

	List<WebElement>totalframes=driver.findElements(By.tagName("iframe"));
	int framecount=totalframes.size();
	System.out.println(framecount);
	driver.switchTo().frame(totalframes.get(0));
	driver.findElement(By.name("s")).sendKeys("bhanu");
	driver.findElement(By.xpath("//input[@class='search-submit']")).click();
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
Alert a=driver.switchTo().alert();
a.accept();
a.dismiss();
String str=a.getText();
System.out.println(str);
driver.switchTo().frame(totalframes.get(0));
	driver.findElement(By.id("ninja_forms_field_11")).sendKeys("bhanu");
	driver.findElement(By.id("ninja_forms_field_12")).sendKeys("bhanu123@gmail.com");
	driver.findElement(By.id("ninja_forms_field_13")).sendKeys("this is the filed in the ");


	}
public static void main(String args[])
{
	Example obj=new Example();
	obj.open();

}}
