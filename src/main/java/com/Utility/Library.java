package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class Library {
	
	public static void custon_SendKeys(WebElement element, String value, String fieldname) {
		try {
			element.sendKeys(value);
			ObjectRepo.test.log(Status.PASS, "Value Successfully send="+value);
		}catch(Exception e) {
			System.out.println("Unable to send value"+e);
			ObjectRepo.test.log(Status.FAIL, "Unable to send value="+fieldname);
		}
	}
	
	public static void custom_Click(WebElement element, String fieldname) {
		try {
			element.click();
			ObjectRepo.test.log(Status.PASS, "Click Successfully"+fieldname);
		}catch(Exception e) {
			System.out.println("Unable to click"+e);
			ObjectRepo.test.log(Status.FAIL, fieldname+"unable to click"+e);
		}
	}

}
