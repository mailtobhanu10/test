package com.yahoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
WebDriver driver;
By username=By.id("login-username");
By next=By.id("login-signin");
By password=By.xpath("//input[@ id='login-passwd']");
By loginbutton=By.name("verifyPassword");
public  void LoginPage(WebDriver driver)
{
	this.driver=driver;

}
public  void yahooLogin(String uid,String pass)
{
	   driver.findElement(username).sendKeys(uid);
	   driver.findElement(next).click();
	   driver.findElement(password).sendKeys(pass);
	   driver.findElement(loginbutton).click();
}}
/*public void typeUserName(String uid1)
{
	   driver.findElement(username).sendKeys(uid1);
}
public void clicknext()
{
	   driver.findElement(next).click();
}
public void typePassword(String pass1)
{
	   driver.findElement(password).sendKeys(pass1);
}
public void clickONLoginButton()
{
	  driver.findElement(loginbutton).click();
}}*/