package sample;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindow1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.seleniumpractise.blogspot.in");
		String ParentWindow= driver.getWindowHandle();
		System.out.println("parent window id"+ParentWindow);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[2]/div/div/div/div[2]/a[1]")).click();
		

		

		Set<String>AllWindows=driver.getWindowHandles();
		
		int count=AllWindows.size();
		for(String Chaild:AllWindows)
		{
			if(ParentWindow.equalsIgnoreCase(Chaild))
					{
				driver.switchTo().window(Chaild);
				//driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/input[3]")).sendKeys("selenium");
	            //driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[3]/center/input[1]")).click();
				driver.findElement(By.name("q")).sendKeys("selenium");
				driver.findElement(By.name("btnK")).click();
				Thread.sleep(3000);	
				driver.close();
				
					}
			driver.switchTo().window(ParentWindow);
			
		}}
}
