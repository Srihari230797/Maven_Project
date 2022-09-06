package org.mavan;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.FindBy;
import org.pom.ListOfMobile;
import org.pom.OrderPage;
import org.pom.SearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProject extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		 	     browserLanuch("chrome");
		 	     urlLanuch("https://www.flipkart.com/");
		 	     maximize();
		 	     implicityWait(10);
		 	     
		 	     //-------------first page-------------------//
		 	     SearchPage sp = new SearchPage();
		 	     click(sp.getClose());
		 	     sendKeysEnter(sp.getSearchInput(), "redmi mobiles");
		 	    
		 	    //-------------select mobile-------------------//
		 	    refresh();
		 	    ListOfMobile lom = new ListOfMobile();
		 	    click(lom.getClcikFirstLink());
		 	    
		 	    //----------third page-------------------------//
		 	     OrderPage  op = new OrderPage();
                 windowsHandle(1);
 	             click(op.getClickOrder());
 	             Thread.sleep(2000);
 	             sendKeys(op.getUsername(), "9566967272");
 	             click(op.getClcickContinue());
 	            sendKeys(op.getPass(), "Srihari1997@");
 	             click(op.getClcickContinue());
 	             
		 	    
	}

}
