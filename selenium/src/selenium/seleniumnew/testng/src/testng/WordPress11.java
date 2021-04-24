package testng;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class WordPress11{

		WebDriver driver;
		@Test(dataProvider="wordpressData")
		public void LoginWordPress(String username,String password) throws InterruptedException
		{ driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://wordpress.com/log-in");
			driver.findElement(By.id("usernameOrEmail")).sendKeys("username");
			driver.findElement(By.id("password")).sendKeys("password");
			driver.findElement(By.xpath("//button[@class='button form-button is-primary']")).click();
			Thread.sleep(5000);
			//System.out.println(driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("dashboard"),"user isnt able to login-invalid data");
			System.out.println("page tittle is verified user is able to login successfully");
			
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}

		
		@DataProvider(name="wordpressData")
	public Object[][]passData(){
		WordPressLoginExcel a=new WordPressLoginExcel("F:\\seleniumnew\\testng\\testdata.xlsx");
		int rows=a.getRowCount(0);
		Object[][] data=new Object[rows][2];
		for(int i=0;i<=rows;i++)
				{
			data[i][0]=a.getdata(0,i,0);	
			data[i][1]=a.getdata(0,i,1);
				}
		return data;
		
	}
	}


