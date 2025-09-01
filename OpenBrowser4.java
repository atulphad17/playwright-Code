package playwright_automation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;

public class OpenBrowser4 {
	public static void main(String [] args) {
		
		//Browser browser =Playwright.create().chromium().
		//		         launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		Playwright pw =Playwright.create();
		
		LaunchOptions options=new LaunchOptions();
		options.setChannel("chrome");
		options.setHeadless(false);
		
		
		Browser browser=pw.chromium().launch(options);
		
		Page page =browser.newPage();
		
		page.navigate("https://www.gmail.com");
				
		
		page.close();
		browser.close();
		pw.close();
	}

}
