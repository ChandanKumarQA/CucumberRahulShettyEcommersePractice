package factory;

import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	
	 static WebDriver driver;
     static Properties p;
     static Logger logger;
  	     
     
     
     public static WebDriver inslizebrowser() {
    	 driver=new FirefoxDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().deleteAllCookies(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		 
		 return driver;
     }
     
     public static WebDriver getDriver() {
         return driver;
     }
     
	
	public static Logger getLogger() 
	{		 
		logger=LogManager.getLogger(); //Log4j
		return logger;
	}
	
	public static String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	
	public static String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
		
	public static String randomAlphaNumeric()
	{
	String str=RandomStringUtils.randomAlphabetic(5);
	 String num=RandomStringUtils.randomNumeric(10);
	return str+num;
	}

}
