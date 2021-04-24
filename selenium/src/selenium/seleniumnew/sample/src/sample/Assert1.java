package sample;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assert1 {
	SoftAssert A=new SoftAssert();
	@Test
	public void doreg()
	{
		String expectedtitle="bbbbb";
		String actualtitle="bbbbb1";
		System.out.println("A");
		//Assert.assertEquals( "bbbbb","ggggg");
		System.out.println("B");
		//ssert.assertTrue(2<1, "Erroe message");
		//Assert.assertTrue(isElementPresent("xxxx"), "Element not found");
		///critical--->stop the exection---->in this case we use assert
		///issue is not critical--->we continue the executin--->in this case we use softassert
	

	}

	private boolean isElementPresent(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
