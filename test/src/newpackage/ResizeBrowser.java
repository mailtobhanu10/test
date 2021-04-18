package newpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeBrowser {
	WebDriver driver;
	public void openBrowser()
	{
		driver=new FirefoxDriver();

		driver.navigate().to("https://www.google.com");
		System.out.println(driver.manage().window().getSize());//original size of the page
		Dimension D=new Dimension(480,620);
		driver.manage().window().setSize(D);//we have set default values for the window

		System.out.println(driver.manage().window().getSize());
		
	}
public static void main(String args[])
{
	 ResizeBrowser obj=new  ResizeBrowser();
	 obj.openBrowser();
}
}
