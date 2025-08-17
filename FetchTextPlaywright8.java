package playwright_automation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator;

public class FetchTextPlaywright8 {

	
	public static void main(String [] args) {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();

		page.navigate("https://www.facebook.com");
		
		Locator links=page.locator("//a");
		
		int totalLinks=links.count();
		
		System.out.println(totalLinks);
		
		Locator h2Ele =page.locator("._8eso");
		String h2 = h2Ele.textContent();
		System.out.println(h2);
		
		String h2txt=h2Ele.innerText();
		System.out.println(h2);
		
		
		System.out.println(h2Ele.innerHTML());
		

		for (int i=0;i<totalLinks;i++) {
			
			String text=links.nth(i).textContent();
			System.out.println(text);
		}
	}
}
