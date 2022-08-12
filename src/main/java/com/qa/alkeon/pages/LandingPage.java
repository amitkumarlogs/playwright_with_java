package com.qa.alkeon.pages;

import com.microsoft.playwright.Page;

public class LandingPage {
	private Page page;
	
	//Object Repository
	private String searchBrands="//input[@id='search-bar']";
	private String signInBtn="//div[text()='SIGN IN']";
	private String brandNameOnCard="(//div[@class='card__details__container__header__section__title'])[1]";
	private String sortByDropdownField="//*[@class='select__picker__single-value css-1uccc91-singleValue']";
	
	//Page Constructor
	public LandingPage(Page page) {
		this.page=page;
		
	}
	
	//Page Actions/Methods
	
	public String getLandingPageTitle() {
		String title= page.title();
		System.out.println("Title of the Pgae is "+title );
		return title;
	}
	
	public LoginPage clickSignInButton() {
		page.click(signInBtn);
		return new LoginPage(page);
		
	}
	
	public String searchBrands(String brandName)  {
		page.fill(searchBrands, brandName);
		page.locator(brandNameOnCard).waitFor();
		String brandNameResult=page.textContent(brandNameOnCard);
		return brandNameResult; 
		
	}
	
	

}
