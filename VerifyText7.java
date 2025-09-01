package playwright_automation;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator;

public class VerifyText7 {
	
	public static void main(String [] args) {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("https://www.facebook.com");
		Locator links=page.locator("//a");
		int totalLinks=links.count();
		System.out.println(totalLinks);
		
		Locator h2Ele=page.locator("._8eso");
		String h2=h2Ele.textContent();
		System.out.println(h2);
		
		String h2txt=h2Ele.textContent();
		System.out.println(h2txt);
		
		System.out.println(h2Ele.innerHTML());
		
		//Approach 1
//		for (int i=0; i<totalLinks;i++) {
//			
//			String text=links.nth(i).textContent();
			//System.out.println(text);
			
//			if (text.contains("Sign Up")) {
//				links.nth(i).click();
//				break;
//			}
//		}
//		
		List<String> linkText=links.allTextContents();
		//List <String> linkText=links.allInnerTexts();
		
		
//		for (int i=0; i<linkText.size();i++) {
//			
//			String text=linkText.get(i);
//			System.out.println(text);
//		}
//		
//		System.out.println(page.title()+" "+page.url());
		
//		for (String text:linkText) {
//			System.out.println(text);
//		}
		
		
		//linkText.stream().forEach(e->System.out.println(e));
//		linkText.forEach(e->System.out.println(e));
//		
		
		page.close();
		browser.close();
		
		
	}

}
