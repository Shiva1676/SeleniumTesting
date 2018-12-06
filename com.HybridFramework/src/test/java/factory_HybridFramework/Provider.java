/**
 * 
 */
package factory_HybridFramework;

/**
 * @author Lenovo
 *
 */
public class Provider {

	public static ConfigurationProvider getConfig(){
		
		ConfigurationProvider config = new ConfigurationProvider();
		
		return config;
	}
	
}
