/**
 * 
 */
package factory_HybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * @author Lenovo
 *
 */
public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver getBrowser(String browser, String url) {

		if (browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			System.out.println("The following script is running on:" + browser);

		} else if (browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

			driver.manage().window().maximize();

			System.out.println("The following script is running on:" + browser);

		} else if (browser.equalsIgnoreCase("IE")) {

			driver = new InternetExplorerDriver();

			driver.manage().window().maximize();

			System.out.println("The following script is running on:" + browser);
		} else if (browser.equalsIgnoreCase("Opera")) {

			driver = new OperaDriver();

			driver.manage().window().maximize();

			System.out.println("The following script is running on:" + browser);
		}

		
		driver.get(url);
		
		return driver;
	}

}
