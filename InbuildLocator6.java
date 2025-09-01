package playwright_automation;

import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.Locator;

public class InbuildLocator6 {
	
	public static void main(String [] args) {

//		page.getByRole() to locate by explicit and implicit accessibility attributes.
//		page.getByText() to locate by text content.
//		page.getByLabel() to locate a form control by associated label's text.
//		page.getByPlaceholder() to locate an input by placeholder.
//		page.getByAltText() to locate an element, usually image, by its text alternative.
//		page.getByTitle() to locate an element by its title attribute.
//		page.getByTestId() to locate an element based on its data-testid attribute (other attributes can be configured).
		
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		
    	page.navigate("https://www.facebook.com");
//		
//		page.getByPlaceholder("Email address or phone number").fill("atulphad123");
//		
//		page.getByPlaceholder("Password").fill("Atul@123");
		
//		
    	//page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		page.getByPlaceholder("Username").fill("atul123");
//		page.getByPlaceholder("Password").fill("atul@");
		
    	//facebook
//    	Locator forgatepswlink = page.getByText("Forgotten password?");
//    	
//    	System.out.println(forgatepswlink.isVisible());
//    	System.out.println(forgatepswlink.textContent());
//    	forgatepswlink.click();
//    	
    	
    	
//		Locator createNewAccountBtn=page.getByText("Create new account");
//		System.out.println(createNewAccountBtn.innerHTML());
//		createNewAccountBtn.click();
//		
//    	String h2txt=page.getByText(Pattern.compile("connect and share with the people in your life")).textContent();
//    	System.out.println(h2txt);
//		
    	//create a page
    //System.out.println(page.locator("._8esh").innerText());
//    	
    	
//    	Locator createPageLink=page.getByText("Create a Page");
//    	System.out.println(createPageLink.isVisible());
//    	System.out.println(createPageLink.textContent());
//    	System.out.println(createPageLink.isEnabled());
//    	
//    	System.out.println(page.locator("#reg_pages_msg").innerText());
//    	System.out.println(page.locator("#reg_pages_msg").textContent());
//    	System.out.println(page.locator("#reg_pages_msg").innerHTML());
    	
//    	Locator fbLogo=page.getByAltText("Facebook");
//    	System.out.println(fbLogo.isVisible());
//    	
    	
    //OrangeHRM
//    	page.waitForTimeout(2000);
//    	System.out.println(page.getByAltText("company-branding").isVisible());
    	
    	
    //facebook
    	
    	//page.getByTestId("open-registration-form-button").click();
    	//page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Create new account")).click();
    	//page.getByRole(AriaRole.LINK,new Page.GetByRoleOptions().setName("Create a Page")).click();
    	
    	page.getByRole(AriaRole.HEADING,new Page.GetByRoleOptions().setName("Facebook helps you connect and share with the people in your life.")).isVisible();
	}
}
