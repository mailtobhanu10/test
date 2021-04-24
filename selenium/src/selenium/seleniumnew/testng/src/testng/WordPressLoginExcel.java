package testng;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class WordPressLoginExcel{

		WebDriver driver;
		public WordPressLoginExcel(String excelpath) {
			// TODO Auto-generated constructor stub
		}

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
		Object[][] data=new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo1";

		data[1][1]="admin";
		data[1][0]="demo123";
		
		data[2][1]="admin2";
		data[2][1]="demo1234";
		
		
		
		return data;
		
	}

		public int getRowCount() {
			// TODO Auto-generated method stub
			return 0;
		}
	

		public int getRowCount(int i) {
			// TODO Auto-generated method stub
			return 0;
		}

		public Object getdata() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getdata(int i, int i2, int j) {
			// TODO Auto-generated method stub
			return null;
		}}


