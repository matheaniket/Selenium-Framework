package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Verify_Login extends BaseClass {
	
	@Test
	public void verify_login() {
		
		
		LoginPom login = PageFactory.initElements(driver, LoginPom.class);
		
		Library.custon_SendKeys(login.getEmailID(), excel.getStringData("Sheet1", 0, 0), "EmailID");
		Library.custon_SendKeys(login.getPassword(), excel.getStringData("Sheet1", 0, 1), "Password");
		Library.custom_Click(login.getLoginButton(), "Login");
		
	}

}
