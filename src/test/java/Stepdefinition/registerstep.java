package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;


import Pageobject.Registationpage;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerstep {
	
	
	WebDriver driver;
	Registationpage reg;
	
	
	@Given("the user is on the Register page")
	public void the_user_is_on_the_page() {
		
		driver = BaseClass.getDriver();   

		reg=new Registationpage(driver);
		
	   reg.clickRegistattion();
		
	
	   
	}

	@When("the user enters First Name {string}")
	public void the_user_enters_first_name(String firstname) {
		
	reg.enterfirstname(firstname);
		
		
	    
	}

	@When("the user enters Last Name {string}")
	public void the_user_enters_last_name(String lastname) {
	    reg.enterlastname(lastname);
	}

	@When("the user enters Email")
	public void the_user_enters_email() {
		String emailtext= BaseClass.randomAlphaNumeric();
		String emailtitle = emailtext+"@gmaail.com";
	    reg.entermail(emailtitle);
	}

	@When("the user enters Phone Number {string}")
	public void the_user_enters_phone_number(String phonenumer) {
		
		reg.enterphoneno(phonenumer);
	 
	}

	@When("the user selects Occupation")
	public void the_user_selects_occupation() {
		
		reg.selectocupation();
	
	}

	@When("the user selects Gender")
	public void the_user_selects_gender() {
		reg.selectmale();

	}

	@When("the user enters Password")
	public void the_user_enters_password() {
		
	    reg.enterpassword();
	}

	@When("the user enters Confirm Password")
	public void the_user_enters_confirm_password() throws InterruptedException {
		
		Thread.sleep(2000);
	  reg.enterConfirmPassword();
	   
	 reg.clickisrequiredbutton();
	}

	@When("the user submits the registration form")
	public void the_user_submits_the_registration_form() {
	 reg.clickRegistationbutton();
	}

	@Then("the user should see a registration success message")
    public void the_user_should_see_a_registration_success_message() {
        String actual = reg.getSuccessMessage();
        Assert.assertEquals(actual, "Account Created Successfully");
    }

	

}
