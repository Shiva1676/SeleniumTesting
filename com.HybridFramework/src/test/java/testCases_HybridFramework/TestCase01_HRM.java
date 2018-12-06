/**
 * 
 */
package testCases_HybridFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages_HybridFramework.LoginPage_HRM;
import pages_HybridFramework.LogoutPage_HRM;
import utility_HybridFramework.Helper;

/**
 * @author Lenovo
 *
 */
public class TestCase01_HRM extends BaseClass_HRM{

	ExtentTest logger;
	
	@BeforeMethod
	public void setUpReporting(){
		
		logger = reports.startTest("Automating OrangeHRM Application");
	}
	
	@AfterMethod
	public void closeReporting(){
		
		reports.endTest(logger);
	}
	
	@Test
	public void verifyLoginPage(){
		
		LoginPage_HRM login = PageFactory.initElements(driver, LoginPage_HRM.class);
		
		logger.log(LogStatus.INFO, "Login Page Information");
		
		try {
			
			login.getLoginData("admin", "admin123");
			
			Assert.assertTrue(driver.findElement(By.partialLinkText("Welcome")).isDisplayed());
			
			logger.log(LogStatus.PASS, logger.addScreenCapture(Helper.getCaptuerScreenshot(driver)));
			
		} catch (Exception e) {
			
			System.out.println("==============User is not able to login==========");
			
			logger.log(LogStatus.FAIL, logger.addScreenCapture(Helper.getCaptuerScreenshot(driver)));
		}
		
		
		LogoutPage_HRM logout = PageFactory.initElements(driver, LogoutPage_HRM.class);
		
		try {
			logout.getLogoutdetails();
			
			logger.log(LogStatus.PASS, logger.addScreenCapture(Helper.getCaptuerScreenshot(driver)));
			
			System.out.println("=========User is able to logout=============");
			
		} catch (Exception e) {

			logger.log(LogStatus.FAIL, logger.addScreenCapture(Helper.getCaptuerScreenshot(driver)));
			
			System.out.println("============User is not able to logout===============");
		
		}
		
		
		
		
		
	}
	
}
