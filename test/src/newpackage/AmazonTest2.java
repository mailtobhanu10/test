package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonTest2 {
	@Test
	public void amazonTest() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-shopall")).click();
		
		
		driver.findElement(By.linkText("Watches")).click();
		//driver.findElement(By.xpath("img[@alt='Fossil']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(3000);
	List<WebElement>lst=driver.findElements(By.xpath("//div[@id='contentGrid_677851']/div/div[2]/div/div/div/a/img"));
	int count=lst.size();
	System.out.println(count);
	WebElement ele=lst.get(0);
	ele.click();

}}



