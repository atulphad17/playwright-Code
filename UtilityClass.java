package playwright_automation;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.microsoft.playwright.Page;

public class UtilityClass {
	public static byte[] captureScreenshots(Page page) {
		
		
		SimpleDateFormat customformat=new SimpleDateFormat("dd_MM_yy_hh_mm");
		
		Date date=new Date();
		
		String newDate=customformat.format(date);
		
		byte [] arr=page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("./Screenshot/screenshots"+newDate +".png")));
		return arr;
	}

}
