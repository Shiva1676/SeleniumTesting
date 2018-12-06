/**
 * 
 */
package demo_HybridFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import utility_HybridFramework.SyncElement;

/**
 * @author Lenovo
 *
 */
public class Flipkart {

	@FindBy(how = How.XPATH, using = ".//input[@type= 'text']")
	WebElement inputButton;
	
	@FindBy(how = How.XPATH, using = ".//button[@type= 'submit']")
	WebElement searchButton;
	
	@FindBy(how = How.XPATH, using = ".//button[@class= '_2AkmmA _29YdH8']")
	WebElement closeButton;

	@Test
	public void test() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		

		SyncElement.waitForElement(driver, closeButton).click();
		
		SyncElement.waitForElement(driver, inputButton).sendKeys("Mobiles");
		
		SyncElement.waitForElement(driver, searchButton).click();
		
		
		

	}

}
