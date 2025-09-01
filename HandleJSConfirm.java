package playwright_Popup;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleJSConfirm {
	public static void main(String [] args) {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		page.onDialog(dialog->{
			String text=dialog.message();
			System.out.println(text);
			
			page.waitForTimeout(2000);
			dialog.dismiss();
			
		});
		
		page.getByText("Click for JS Confirm").click();
		
		browser.close();
		
	}

}
