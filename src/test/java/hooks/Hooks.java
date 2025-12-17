package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	  WebDriver driver;
	
	
	@Before
	public void bf() {
		
		driver = BaseClass.inslizebrowser();

		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		
		
	}
	
	
	
	
	@After
	public void af() {
		driver.quit();
	}
    @AfterStep
    public void addScreenshot(Scenario scenario) {
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	
        if(scenario.isFailed()) {
        	
        	
        	byte[] screenshotfaild=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshotfaild, "image/png",scenario.getName());
        }
        	else {

        		byte[] screenshotpass=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshotpass, "image/png",scenario.getName());
        	}
    }
}
