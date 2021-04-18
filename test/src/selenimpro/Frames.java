package selenimpro;

import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/testingpage/");
		java.util.List<WebElement> lst=driver.findElements(By.xpath("//li[@id='menu-item-9634']/a"));
		
		lst.get(3).click();
		
		
		
		
	}
	

}
