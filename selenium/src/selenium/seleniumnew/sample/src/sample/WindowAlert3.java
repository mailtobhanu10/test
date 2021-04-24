package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowAlert3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
driver.get("https://www.eclipse.org/downloads/download.php?file=/oomph/epp/oxygen/R/eclipse-inst-win64.exe");
driver.findElement(By.xpath("//a[@class='btn btn-warning margin-bottom-15 btn-lg']")).click();
	Thread.sleep(5000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	}

}
