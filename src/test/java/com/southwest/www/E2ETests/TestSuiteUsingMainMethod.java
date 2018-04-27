package com.southwest.www.E2ETests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.southwest.www.Pages.EnrollmentPage;
import com.southwest.www.Pages.FlightSearchResultsPage;
import com.southwest.www.Pages.HomePage;
import com.southwest.www.Pages.LoginPage;

public class TestSuiteUsingMainMethod {
	WebDriver oBrowser;
	
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		oBrowser = new ChromeDriver();
		
		//2. Launch https://www.southwest.com	
		oBrowser.get("https://www.southwest.com");
		
		oBrowser.manage().window().maximize();
		
		oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void testLogin()
	{
		HomePage oHomePage = PageFactory.initElements(oBrowser, HomePage.class);
		LoginPage oLoginPage = PageFactory.initElements(oBrowser, LoginPage.class);
		
		oHomePage.clickLogin();
		oLoginPage.login("fafafhjhgfd", "fgaghlhlh");
		oLoginPage.verifyLoginErrorMessage();
	}
	
	public void testEnrollment()
	{
		HomePage oHomePage = PageFactory.initElements(oBrowser, HomePage.class);
		EnrollmentPage oEnrollmentPage = PageFactory.initElements(oBrowser, EnrollmentPage.class);
		
		oHomePage.clickEnroll();
		oEnrollmentPage.enrollment();
	}
	
	public void testFlightSearch()
	{
		HomePage oHomePage = PageFactory.initElements(oBrowser, HomePage.class);
		FlightSearchResultsPage oFlightSearchResultsPage = PageFactory.initElements(oBrowser, FlightSearchResultsPage.class);
		
		oHomePage.flightSearch();
		oFlightSearchResultsPage.verifyErrorMessage();
	}
	
	public void closeApp()
	{
		oBrowser.quit();
	}

	public static void main(String args[])
	{
		TestSuiteUsingMainMethod oSW = new TestSuiteUsingMainMethod();
		//TS1 - Login
		oSW.openApp();
		oSW.testLogin();
		oSW.closeApp();

		//TS1 - Enrollment
		oSW.openApp();
		oSW.testEnrollment();
		oSW.closeApp();
		
		//TS1 - Flight Search
		oSW.openApp();
		oSW.testFlightSearch();
		oSW.closeApp();
	}
}
