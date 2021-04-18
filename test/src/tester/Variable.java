package tester;

public class 	Variable {
	
	static int a;//global varibles/cls var/instancevariables
	static int b;

	public void add3()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("the sum of a and b ========="+c);
			
		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Variable s=new Variable();
	s.add3();

		}

	}