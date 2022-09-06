package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement close;
    public WebElement getClose() {
		return close;
	}




	@FindBy(xpath="//input[@type='text']")
	private WebElement searchInput;
	public WebElement getSearchInput() {
		return searchInput;
	}
}
