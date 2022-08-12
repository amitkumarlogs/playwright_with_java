package com.qa.alkeon.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.alkeon.base.BaseTest;
import com.qa.alkeon.constants.AppConstants;

public class LoginPageTest extends BaseTest{
	
	
	@Test(priority = 1)
	public void loginPageNavigationTest() {
		loginPage=landingPage.clickSignInButton();
		String actualTitle=loginPage.getLoginPageTitle();
		System.out.println("Login Page Title .."+actualTitle);
		Assert.assertEquals(actualTitle, AppConstants.LOGIN_PAGE_TITLE);
		
		
	}
	
	@Test(priority = 2)
	public void loginTest() {
		loginPage=landingPage.clickSignInButton();
		loginPage.loginToAlkeonBorn(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		
		
	}

}
