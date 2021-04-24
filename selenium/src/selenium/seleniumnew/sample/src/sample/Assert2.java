package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {
	SoftAssert a=new SoftAssert();
	@Test
	public void doreg()
	{
		String expectedtitle="bbbbb";
		String actualtitle="bbbbb1";
		System.out.println("A");
		a.assertEquals("bbbbb", "bbbbb1");
		a.assertEquals("A", "C");
		System.out.println("B");
		a.assertAll();
		
}}
