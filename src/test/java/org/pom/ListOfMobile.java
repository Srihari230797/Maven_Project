package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfMobile extends BaseClass {
	public ListOfMobile() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement clcikFirstLink;
	public WebElement getClcikFirstLink() {
		return clcikFirstLink;
	} 
	
	
	

}
