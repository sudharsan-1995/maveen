package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
         driver.manage().window().maximize();
	}
	public void launchUrl(String url) {
		driver.get(url);

	}
	public void enterText1(WebElement element,String textValue) {
		element.sendKeys(textValue);
	}
	//actions method
	
	public void dragdrop(WebElement source, WebElement  destion) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, destion).perform();
	
	}
	public void contextclick(WebElement element , WebElement contextclick) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	
	public  void doubleclick(WebElement Element,  WebElement doubleclick) {
		Actions a=new Actions(driver);
        a.doubleClick().perform();
	}
	//robot method
	public void keypress(WebElement element, Robot keydown) throws AWTException {
	Robot r=new Robot();	
 r.keyPress(0);
 
	}
	public void keyrelease(WebElement element, Robot keydown) throws AWTException {
		Robot r=new Robot();	
		r.keyRelease(0);
		
	}
	public void mousemove(WebElement element, Robot mouse) throws AWTException {
		Robot r=new Robot();	
		r.mouseMove(0, 0);
	
		
	}
	public void mousepress(WebElement element, Robot mouse) throws AWTException {
		Robot r=new Robot();
		r.mousePress(0);
	}
	public void mouserelease(WebElement element, Robot mouse) throws AWTException {
		Robot r=new Robot();
		r.mouseRelease(0);
	}
	//WebElement methods
		public void enterText(WebElement element, String s) {
			element.sendKeys(s);

		}
		public void btnClick(WebElement element) {
			element.click();

		}
		public void text(WebElement element) {
		element.getText();

		}
		
		
		
		
		//Alert Methods
		public void simpleAlert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		public void confirmAlert() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		public void promptAlert(String s) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(s);
		}
		//TakesScreenShot 
		public void screenshot(String data) throws IOException {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File (System.getProperty("user.dir")+"\\target\\"+data+".png");
			FileUtils.copyFile(source, destination);
		}
		
			//DropDown
		public void visibleText(WebElement element,String value) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
			
			
		}
		
		public void deSelectVisible(WebElement element,String value) {
			Select s = new Select(element);
			s.deselectByVisibleText(value);
			
			
		}
		public void visibleIndex(WebElement element , int value) {
			Select s = new Select(element);
			s.selectByIndex(value);

		}
		public void multipleCheck(WebElement element ) {
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		
			}
			
			public void optionsParticularValue(WebElement element,String text1) {
				Select s = new Select(element);
				List<WebElement> options = s.getOptions();
				for (int i = 0; i <options.size(); i++) {
					WebElement webElement = options.get(i);
				    String text = webElement.getText();
					if(text.equals(text1)) {
					s.selectByVisibleText(text);
					}
				}
				}
				public void optionsmorethanonevalue(WebElement element,String text1,String  text2) {
					Select s = new Select(element);
					List<WebElement> options = s.getOptions();
					for (int i = 0; i <options.size(); i++) {
						WebElement webElement = options.get(i);
						String text = webElement.getText();
						if(text.equals(text1) || (text.equals(text2))){
						s.selectByVisibleText(text);
						}
					}
		}
		public void desellect(WebElement element,String value) {
			Select s = new Select(element);
			s.deselectByVisibleText(value);

		}
		public void getFirst(WebElement element) {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption);
		}
		public void getAllSelected(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				String text = webElement.getText();
				s.selectByVisibleText(text);
			}
		}
		
		public void getWindowHandle() {
			driver.getWindowHandle();
		}
		public void getWindowHandles() {
			driver.getWindowHandles();
	}
		public void switchWindow(String s) {
			driver.switchTo().window(s);

		}
		//JavaScriptExecutor
		public void javaScriptScrollDown(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		public void javaScriptScrollUp(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);

		}
		
		public void getAttribute(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
			System.out.println(executeScript);
		}
		public void setAttribute(String name ,WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Object executeScript = js.executeScript("arguments[0].getAttribute(name,'value')", element);
			System.out.println(executeScript);
		}
			
		public void close() {
			driver.close();

		}
		private void quit() {
			driver.quit();
		}
       public void get() {
		driver.get(null);
	}
       public void gettitle() {
		driver.getTitle();
		
	}
       public  void getcurrenturl() {
		driver.getCurrentUrl();
	}
       public void manage() {
	driver.manage();

	}
       //frame method
public void frame(WebElement Element, String value) {
	driver.switchTo().frame("email");
	}

	public void switchto() {
		driver.switchTo();
	}
	public void to(WebElement element) {
		driver.toString();
		
}
	//navigation method
	public void back() {
		driver.navigate().back();
	}
	public void to() {
		driver.navigate().to("dfghj");
	}
	public void forward() {
		driver.navigate().forward();

	}
	public void refresh() {
		driver.navigate().refresh();
	}
	public  void navigation() {
		driver.navigate();
	}
		
		
}

		

		
		
		

	
	
		
	
	


