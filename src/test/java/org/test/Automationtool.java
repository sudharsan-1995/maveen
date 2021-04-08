package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtool {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-sudharsan framework\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("raja");
	driver.findElement(By.id("pass")).sendKeys("password");
	driver.findElement(By.name("login")).click();
	
	
	
	
	}

}
