package org.base;

import java.awt.Robot;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions action ;
	public static JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public static WebDriver browserLanuch(String name) {
		
	   if(name.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
	   }
	   else if(name.equalsIgnoreCase("edge")) {
		   WebDriverManager.edgedriver().setup();
		   driver = new ChromeDriver();
	   }
	   return driver;

	}
	
	public static void urlLanuch(String url) {
      driver.get(url);
	}
	
	public static void maximize() {
		
      driver.manage().window().maximize();
	}
	
	public static void implicityWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	
	public static void sendKeys(WebElement ref_WebElement,String value) {
		ref_WebElement.sendKeys(value);

	}
	public static void sendKeysEnter(WebElement ref_WebElement,String value ) {
		ref_WebElement.sendKeys(value,Keys.ENTER);

	}
	
    public static void click(WebElement name) {
		name.click();
	}
	
    public static  void close() {
      driver.close();
	}
 
    public static  void quit() {
      driver.quit();
	}
    
    //-------------Action-----------------------------
    public static void contextClick(WebElement source) {
    	action = new Actions(driver);
    	action.contextClick(source).perform();	
	}
    public static void clickAndHold(WebElement source) {
    	action = new Actions(driver);
    	action.clickAndHold(source).perform();	
	}
    public static void doubleClick(WebElement source) {		
    	action = new Actions(driver);
    	action.doubleClick(source).perform(); 	
	}
    public static void dragAndDrop(WebElement source,WebElement target) {
    	action = new Actions(driver);
    	action.dragAndDrop(source, target).perform();
	}
    public static void release(WebElement source) {	
    	action = new Actions(driver);
    	action.release(source).perform();
	}
    public static void moveToElement(WebElement source) {	
    	action = new Actions(driver);
    	action.moveToElement(source).perform();
	}

    public static void javaScript(WebElement source, String value) {
		js.executeScript("arguments[0].setAttribute(('value','"+value+"')", source);
	}
    
    public static void refresh() {
    	driver.navigate().refresh();
	}
    
    public static void windowsHandle(int id) {
 	    Set<String> windowHandles = driver.getWindowHandles();
 	    List<String> li = new LinkedList<String>();
 	    li.addAll(windowHandles);		
 	    driver.switchTo().window(li.get(id));
    }
}
