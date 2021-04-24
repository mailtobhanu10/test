package tesNG;

import org.testng.annotations.Test;

public class TestNGExPrority1 {
	//in this case are  executed prioritywise
@Test(priority=2)
public void login()
{
	System.out.println("login is successfully completed");
}
@Test(priority=1)
public void doPasswordChange()
{
	System.out.println("password should be changed succesfully");
}

@Test(priority=3)
public void nogout()
{
	System.out.println(",logout succesfully");
}}

