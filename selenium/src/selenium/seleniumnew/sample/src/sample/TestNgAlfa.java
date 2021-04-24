

///testcases should be executed according to the alfabetical  order

package sample;

import org.testng.annotations.Test;

public class TestNgAlfa {
	@Test
	public void login()
	{
		System.out.println("the function will login sucessfully");
	}
	@Test
	public void passwordchange()
	{
		System.out.println("password should change sucessfully");
	}
	@Test
	public void logout()
	{
		System.out.println("the funtion will be logout successfully");
	}

}
