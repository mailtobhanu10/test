package sample;

public class FlowControls {
	int i=10;
	public void m()
	{
		if(false)
		{
			System.out.println(i);
		}
		else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		FlowControls obj=new FlowControls();
		obj.m();
		
	}

}
