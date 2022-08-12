package com.qa.alkeon.base;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.qa.alkeon.factory.PlaywrightFactory;
import com.qa.alkeon.pages.LandingPage;
import com.qa.alkeon.pages.LoginPage;

public class BaseTest {
	PlaywrightFactory playwrightFactory;
	Page page;
	protected Properties prop;
	
	protected LandingPage landingPage;
	protected LoginPage loginPage;

	@BeforeTest
	public void setup() {
		playwrightFactory = new PlaywrightFactory();
		prop=playwrightFactory.setupConfig();
		page = playwrightFactory.initBrowser(prop);
		landingPage = new LandingPage(page);

	}

	@AfterTest

	public void tearDown() {
		page.context().browser().close();
	}

}
