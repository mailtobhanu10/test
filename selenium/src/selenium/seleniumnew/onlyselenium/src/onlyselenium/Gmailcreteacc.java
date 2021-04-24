package onlyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Gmailcreteacc {
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	public void createacc()
	{
	 driver.findElement(By.xpath("//div[@class='IMH1vc lUHSR']")).click();
	// Select s=new Select(driver.findElement(By.xpath("div//div[@id='SIGNUP']")));
	 //s.selectByVisibleText("Create account");
	driver.findElement(By.xpath("div//div[@id='SIGNUP']"));

	 WebElement x=driver.findElement(By.xpath("//div[@class='jO7h3c']"));
	 x.sendKeys("Create account");
	 x.sendKeys("keys.ENTER");
	 /*Select s=new Select(driver.findElement(By.xpath("//div[@class='jO7h3c']")));
	 s.selectByVisibleText("Create account").*/
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmailcreteacc u=new Gmailcreteacc();
		u.open();
		u.createacc();

	}

}
