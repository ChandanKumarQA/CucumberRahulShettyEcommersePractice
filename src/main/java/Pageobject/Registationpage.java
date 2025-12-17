package Pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;


public class Registationpage {
	
	
	
WebDriver driver;
	
	public Registationpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		}
	
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement Registation_button;
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	
	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userMobile")
	WebElement mobileno;
	
	@FindBy(xpath="//select[@formcontrolname='occupation']")
	WebElement occupation;
	
	@FindBy(xpath="//input[@formcontrolname='gender' and @value='Male']")
	WebElement maleGender;

	
	
	
	@FindBy(id="login")
	WebElement Registationbutton;
	
	@FindBy(xpath="//h1[text()='Account Created Successfully']")
	WebElement succes;
	
	
	@FindBy(id="userPassword")
	WebElement	pasword;
	
	@FindBy(id="confirmPassword")
	WebElement	conformpassword;
	
	
	@FindBy(xpath="//h1[text()='Account Created Successfully']")
	WebElement Suceesmessage;
	
	
	@FindBy(xpath="//input[@formcontrolname='required']")
	
	WebElement  isrequiredButton;
	
	
	
	
	
	
	
	public WebElement getOccupation() {
		return occupation;
	}

	


	
    public void clickRegistattion() {
    	Registation_button.click();
    	
    }
    
    public void enterfirstname(String fname) {
    	firstname.sendKeys(fname);
    }
    
    
    public void enterlastname(String lname) {
    	lastname.sendKeys(lname);
    }
    
    public void entermail(String Email) {
    	email.sendKeys(Email);
    }
    
    public void enterphoneno(String phoneno) {
    	mobileno.sendKeys(phoneno);
    }
    
    public void enterpassword() {
    	pasword.sendKeys("Pass@123");
    }
    
    public void enterConfirmPassword() {
    	conformpassword.sendKeys("Pass@123"); // Do not pass null
    }
    
    
    public void clickRegistationbutton() {
    	Registationbutton.click();
    }
    
    
    public void selectmale() {
    	maleGender.click();   
    	
  }
  public void clickisrequiredbutton() {
	  isrequiredButton.click();
  }
       
public void selectocupation() {
	Select select = new Select(occupation);
	select.selectByVisibleText("Student");
}

public void validatesucessmessage() {
	String actualMessage = Suceesmessage.getText();
	
	String exceptedMessage = "Account Created Successfully";
	
	if(actualMessage.contains(exceptedMessage)) {
		 Assert.assertTrue(true, "Message matched successfully!");
	}
	
	else
	{
	    Assert.fail("Actual message does not contain expected message!");
	}
	
}
}
