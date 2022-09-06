package org.pom;

import java.util.LinkedList;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({@FindBy(name="email"),@FindBy(id="email")})
    private List<WebElement> username;
//    public List<WebElement>  getUsername() {
//   	 return username;
//    }
    public void facebookLogin(String usname) {
	     sendKeys(username.get(0), usname);
    }
}
