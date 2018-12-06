/**
 * 
 */
package testCases_HybridFramework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import factory_HybridFramework.BrowserFactory;
import factory_HybridFramework.ExcelData;
import factory_HybridFramework.Provider;
import utility_HybridFramework.CustomDateAndTime;

/**
 * @author Lenovo
 *
 */
public class BaseClass_HRM {

	ExtentReports reports;
	
	WebDriver driver;

	@BeforeSuite
	public void startReports() {

		String path = System.getProperty("user.dir") + "/Reports_HybridFramework/HRM" + CustomDateAndTime.getDateFormat() + ".html"; 
 
		reports = new ExtentReports(path);

	}

	@AfterSuite
	public void flushReports() {

		reports.flush();
	}

	
	@BeforeTest
	public void startBrowser(){
		
		System.out.println("==========Browser & Application are about to start===========");
		
		driver = BrowserFactory.getBrowser(Provider.getConfig().getBrowser(), Provider.getConfig().getURL());
		
		System.out.println("=========Browser & Application are up and running============");
		
	}
	
	@AfterTest
	public void closeBrowser(){
		
		driver.quit();
		
		System.out.println("==================Browser closed===============");
		
	}
	
	
	public Object[][] getExcelInformation(String excelLocation, String sheetname){
		
		ExcelData excel = new ExcelData();
		
		return excel.getData(excelLocation, sheetname);
	}
	
}
