package playwright_automation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightLocator5 {
	
	public static void main(String [] args) {
		
		
		
		//Locate the web element by using xPath
		
	Playwright pw=Playwright.create();
	BrowserType br=pw.chromium();
	//BrowserType br=pw.firefox();
	//BrowserType br=pw.webkit();
	//Browser browser=br.launch(new BrowserType.LaunchOptions().setHeadless(false));
	Browser browser=br.launch(new BrowserType.LaunchOptions().setChannel("chromium").setHeadless(false));
	Page page=browser.newPage();
	page.navigate("https://www.facebook.com");
	String title=page.title();
	String url=page.url();
	System.out.println(title+" "+url);
	page.close();
	browser.close();
	pw.close();
	}
}
