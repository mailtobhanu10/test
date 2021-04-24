package sample;

import static org.junit.Assert.assertArrayEquals;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String str="bhanu";
	char[] obj=str.toCharArray();
	for(int i=obj.length-1;i>=0;i--)
	{
		System.out.println(obj[i]);
	}
		
	
	}

}
