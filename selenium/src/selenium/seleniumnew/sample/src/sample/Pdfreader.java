package sample;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pdfreader {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://www.istqb.org/downloads/category/2-foundation-level-documents.html");
driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[3]/table[4]/tbody/tr/td[4]/p/a")).click();
ArrayList<String>Lst=new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(Lst.get(1));
PDDocument doc=PDDocument.load(new URL(driver.getCurrentUrl()));
String x1=new PDFTextStripper().getText(doc);
System.out.println( x1);

	}

	
}
