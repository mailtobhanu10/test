package tester;

public class Variables1 {
	
	//java is a platform independent 
	//
	static int a;
	static int b;
	public void m(int m,int n)
	{
		int c=10;
		int d=20;
		System.out.println("the value of c"+c);
		System.out.println("the value ob d"+d);
		System.out.println("the value of a"+a);
		System.out.println("the value ob b"+b);
		System.out.println("the value of m"+m);
		System.out.println("the value of n"+n);
		
		
	}

	public static void main(String[] args) {
		
		Variables1 obj=new Variables1();
		obj.m(233,555);
		
	}
}
