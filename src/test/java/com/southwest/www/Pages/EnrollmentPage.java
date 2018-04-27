package com.southwest.www.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollmentPage {

	@FindBy (id="js-customer-first-name") WebElement uiFirstName;
	@FindBy (id="js-customer-middle-name") WebElement uiMiddleName;
	@FindBy (id="js-customer-last-name") WebElement uiLastName;
	@FindBy (id="js-submit-button") WebElement uiCreateMyAccount;
	
	
	public void enrollment()
	{
		uiFirstName.clear();
		uiFirstName.sendKeys("FName");
		
		uiMiddleName.clear();
		uiMiddleName.sendKeys("MName");
		
		uiLastName.clear();
		uiLastName.sendKeys("LName");
		
		uiCreateMyAccount.click();
	}
}
