package Utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo {
	
	public static ExtentReportsDemo ExtentReportsData()
	{
	
	ExtentReports extent=new ExtentReports();
	
	///AutomationDDFramework/test-output/ExtentReporters

	//File file =  new File (System.getProperty("user.dir") + "\\test-output\\ExtentReporters\\ereport.html");
          File file = new File  ("\\Users\\umesh\\eclipse-workspace\\AutomationDDFramework\\test-output\\ExtentReporters");
    ExtentSparkReporter reporter = new ExtentSparkReporter(file);
    reporter.config().setTheme(Theme.DARK);
    
    
    extent.attachReporter(reporter);
    extent.flush();
    
    return ExtentReportsData();
    
	}

  

}
