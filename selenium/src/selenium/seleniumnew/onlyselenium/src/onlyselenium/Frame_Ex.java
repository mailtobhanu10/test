package onlyselenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Ex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/droppable/");
//webpage in that haviing a frame
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
//in that fram
WebElement w1=driver.findElement(By.id("draggable"));

WebElement w2=driver.findElement(By.id("droppable"));
new Actions(driver).dragAndDrop(w1, w2);
driver.switchTo().window(driver.getWindowHandle());
driver.findElement(By.linkText("Selectable")).click();
File f=driver.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f,new File("E:\\bhanu.png"));
	}

}
