package com.qa.alkeon.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.alkeon.base.BaseTest;
import com.qa.alkeon.constants.AppConstants;

public class LandingPageTest extends BaseTest{
	
	
	
	@Test
	public void TC001_Verify_landingPageTitle() {
		String actualTitle=landingPage.getLandingPageTitle();
		Assert.assertEquals(actualTitle, AppConstants.LANDING_PAGE_TITLE);
	}
	
	@DataProvider
	public Object[][] getBrandNameData() {
		return new Object[][] {
			{"Zivame"},
			{"adidas"}
			
			

			
		};
	}
	
	@Test(dataProvider = "getBrandNameData")
	public void TC002_Verify_searchBrandOnLandingPage(String brandName)  {
		System.out.println("Expected text...."+brandName);
		String searchResult=landingPage.searchBrands(brandName);
		System.out.println("Actual text...."+searchResult);
		System.out.println("Actual bool...."+searchResult.contains(brandName));


		Assert.assertEquals(searchResult.contains(brandName), true);
	}
	
	

}
