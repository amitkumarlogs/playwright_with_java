package playingwithplaywright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.FilePayload;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class Play {
	public static void main(String args[])  	 
	{  
		//Starting the playwright server server
		Playwright pw=Playwright.create();
		//Getting the browser context
		//Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		
		LaunchOptions lo=new LaunchOptions();
		lo.setChannel("chrome");
		lo.setHeadless(false);
		Browser browser=pw.chromium().launch(lo);
		
		//Getting the page context
		Page page=browser.newPage();
		//Navigating to URL
		page.navigate("https://beta-alkeon-internal.alkeon.app/login");
		//Getting Page title
		String title=page.title();
		System.out.println("My Page title is "+title);

	      // Click text=EmailPassword >> [placeholder="Email Address"]
	      page.locator("text=EmailPassword >> [placeholder=\"Email Address\"]").click();

	      // Fill text=EmailPassword >> [placeholder="Email Address"]
	      page.locator("text=EmailPassword >> [placeholder=\"Email Address\"]").fill("brandlouisvuitton@aol.com");

	      // Click [placeholder="\*\*\*\*\*\*"]
	      page.locator("[placeholder=\"\\*\\*\\*\\*\\*\\*\"]").click();

	      // Fill [placeholder="\*\*\*\*\*\*"]
	      page.locator("[placeholder=\"\\*\\*\\*\\*\\*\\*\"]").fill("Born@1234");

	      // Click button:has-text("Sign In")
	      // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://dev-born.alkeon.app/brands/Za49DmTdqg8Yj0i/showcase/collection"), () ->
	      page.waitForNavigation(() -> {
	        page.locator("button:has-text(\"Sign In\")").click();
	      });

	      // Click .Avatar__image >> nth=0
	      page.locator(".Avatar__image").first().click();

	      // Click #sticky-main-header >> text=Products
	      page.locator("#sticky-main-header >> text=Products").click();
	      // assertThat(page).hasURL("https://dev-born.alkeon.app/brands/Za49DmTdqg8Yj0i/settings/products");

	      // Click button:has-text("Product")
	      page.locator("button:has-text(\"Product\")").click();
	      // assertThat(page).hasURL("https://dev-born.alkeon.app/brands/Za49DmTdqg8Yj0i/product/create");

	      // Click text=Beauty & Wellness
	      page.locator("text=Beauty + Wellness").click();

	      // Click [placeholder="Unique product identification code"]
	      page.locator("[placeholder=\"Unique product identification code\"]").click();

	      // Fill [placeholder="Unique product identification code"]
	      page.locator("[placeholder=\"Unique product identification code\"]").fill("PC2we");

	      // Click [placeholder="Product Name"]
	      page.locator("[placeholder=\"Product Name\"]").click();

	      // Fill [placeholder="Product Name"]
	      page.locator("[placeholder=\"Product Name\"]").fill("Bang slik dress");

	      // Click textarea[name="description"]
	      page.locator("textarea[name=\"description\"]").click();

	      // Fill textarea[name="description"]
	      page.locator("textarea[name=\"description\"]").fill("Very nice dress to wear");

	      // Click [placeholder="e\.g Organic"]
	      page.locator("[placeholder=\"e\\.g Organic\"]").click();

	      // Fill [placeholder="e\.g Organic"]
	      page.locator("[placeholder=\"e\\.g Organic\"]").fill("Organic");

	      // Click .entity-pill__item >> nth=0
	      page.locator(".entity-pill__item").first().click();

	      // Click #description-section >> text=Select from list
	     page.locator("#description-section >> text=Select from list").click();

	      // Click #react-select-6-option-0 >> text=Immediate
	     page.locator("//*[text()='Immediate']").click();

	      // Click .select__picker__indicator.select__picker__dropdown-indicator.css-tlfecz-indicatorContainer >> nth=0
	      //page.locator(".select__picker__indicator.select__picker__dropdown-indicator.css-tlfecz-indicatorContainer").first().click();

	      // Click #react-select-7-option-0 >> text=USD
	     page.locator("//*[text()='Currency']/following-sibling::div//div[@class='select__picker__indicators css-1wy0on6']").click();
	      page.locator("//*[text()='USD']").click();

	      // Click [placeholder="e\.g 250"]
	      page.locator("[placeholder=\"e\\.g 250\"]").click();

	      // Fill [placeholder="e\.g 250"]
	      page.locator("[placeholder=\"e\\.g 250\"]").fill("12");

	      // Click [placeholder="e\.g 500"]
	      page.locator("[placeholder=\"e\\.g 500\"]").click();

	      // Fill [placeholder="e\.g 500"]
	      page.locator("[placeholder=\"e\\.g 500\"]").fill("123");

	      // Click [placeholder="Key ingredients used in the product\. e\.g Aloe"]
	      page.locator("[placeholder=\"Key ingredients used in the product\\. e\\.g Aloe\"]").click();

	      // Fill [placeholder="Key ingredients used in the product\. e\.g Aloe"]
	      page.locator("[placeholder=\"Key ingredients used in the product\\. e\\.g Aloe\"]").fill("aloe");

	      // Click .entity-pill__item.select >> nth=0
	      page.locator(".entity-pill__item.select").first().click();

	      // Click .Product__Form__details > label > .select-picker > .select__picker__control > .select__picker__value-container >> nth=0
	      page.locator(".Product__Form__details > label > .select-picker > .select__picker__control > .select__picker__value-container").first().click();

	      // Click #react-select-8-option-1 >> text=Leaping Bunny
	      page.locator("//*[text()='Leaping Bunny']").click();

	      // Click .Input__label.Input__label--split > .select-picker > .select__picker__control > .select__picker__value-container >> nth=0
	      page.locator(".Input__label.Input__label--split > .select-picker > .select__picker__control > .select__picker__value-container").first().click();

	      // Click #react-select-9-option-1 >> text=Åland Islands
	      page.locator("//*[text()='Åland Islands']").click();

	      // Click [placeholder="e\.g Sea Breeze"]
	      page.locator("[placeholder=\"e\\.g Sea Breeze\"]").click();

	      // Fill [placeholder="e\.g Sea Breeze"]
	      page.locator("[placeholder=\"e\\.g Sea Breeze\"]").fill("Sea Breeze");

	      // Click text=Sea Breeze >> nth=0
	      page.locator("text=Sea Breeze").first().click();

	      // Click [placeholder="e\.g SBR"]
	      page.locator("[placeholder=\"e\\.g SBR\"]").click();

	      // Fill [placeholder="e\.g SBR"]
	      page.locator("[placeholder=\"e\\.g SBR\"]").fill("SBR");

	      // Click #details-section >> text=SBR
	      page.locator("#details-section >> text=SBR").click();

	      // Click [placeholder="e\.g Black"]
	      page.locator("[placeholder=\"e\\.g Black\"]").click();

	      // Fill [placeholder="e\.g Black"]
	      page.locator("[placeholder=\"e\\.g Black\"]").fill("Black");

	      // Click .entity-pill__item.select >> nth=0
	      page.locator(".entity-pill__item.select").first().click();

	      // Click [placeholder="e\.g BLK"]
	      page.locator("[placeholder=\"e\\.g BLK\"]").click();

	      // Fill [placeholder="e\.g BLK"]
	      page.locator("[placeholder=\"e\\.g BLK\"]").fill("BLK");

	      // Click text=BLK >> nth=0
	      page.locator("text=BLK").first().click();

	      // Click #details-section >> text=Select from List
	      page.locator("#details-section >> text=Select from List").click();

	      // Click #react-select-10-option-0 >> text=Black
	      page.locator("//*[text()='Black']").click();

	      // Click #sizingAndMeasurement-section div:has-text("Select from List") >> nth=3
	      page.locator("#sizingAndMeasurement-section div:has-text(\"Select from List\")").nth(3).click();

	      // Click #react-select-11-option-0 >> text=oz
	      page.locator("//*[text()='oz']").click();

	      // Click [placeholder="e\.g 24"]
	      page.locator("[placeholder=\"e\\.g 24\"]").click();

	      // Fill [placeholder="e\.g 24"]
	      page.locator("[placeholder=\"e\\.g 24\"]").fill("24");

	      // Click [placeholder="Additional description of measurement"]
	      page.locator("[placeholder=\"Additional description of measurement\"]").click();

	      // Fill [placeholder="Additional description of measurement"]
	      page.locator("[placeholder=\"Additional description of measurement\"]").fill("32");

	      // Click [placeholder="Select Date"] >> nth=0
	      page.locator("[placeholder=\"Select Date\"]").first().click();

	      // Click [aria-label="Choose Monday\, June 13th\, 2022"]
	      page.locator("[aria-label=\"Choose Monday\\, June 13th\\, 2022\"]").click();

	      // Click [placeholder="Select Date"] >> nth=1
	      page.locator("[placeholder=\"Select Date\"]").nth(1).click();

	      // Click [aria-label="Choose Thursday\, June 30th\, 2022"]
	      page.locator("[aria-label=\"Choose Thursday\\, June 30th\\, 2022\"]").click();

	      // Click #orderInformation-section div:has-text("Select from List") >> nth=3
	      page.locator("#orderInformation-section div:has-text(\"Select from List\")").nth(3).click();

	      // Click #react-select-12-option-7
	     // page.locator("#react-select-12-option-7").click();

	      // Click [placeholder="e\.g 036000029145x"]
	      page.locator("[placeholder=\"e\\.g 036000029145x\"]").click();

	      // Fill [placeholder="e\.g 036000029145x"]
	      page.locator("[placeholder=\"e\\.g 036000029145x\"]").fill("2345678");

	      // Click .fill.nobel >> nth=0
	      page.locator(".fill.nobel").first().click();

	      // Click input[type="file"]
	      page.locator("input[type=\"file\"]").click();

	      // Upload 20220411_164347.jpg
	      page.locator("input[type=\"file\"]").setInputFiles(Paths.get("/Users/amitkumar/Downloads/redSlipDress.jpeg"));
	      // Click button:has-text("done")
	      page.locator("button:has-text(\"done\")").click();

	      // Click button:has-text("save")
	      // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://dev-born.alkeon.app/brands/Za49DmTdqg8Yj0i/settings/products"), () ->
	      page.waitForNavigation(() -> {
	        page.locator("(//span[@class='button--text' and text()='save'])[1]").click();
	      });
	      
	      // Navigating to different tab
	      
	      page.locator("//button[@class='icon-button button button--transparentBg']").click();
	      page.locator("//a[contains(@href,'showcase/instagram')]").click();
	      String aposts=page.locator("//span[@class='Instagram-Info__content__item__title']").innerText();
	      System.out.println("number of Posts displayed in alkeon are : "+aposts);
	   
	      Page iPage= page.waitForPopup(() ->{
		      page.locator("//a[contains(@class,'ViewMore__link')]").click();
 
	      });
	     iPage.locator("//*[@name='username']").fill("amritaxamit");
	     iPage.locator("//*[@name='password']").fill("5hant!Ram");
	     iPage.locator("//*[text()='Log In']").click();
	     iPage.locator("//*[text()='Not now']").click();
	     


	      String iposts=iPage.locator("//li[contains(.,'posts')]//span").innerText();
	      System.out.println("number of Posts displayed in instagram are : "+iposts);
	      if(aposts.contains(iposts)) {
	    	  System.out.println("Test pass for posts");
	      }
	      
		//closing the browser
		browser.close();
		//closing the playwright server
		pw.close();
	}  
}
