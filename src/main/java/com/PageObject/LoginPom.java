

package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using="//input[@name='email']")
	private WebElement EmailID;
	
	@FindBy(how = How.XPATH, using="//input[@name='pass']")
	private WebElement Password;
	
	@FindBy(how =  How.XPATH, using="//button[@name='login']")
	private WebElement LoginButton;
	
	public LoginPom(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getEmailID() {
		return EmailID;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
}
