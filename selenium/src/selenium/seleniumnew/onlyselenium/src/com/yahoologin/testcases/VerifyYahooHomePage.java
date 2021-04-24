package com.yahoologin.testcases;
package com.yahoologin.testcases
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.yahoo.pages.Homepage;


public class VerifyYahooHomePage {
	public class VerifyYahooLogin {
		@Test
		public void verifyValidLogin()
		{
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();

		driver.get("https://login.yahoo.com");
		Homepage obj=new Homepage(); 
		obj.yahooLogin("venkat123456a", "mqq987654");
		
}}}
