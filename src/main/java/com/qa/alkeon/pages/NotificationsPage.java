package com.qa.alkeon.pages;

import com.microsoft.playwright.Page;

public class NotificationsPage {
	private Page page;
	//Object Repository
		private String searchBrands="";
		
		//Page Constructor
		public NotificationsPage(Page page) {
			this.page=page;
			
		}
		
		//Page Actions/Methods
		
		public String getNotificationsPageTitle() {
			String title= page.title();
			System.out.println("Title of the Pgae is "+title );
			return title;
		}

}
