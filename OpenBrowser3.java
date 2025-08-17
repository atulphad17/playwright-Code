package playwright_automation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OpenBrowser3 {
	
	public static void main(String [] args) {
		
		
		Playwright pw = Playwright.create();//establish connection
		
		//BrowserType browserType=pw.chromium();
		//By default it launch the browser in headless mode
		
		//Browser browser=browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
		//Page page=browser.newPage();
		
		
		
		
		//Browser browser=pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//Browser browser=pw.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		
		Page page=browser.newPage();
		
		page.navigate("https://www.facebook.com/");
		
		String title=page.title();
		
		System.out.println("Facebook title: "+title);

		String url=page.url();
		System.out.println("Facebook url"+ url);
		
	}

}
