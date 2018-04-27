package com.southwest.www.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy (id="username") WebElement uiUserName;
	@FindBy (id="password") WebElement uiPassword;
	@FindBy (xpath="//input[@value='Log in']") WebElement uiLoginBtn;
	
	public void login(String sUserName, String sPassword)
	{
		uiUserName.clear();
		uiUserName.sendKeys(sUserName);
		
		uiPassword.clear();
		uiPassword.sendKeys(sPassword);
		
		uiLoginBtn.click();
	}
	
	public void verifyLoginErrorMessage()
	{
		
	}
}
