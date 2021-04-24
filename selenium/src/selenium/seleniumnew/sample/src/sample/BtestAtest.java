package sample;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BtestAtest {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before every test case it run ");
		//before every test we can open the browser
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("after every test case it run ");
		//after every test we close the browser
	}
@Test(priority=3)
public void login()
{
	System.out.println("the function will login sucessfully");
}
@Test(priority=1)
public void passwordchange()
{
	System.out.println("password should change sucessfully");
}
@Test(priority=2)
public void logout()
{
	System.out.println("the funtion will be logout successfully");
}

}

	


