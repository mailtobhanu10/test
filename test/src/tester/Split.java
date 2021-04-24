package tester;

public class Split {
	public static void main(String[] args) {
		
		String str="nagaraju is a good boy";
		String s[]=str.split("\\s");
		for(String obj1:s)
		{
			System.out.println(obj1);
		}
	}

}
