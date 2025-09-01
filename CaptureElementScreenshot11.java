package playwright_automation;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator;

public class CaptureElementScreenshot11 {
	
	public static void main(String [] args) {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		
		page.navigate("https://www.facebook.com");
		
		Locator form=page.getByTestId("royal_login_form");
		
		form.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./Screenshot/Facebook.png")));
		
		
		browser.close();
	
	}
	

}
