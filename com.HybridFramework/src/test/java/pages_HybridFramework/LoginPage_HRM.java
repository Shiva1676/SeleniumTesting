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
public class LoginPage_HRM {

	@FindBy(how = How.ID, using = "txtUsername")
	WebElement username;
	
	@FindBy(how = How.ID, using = "txtPassword")
	WebElement password;
	
	@FindBy(how = How.ID, using = "btnLogin")
	WebElement submitButton;
	
	WebDriver driver;
	
	public LoginPage_HRM(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public void getLoginData(String uname, String pass){
		
		SyncElement.waitForElement(driver, username).sendKeys(uname);
		
		SyncElement.waitForElement(driver, password).sendKeys(pass);
		
		SyncElement.waitForElement(driver, submitButton).click();
		
	}
	
	
}
