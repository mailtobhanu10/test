package sample;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.id("loginsubmit")).click();
		ArrayList<String>lst=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("//a[@href='https://netbanking.hdfcbank.com/netbanking/']")).click();

//count total number of frames
		/*int total_frames=driver.findElements(By.tagName("frame")).size();
		System.out.println("total frames in application"+total_frames);
		driver.switchTo().frame("login_page");*/
		WebElement Myframe=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"
				));
		driver.switchTo().frame(Myframe);
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("5878888484");
		
	}

}
