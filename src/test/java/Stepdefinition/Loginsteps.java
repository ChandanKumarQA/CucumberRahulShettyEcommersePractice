package Stepdefinition;


import org.openqa.selenium.WebDriver;


import Pageobject.LoginPage;
import factory.BaseClass;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class Loginsteps {
	
	
	WebDriver driver;
	
	
	LoginPage log ;
	
	
	
	@Given("the user is on the nopCommerce login page")
	public void the_user_is_on_the_nop_commerce_login_page() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver = BaseClass.getDriver();   
        log = new LoginPage(driver);
	   
	   
	}

	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials_username_password() {
		
		log.enteremail("testqa3@gmail.com");
		
		log.enterpassword("Pass12345");
		
		
		
		
	   
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
		log.clickloginbutton();
		
		
	  log.validatemessage();	
	   
	log.clickLogout();
	
	
	}
	
	
	

	

}
