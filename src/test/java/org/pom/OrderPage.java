package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BaseClass{
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='BUY NOW']")
	private WebElement clickOrder;
	public WebElement getClickOrder() {
		return clickOrder;
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clcickContinue;
	public WebElement getClcickContinue() {
		return clcickContinue;
	}
	
}
