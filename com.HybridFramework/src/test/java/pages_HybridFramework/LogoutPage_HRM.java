/**
 * 
 */
package pages_HybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility_HybridFramework.SyncElement;

/**
 * @author Lenovo
 *
 */
public class LogoutPage_HRM {

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Welcome")
	WebElement welcomeLink;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Logout")
	WebElement logout;
	
	WebDriver driver;

	public LogoutPage_HRM(WebDriver driver) {

		this.driver = driver;

	}
	
	public void getLogoutdetails(){
		
		SyncElement.waitForElement(driver, welcomeLink).click();
		
		SyncElement.waitForElement(driver, logout).click();
	}

}
