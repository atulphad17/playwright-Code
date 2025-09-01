package playwright_automation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator;

public class Locator2 {
	
	public static void main(String [] args) {
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("http://www.facebook.com/");
		
		System.out.println(page.title());
		System.out.println(page.url());
		
		// locate the web-element by using xpath or cssSelector
		
//		page.locator("//input[@name='email']").fill("vasant@facebook.com");
//		page.locator("//input[@name='pass']").fill("vasant@123$");
//		page.locator("//button[@name='login']").click();
		
		
//		page.fill("//input[@name='email']","vasant@facebook.com");
//		page.fill("//input[@name='pass']","vasant@1234%");
//		page.click("//button[@name='login']");
		
//		page.locator("//input[@name='email']").type("vasant@facebook.com");
//		page.locator("//input[@name='pass']").type("vasant@123$");
		
//		page.type("//input[@name='email']","vasant@facebook.com");
//		page.type("//input[@name='pass']","vasant@123$");
//		
//		Thread.sleep(3000);
//		
//		System.out.println(page.title());
//		System.out.println(page.url());
		
		
//		page.fill("xpath=//input[@name='email']","vasant@facebook.com");
//		page.fill("xpath=//input[@name='pass']","vasant@1234%");
//		page.click("xpath=//button[@name='login']");
		
//		page.fill("css=input[name='email']","vasant@facebook.com");
//		page.fill("css=input[name='pass']","vasant@1234%");
//		page.click("css=button[name='login']");
		
		
//		page.fill("#email","vasant@facebook.com"); // attribute name --> id ---> #attributevalue 
//		page.fill("#pass","vasant@1234%");
//		page.click("button[name='login']");
		
		
		Locator txtEmail = page.locator("#email");
		System.out.println(txtEmail.count());
		txtEmail.fill("vasant@gmail.com");
		
		Locator links = page.locator("//a[contains(text(),'Privacy')]");
		System.out.println(links.count());
		//links.click();
		
		//links.first().click();
		links.last().click();
		
//		page.close();
//		browser.close();
		
		
	}

	
	}

	
	
	
	


