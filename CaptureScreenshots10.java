package playwright_automation;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CaptureScreenshots10 {
	public static void main(String [] args)
	{
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page =browser.newPage();
		
		page.navigate("https://www.facebook.com");
		
		System.out.println(page.url()+" "+page.title());
		
	//	byte [] arr=page.screenshot()
		
		//page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots1.png")));
		
		page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("screenshots2.png")));
		
		browser.close();
		
	}
}
