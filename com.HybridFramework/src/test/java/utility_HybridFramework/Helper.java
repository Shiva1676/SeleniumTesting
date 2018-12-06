package utility_HybridFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static String getCaptuerScreenshot(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot)driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "/Screenshots/HRM" + CustomDateAndTime.getDateFormat() + ".png";

		File dest = new File(path);
		
		try {
			
			FileUtils.copyFile(src, dest);
			
		} catch (IOException e) {
			
			System.out.println("=============Unable to capture the screenshot=============");
			
			System.out.println(e.getMessage());
			
		}
		
		return path;

	}

}
