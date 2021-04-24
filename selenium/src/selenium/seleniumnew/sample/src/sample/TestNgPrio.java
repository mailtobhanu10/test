
//according to priority we give the test cases will be executed 

package sample;

import org.testng.annotations.Test;

public class TestNgPrio {
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



