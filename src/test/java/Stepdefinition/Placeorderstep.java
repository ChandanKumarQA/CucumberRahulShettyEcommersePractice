package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pageobject.LoginPage;
import Pageobject.OderPage;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Placeorderstep {

	

	WebDriver driver;
	
	OderPage order ;
	LoginPage log ;
	
	@Given("User is login with valid carediation")
	public void user_is_login_with_valid_carediation() throws InterruptedException {
     Thread.sleep(2000);
		
		driver = BaseClass.getDriver();   
        log = new LoginPage(driver);
      log.enteremail("testqa3@gmail.com");
		
		log.enterpassword("Pass12345");
		
		log.clickloginbutton();
		
		 order = new OderPage(driver);
		
		
			
        
	}

	@Given("Click view details of the product")
	public void click_view_details_of_the_product() {
		order.clickviewiphonebutton();
	    
		
	}

	@Given("Add  product in the cart")
	public void add_product_in_the_cart() {
		
		order.clickCart();
		
	
	    
	}

	@Given("Verify the same product is added in the cart")
	public void verify_the_same_product_is_added_in_the_cart() {
	    driver.findElement(By.xpath("//button[contains(text(),'Cart ')]")).click();
	    
	       WebElement applemobile = driver.findElement(By.xpath("//h3[text()='iphone 13 pro']"));	
	    
	       if(applemobile.getText().contains("iphone 13 pro'")) {
	    	   System.out.println("pass ");
	       }
	
	
	}

	@Given("Click on the checkout")
	public void click_on_the_checkout() {
		
	order.clickCheckout();
	    
	}

	@Then("Fill payment details")
	public void fill_payment_details() {
	
		order.sendcountryname();

	 order.clickindia();
	
	
	
	
	}
	
	
	
	
	

	@Then("Click place order")
	public void click_place_order() {
	 order.clickplaceorder();
	}

	@Then("Click order check order is placed")
	public void click_order_check_order_is_placed() {
		
		
	  WebElement product = driver.findElement(By.xpath("//div[text()='iphone 13 pro']"));
	  System.out.println(product.getText());
	    
	    
	}
}
