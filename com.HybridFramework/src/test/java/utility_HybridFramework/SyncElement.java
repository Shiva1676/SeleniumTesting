/**
 * 
 */
package utility_HybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Lenovo
 *
 */
public class SyncElement {

	public static WebElement waitForElement(WebDriver driver, WebElement ele){
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		return wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
}
