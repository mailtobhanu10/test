package sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {

	@BeforeClass  // class file executed at one time before class
	public void beforeclass()
	{
		System.out.println("intialise selenium");
	}
		
		
	@BeforeMethod
		public void beforemethod()//before every test
		{
			System.out.println("open the browser");
		}

		@Test
		public void test1()
		{
			System.out.println("inside test 1");
		}
		@Test
		public void test2()
		{
			System.out.println("inside test 2");
		}
		@AfterMethod //after every test
		public void aftermethod()
		{
			System.out.println("close the browser");
		}

	   @AfterClass
	   public void afterclass()
	   {
		   System.out.println("destroy the selenium");
	   

	}

}
