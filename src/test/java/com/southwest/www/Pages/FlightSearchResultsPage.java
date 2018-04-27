package com.southwest.www.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FlightSearchResultsPage {

	@FindBy (xpath="//li[contains(.,'The promotion code entered was not recognized')]") WebElement uiErrorMsg;
	
	public void verifyErrorMessage()
	{
		Assert.assertTrue(uiErrorMsg.isDisplayed(), "Expected Error message is not displayed");
		System.out.println("Pass, Expected Error message is displayed");
	}
	
}
