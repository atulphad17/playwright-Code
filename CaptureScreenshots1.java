package playwright_automation;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CaptureScreenshots1 {
	public static void main(String [] args) throws InterruptedException {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));	
		Page page=browser.newPage();
		page.navigate("https://www.facebook.com");
		
		System.out.println(page.title()+" "+page.url());
		
//		//page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshot/screenshot1"+".png")));
//		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshot/screenshot2"+".png")).setFullPage(true));
//		
		
//		byte [] buffer=page.screenshot();
//		System.out.println(Base64.getEncoder().encodeToString(buffer));
		
		
		captureScreenshot(page);
		
		Thread.sleep(2000);
		browser.close();
		
		
		
		
	}
	
	public static void captureScreenshot(Page page) {
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyy_MMMMM_dd_GGG_hh_mm_aaa");
		Date date=new Date();
		String customDateFormat=simpleDateFormat.format(date);
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshot/facebook"+customDateFormat+".png")));
		
		
	}

}
