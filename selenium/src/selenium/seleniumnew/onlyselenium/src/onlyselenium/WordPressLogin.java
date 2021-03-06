package onlyselenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {
	@Test(dataProvider="WordPressLogin")
public void loginWordpress(String username,String password) throws InterruptedException
{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.name("wp-submit")).click();
		Thread.sleep(3000);
		//System.out.println(driver.getTitle());
		org.testng.Assert.assertTrue(driver.getTitle().contains("Dashboard"),"user is not able to login invalid credentials");
		System.out.println("page title verified user able to login successfully");
		driver.quit();
		
	}
	@DataProvider(name="WordPressLogin")
	public Object[][] passdata()
	{
		Object[][] a=new Object[3][2];
		a[0][0]="admin1";
		a[0][1]="demo1";
		
		a[1][0]="bhanuprakashg27@gmail.com";
	    a[1][1]="3366bhanu";
	    
	    a[2][0]="admin2";
	    a[2][1]="demo1234";

	    
		return a;
		
	}

}
