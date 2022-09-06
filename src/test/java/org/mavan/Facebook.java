package org.mavan;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBys;
import org.pom.LoginPage;

public class Facebook extends BaseClass {

	public static void main(String[] args) {
	     browserLanuch("chrome");
	     urlLanuch("https://www.facebook.com/");
	     maximize();
	     implicityWait(10);
	     LoginPage lp = new LoginPage();
         lp.facebookLogin("124");

	     
	     
	}
}
