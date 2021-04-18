package sample;

public class Conversion {
	//The java string valueOf() method converts different types of values into string.


		public void m()
		{
			int a=100;
			char k='m';
			String l="bhanu";
			String sb="222";
			
			String sss="333";
			
			
			int s3=Integer.parseInt(sss);
			System.out.println(s3);
			int aa=Integer.parseInt(sb);
			System.out.println(aa);
			
			
			
			int b=300;
			Integer f=Integer.valueOf(b);
			String ss=f.toString();
			
System.out.println(ss);
			String s=Integer.toString(a);
			System.out.println(s);
			String str=Character.toString(k);
			System.out.println(str);
			String u=String.valueOf(l);
			System.out.println(u);
			
		
			//valueof() is the method used to convert the values from int to string
			 int a1=10;
			 String g=String.valueOf(a1);
			 System.out.println(g);
			 
			 
			 //parseint() is the method used to convert the values from string to int
			 
			 String d="1000";
			 int a11=Integer.parseInt(d);
			 System.out.println(a11);
			 

				}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			Conversion obj=new Conversion();
			obj.m();

}}
