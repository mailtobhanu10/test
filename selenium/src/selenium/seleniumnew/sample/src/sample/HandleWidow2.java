package sample;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWidow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String ParentWindow= driver.getWindowHandle();
		System.out.println("parent window id"+ParentWindow);
		Set<String>AllWindows=driver.getWindowHandles();
		///handle popupwindows 
		ArrayList<String>Tabs=new ArrayList<>(AllWindows);
		driver.switchTo().window(Tabs.get(2));
		driver.close();
		driver.switchTo().window(Tabs.get(1));
		driver.close();
		driver.switchTo().window(Tabs.get(0));
		System.out.println("title of ParentWindow"+driver.getTitle());
		    	
		
		
		
	}

}
