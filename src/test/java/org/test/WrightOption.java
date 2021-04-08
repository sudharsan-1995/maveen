package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrightOption {
    public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-sudharsan framework\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");

	
    	driver.manage().window().maximize();
		Thread.sleep(4000);
	    WebElement options = driver.findElement(By.id("countries"));
		Select select=new Select(options);
		List<WebElement> options2 = select.getOptions();
		
		File file =new File("C:\\Users\\karth\\eclipse-sudharsan framework\\Sample\\excel\\options.xlsx");
		Workbook workbook =new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("data");
		
		
		for (int i = 0; i < options2.size(); i++) {
			
		
			WebElement webElement = options2.get(i);
			String text = webElement.getText();
			Row Row = sheet.createRow(i);
			Cell Cell = Row.createCell(0);
			Cell.setCellValue(text);
				
			
		}
		FileOutputStream fileoutputstream=new FileOutputStream(file);
		workbook .write(fileoutputstream);
		System.out.println("Don.......");
		
		
		
		
	}
}
