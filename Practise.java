package playwright_automation;

import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

import com.microsoft.playwright.Locator;


public class Practise {
	
	public static void main(String [] args) {
		
		
		
	
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		
		page.navigate("https://www.naukri.com/");
		
		Locator login=page.locator("//a[@title='Jobseeker Login']");
		
		UtilityClass.captureScreenshots(page);
		
		browser.close();
		
		
		}
	}

	
	
	

