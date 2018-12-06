/**
 * 
 */
package factory_HybridFramework;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Lenovo
 *
 */
public class ConfigurationProvider {
	
	Properties pro;

	public ConfigurationProvider() {

		String pathname = System.getProperty("user.dir") + "/Configuration_HybridFramework/config.properties";

		try {
			File src = new File(pathname);

			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("==========Unable to load the config file===========");
			
			System.out.println(e.getMessage());
			
		} 
		
	}

	
	public String getBrowser(){
		
		String browser = pro.getProperty("browser");
		
		return browser;
	}
	
	public String getURL(){
		
		String url = pro.getProperty("url");
		
		return url;
	}
	
}
