package org.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdef.Hook;

public class LoginPageRepo {
	public LoginPageRepo() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
}
