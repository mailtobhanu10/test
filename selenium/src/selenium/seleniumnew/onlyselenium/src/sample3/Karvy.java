package sample3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Karvy {
	

		FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://karvy.umon.in");

}}
