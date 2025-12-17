package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OderPage {
WebDriver driver;
	
	public OderPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(xpath="//b[text()='iphone 13 pro']/../..//button[text()=' View']")
	WebElement Viewiphone13_button;
	
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//button[contains(text(),'Cart ')]")
	WebElement Cartbutton;
	
	@FindBy(xpath="//h3[text()='iphone 13 pro']")
	WebElement	iphonetext;
	
	
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement Country_checkbox;
	
	
	@FindBy(xpath="//span[text()=' India']")
	WebElement Indiatext;
	
	
	@FindBy(xpath="//a[text()='Place Order ']")
	WebElement placeorderbutton;
	
	public void clickCart() {
		Cartbutton.click();
	}
	
	public void clickaddtocartbutton() {
		addtocartbutton.click();
	}
	
	public void clickviewiphonebutton() {
		Viewiphone13_button.click();
	}
	
	
	public void clickCheckout() {
		checkout.click();
	}
	
	public void sendcountryname() {
		Country_checkbox.sendKeys("India");
	}
	
	public void clickindia() {
		Indiatext.click();
	}
	public void clickplaceorder() {
		placeorderbutton.click();
	}
}
