package sample;

public class NameConvension {
	
	int a=10;
	char c='A';
	float ff=10.34f;
	double dd=7373777;
	long ffd=477433333L;
	Boolean b=true;
	
	int j=30,f,d;
	
	public void m()
	{
		System.out.println("the integer value"+a);
		System.out.println("the integer value"+c);
		System.out.println("the integer value"+ff);
		System.out.println("the integer value"+dd);
		System.out.println("the integer value"+b);
		System.out.println("the integer value"+j +" "+f+ " "+d);
	}
	
	public static void main(String[] args) {
		NameConvension a=new NameConvension();
		a.m();
		
	}

}
