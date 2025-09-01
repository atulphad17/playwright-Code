package playwright_Popup;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleJsAlert {
	
	public static void main(String []  args) {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		
		page.onDialog(dialog->{
			String text=dialog.message();
		//	Assert.assertEquals(text,"I am a JS Alert");
			System.out.println(text);
			
			page.waitForTimeout(2000);
			dialog.accept();
			
		});
		
		page.getByText("Click for JS Alert").click();
		
		System.out.println(page.title()+" --------------- "+page.url());
		
		browser.close();
	}

}
