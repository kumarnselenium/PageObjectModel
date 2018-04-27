package com.southwest.www.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy (partialLinkText="Log in") WebElement uiLogin;
	
	@FindBy (partialLinkText="Enroll") WebElement uiEnroll;
	
	@FindBy (id="swa-header-link--special-offers") WebElement uiSpecialOffers;
	@FindBy (linkText="Cars") WebElement uiSpecialOffersCars;
	
	@FindBy (id="air-city-departure") WebElement uiDeparture;
	@FindBy (id="air-city-arrival") WebElement uiArrival;
	@FindBy (id="air-date-departure") WebElement uiDapartureDate;
	@FindBy (id="air-date-return") WebElement uiRerurnDate;
	@FindBy (id="air-promo-code") WebElement uiPromoCode;
	@FindBy (id="jb-booking-form-submit-button") WebElement uiFlightSearch;
	
	public void clickLogin()
	{
		uiLogin.click();
	}
	
	public void clickEnroll()
	{
		uiEnroll.click();
	}
	
	public void clickSpecialOffers()
	{
		uiSpecialOffers.click();
	}
	
	public void clickCars()
	{
		uiSpecialOffersCars.click();
	}
	
	
	
	public void flightSearch()
	{
		uiDeparture.clear();
		uiDeparture.sendKeys("LAX");
		
		uiArrival.clear();
		uiArrival.sendKeys("LAS");
		
		uiDapartureDate.clear();
		uiDapartureDate.sendKeys("03/05");
		
		uiRerurnDate.clear();
		uiRerurnDate.sendKeys("04/05");
		
		uiPromoCode.clear();
		uiPromoCode.sendKeys("akflkala");
		
		uiFlightSearch.click();
		
	}
	
}



















