package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Property {

public void open() throws Exception
{
File f=new File("F:\\my project all\\practiseall\\newsample.property");
FileInputStream fis=new FileInputStream(f);
Properties pro=new Properties();
pro.load(fis);
String chromepath=pro.getProperty("ChromeDriver");
System.out.println("the file path o chrome is"+chromepath);

}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
Property obj=new Property();
obj.open();
	}

}
