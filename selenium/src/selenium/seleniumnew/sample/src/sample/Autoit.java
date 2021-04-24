package sample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.engprod-charter.net/");
		Runtime.getRuntime().exec("C:\\Users\\super\\Desktop\\Autoitscript\\HandleAuthenticationWindow.exe");
	}

}
