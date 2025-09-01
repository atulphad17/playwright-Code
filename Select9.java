package playwright_automation;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator;

public class Select9 {

	
	public static void main(String [] args) throws InterruptedException {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		
		page.navigate("https://www.facebook.com");
		
		page.getByTitle("Sign up for Facebook").click();
		
		Locator days=page.getByTitle("Day");
		Locator months=page.getByTitle("Month");
		Locator years=page.getByTitle("Year");
//		
//		days.selectOption("17");
//		months.selectOption("Jul");
//		years.selectOption("1996");
		
//		page.waitForTimeout(2000);
//		Locator months=page.locator("select#month option");
//		System.out.println(months.count());
//		
		
		//Approach 1
		
//		for (int i=0 ;i<=months.count();i++) {
//			
//			String month=months.nth(i).textContent();
//			
//			System.out.println(month);
//			
//			if (month.equals("Sep")) {
//				System.out.println("condition matched");
//				break;
//			}
//		}
//		
		
//		List<String >monthsOption=months.allTextContents();
//		System.out.println(monthsOption);
//		
//		List<String>monthsOption=months.allInnerTexts();
//		System.out.println(monthsOption);
	
		selectDropdownOption(days,"22");
		selectDropdownOption(months,"Jul");
		selectDropdownOption(years,"1995");
		
		
	}
	
	static void selectDropdownOption(Locator dropdown,String value) {
		dropdown.selectOption(value);

	}
	

}
