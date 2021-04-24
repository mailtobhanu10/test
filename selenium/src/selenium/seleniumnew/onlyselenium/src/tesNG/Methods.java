package tesNG;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Methods {

	//in this case alphabetical orderly testcases are executed
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("------before  test suite-----");
	}
	//open the browser
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("-------after suite test case------");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("------before every test case-----");
	}
	//open the browser
	@AfterTest
	public void afterTest()
	{
		System.out.println("-------after every test case------");
	}
	//close the browser
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("-------beforemethod every test case------");
	}
	//open the browser
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("--------aftermethod every test case-------");
	}
@Test
public void login()
{
	//throw new SkipException("any reason");
	//System.out.println("login is successfully completed");
}
@Test(priority=1,dependsOnMethods={"login"})
public void doPasswordChange()
{
	System.out.println("password should be changed succesfully");
}

@Test(priority=1,dependsOnMethods={"login,doPasswordChange"})
public void nogout()
{
	System.out.println("logout succesfully");
}

}
