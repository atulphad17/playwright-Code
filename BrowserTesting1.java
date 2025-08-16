package playwright_automation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserTesting1 {
	
	public static void main(String [] args) throws InterruptedException {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		
		page.navigate("https://www.facebook.com");
		
		System.out.println(page.title());
		System.out.println(page.url());
		
//		page.locator("//input[@name='email']").fill("atulphad@123");
//		page.locator("//input[@name='pass']").fill("atul123");
//		page.locator("//button[@name='login']").click();
//		
		
//		page.fill("//input[@name='email']","atulphad@123");
//    	page.fill("//input[@name='pass']","atul123");
//  		page.click("//button[@name='login']");
//		
//		page.fill("xpath=//input[@name='email']","atulphad@123");
//    	page.fill("xpath=//input[@name='pass']","atul123");
// 		page.click("xpath=//button[@name='login']");
//		
		
//		page.fill("css=input[name='email']","atulphad@123");
//  	    page.fill("css=input[name='pass']","atul123");
//  		page.click("css=button[name='login']");

		
		page.fill("#email", "atulphad123");
		page.fill("#pass", "atul123");
		page.click("button[name='login']");
		
		
		Thread.sleep(2000);
		
		System.out.println(page.title());
		System.out.println(page.url());

	}

}
