package onlyselenium;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Pr {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		p.load(new FileInputStream("F:\\bhanu143\\data.properties"));	
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.findElement(By.id(p.getProperty("sedit"))).sendKeys("selenium");
        driver.findElement(By.name("btnG")).click();
	}

}
