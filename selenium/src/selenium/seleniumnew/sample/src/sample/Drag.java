package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		Actions A=new Actions(driver);
		WebElement u=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement u1=driver.findElement(By.xpath("//div[@id='droppable']"));
		A.dragAndDrop(u, u1).perform();
		driver.quit();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drag h=new Drag();
		h.open();
	}

}
