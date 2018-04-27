package com.southwest.www.E2ETests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.southwest.www.Pages.HomePage;
import com.southwest.www.Pages.LoginPage;

public class TS1_NegativeLogin {
	WebDriver oBrowser;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver 2");
		oBrowser = new ChromeDriver();
		
		//2. Launch https://www.southwest.com	
		oBrowser.get("https://www.southwest.com");
		
		oBrowser.manage().window().maximize();
		
		oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Parameters({"UserName", "Password"}) //Parameterizing from the TESTNG XML
	@Test
	public void testLogin(String sUID, String sPwd)
	{
		HomePage oHomePage = PageFactory.initElements(oBrowser, HomePage.class);
		LoginPage oLoginPage = PageFactory.initElements(oBrowser, LoginPage.class);
		
		oHomePage.clickLogin();
		oLoginPage.login(sUID, sPwd);
		oLoginPage.verifyLoginErrorMessage();
		System.out.println(sUID + " " + sPwd );
	}
	
	@AfterMethod
	public void closeApp()
	{
		oBrowser.quit();
	}
}
