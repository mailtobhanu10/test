package tesNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DoRegTest {
@Test
public void doRegTest()
{
	SoftAssert s=new SoftAssert();
	String expectertittle="bbbbbb";
	String actualtittle="bbbbbb1";
	System.out.println("A");
	//Assert.assertEquals(//actualtittle, //expectertittle);
	s.assertEquals(actualtittle, expectertittle);
	System.out.println("b");
	//Assert.assertTrue(2>1,"Error message" );

	
	//for critial and stop/failure---->assert
	//not critical  -failure  -continue -//softassert
	
	}

}
