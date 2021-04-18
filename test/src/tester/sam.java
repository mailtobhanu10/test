package tester;

public class sam {
	void m1(int a,char ch)
	{
	System.out.println("this is m1 method");
	System.out.println("a");
	System.out.println("ch");
	}
	static void m2(String str,double d)
	{
	System.out.println("this is m2 method");
	System.out.println("str");
	System.out.println("d");
	}

	public static void main(String[] args) {
		
	
	sam t=new sam();
	t.m1(10,'b');
	sam.m2("bhanu",10.222);
	}}


