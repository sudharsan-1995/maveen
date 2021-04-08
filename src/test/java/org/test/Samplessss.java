package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplessss extends FacebookLogin{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-sudharsan framework\\Sample\\Driver\\chromedriver.exe" );
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
FacebookLogin f=new FacebookLogin();
WebElement txtemail = f.getTxtemail();
txtemail.sendKeys("testing");
WebElement txtpass = f.getTxtpass();
txtpass.sendKeys("34567");
WebElement btnlogin = f.getBtnlogin();
btnlogin.click();

	}

}
