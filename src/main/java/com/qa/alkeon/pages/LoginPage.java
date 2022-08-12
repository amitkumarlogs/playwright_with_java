package com.qa.alkeon.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	private Page page;
	//Object Repository
	
	private String emailInput="text=EmailPassword >> [placeholder=\"Email Address\"]";
	private String passwordInput="[placeholder=\"\\*\\*\\*\\*\\*\\*\"]";
	private String signInBtn="button:has-text(\"Sign In\")";
	
	//Page Constructor
		public LoginPage(Page page) {
			this.page=page;
			
		}
		//Page Actions/Methods
		public String getLoginPageTitle() {
			return page.title();
		}
		
		public void loginToAlkeonBorn(String email,String password) {
			page.fill(emailInput, email);
			page.fill(passwordInput, password);
			page.click(signInBtn);
		}

}
