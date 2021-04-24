package sample;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BMtestAMtest {
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
	throw new SkipException("any reason for that");
	//System.out.println("the function will login sucessfully");
}
@Test(priority=1,dependsOnMethods={"login"})
public void passwordchange()
{
	System.out.println("password should change sucessfully");
}
@Test(priority=2,dependsOnMethods={"login","passwordchange"})
public void logout()
{
	System.out.println("the funtion will be logout successfully");
}

}



