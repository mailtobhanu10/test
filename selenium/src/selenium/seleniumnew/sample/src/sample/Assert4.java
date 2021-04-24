package sample;

import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert4 {
	SoftAssert b;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforesuite");
	}
	@AfterSuite
	public void aeforeSuite()
	{
		System.out.println("aeforesuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("*****************before every test case it run**************** ");
		//before every test we can open the browser
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("***************after every test case it run*************** ");
		//after every test we close the browser
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before every method it will run");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("after every method it will run");
	}
	
@Test(priority=3)
public void login()
{
	b=new SoftAssert();
	b.assertEquals("A", "B");
	System.out.println("login is sucesses");
	b.assertAll();
}
@Test(priority=1,dependsOnMethods={"login"})
public void passwordchange()
{
	b=new SoftAssert();
	b.fail("error message");
	System.out.println("password should change sucessfully");
	b.assertAll();
}
@Test(priority=2,dependsOnMethods={"login","passwordchange"})
public void logout()
{
	System.out.println("the funtion will be logout successfully");
}

}


