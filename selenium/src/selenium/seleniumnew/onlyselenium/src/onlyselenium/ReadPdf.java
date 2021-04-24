package onlyselenium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ReadPdf {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://istqbexamcertification.com/");
		//driver.findElement(By.xpath("//span[contains[test(),'ISTQB Dumps – Mock Tests']")).click();
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div/ul/li[6]/a/span")).click();
	      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/main/article/div/p[6]/a")).click();
	      ArrayList<String>lst=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window((lst.get(1)));
	      PDDocument doc=PDDocument.load(new URL(driver.getCurrentUrl()));
	      String x1=new PDFTextStripper().getText(doc);
	      System.out.println(x1);
	      
	}

}
