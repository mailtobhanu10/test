package tesNG;

import org.testng.annotations.Test;

public class TestNGEx1 {
	//in this case alphabetical orderly testcases are executed
@Test(priority=1)
public void login()
{
	//System.out.println("login is successfully completed");
}
@Test(priority=1,dependsOnMethods={"login"})
public void doPasswordChange()
{
	System.out.println("password should be changed succesfully");
}

@Test(priority=1)
public void nogout()
{
	System.out.println("ogout succesfully");
}}