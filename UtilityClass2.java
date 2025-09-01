package playwright_automation;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.microsoft.playwright.Page;

public class UtilityClass2 {
	


	public static String customeDateFormat()
	{
		return new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date());
	}
	
	public static void capturescreen(Page page)
	{
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
//		Date date =new Date();
	//	String customdateFormat = simpleDateFormat.format(date);
	//	page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshots/facebook_"+customdateFormat+".png")));
		
		
		
//		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshots/facebook_"+new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date())+".png")));
		
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshots/facebook_"+customeDateFormat()+".png")));
	}
	
	public static void capturescreen(Locator locator)
	{
//		locator.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./Screenshots/facebook_"+new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date())+".png")));
		locator.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./Screenshots/facebook_"+customeDateFormat()+".png")));
	}
	
	public static void captureFullPageScreenshots(Page page)
	{
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshots/FacebookPage_"+customeDateFormat()+".png")).setFullPage(true));
	}
}



