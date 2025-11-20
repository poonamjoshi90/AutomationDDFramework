package baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	public WebDriver driver;
	public Properties prop;
	
	public baseclass() 
	{
		
							try {
								prop= new Properties();
			
			FileInputStream fis= new FileInputStream("C:\\Users\\umesh\\eclipse-workspace\\AutomationDDFramework\\src\\main\\java\\Properties\\config.properties");
						
			prop.load(fis);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				//System.out.print(prop.getProperty("url"));
		
	}
	public WebDriver initialzeBrowserAndOpenapplicationURL(String browserName)
	{
		//String browserName="Edge";
		if(browserName.equals("chrome"))
		{
			driver =new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			driver =new FirefoxDriver();
		}
		else if(browserName.equals("Edge"))
		{
			driver =new EdgeDriver();
		}
		
		driver.get(prop.getProperty("url"));
		return driver;
		
	}
	
	

}
