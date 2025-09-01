package playwright_Popup;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleJsPrompt {

	
	public static void main(String [] args) {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page =browser.newPage();
		
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		
		page.onDialog(dialog->{
			String text=dialog.message();
			
			page.waitForTimeout(2000);
			dialog.accept("welcome to js prompt");
			
		});
		
		page.getByText("Click for JS Prompt").click();
		
	
	
	
	}
}
