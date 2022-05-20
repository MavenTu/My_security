package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SupportStaffsPage {
	
	

	WebDriver driver;
	public SupportStaffsPage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']") @CacheLookup WebElement Username;
	
	@FindBy(xpath="(//input[@type='password'])[2]")  @CacheLookup WebElement Password;
	

	@FindBy(xpath="(//*[@name='button'])[2]")  @CacheLookup WebElement Loginbutton;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle border-quote-clr sm-arrow1 dropdown-toggle'])[1]")  @CacheLookup WebElement SupportStaff;
	
	@FindBy(xpath="//a[normalize-space()='Guard Profile']")  @CacheLookup WebElement Guardprofile;
	
	@FindBy(xpath="//input[@type='text'][@placeholder='First Name']")  @CacheLookup WebElement fName;
	
	@FindBy(xpath="//input[@type='text'][@placeholder='Last Name']")  @CacheLookup WebElement lname;
	
	@FindBy(xpath="(//input[@placeholder='Phone Number'])[1]")  @CacheLookup WebElement phoneno;
	
	@FindBy(xpath="(//button[@type='button'])[2]")  @CacheLookup WebElement SaveButton;




public void setEmail(String strEmail) {
	
    Username.sendKeys(strEmail);
}
   
	
   public void setPassword(String strPassword) {
	
    Password.sendKeys(strPassword);
}
   public void clickOnLoginButton() {

	   Loginbutton.click();
		  
	}


   public void clickOnSupportSTuff() {
	   
	   SupportStaff.click();
   }
   public void clickOnGuardprofile() {
	   
	   Guardprofile.click();
   }
   public void setfname(String strfname) {
		
	   fName.sendKeys(strfname);
	}
   
   public void setlname(String strlname) {
		
	    lname.sendKeys(strlname);
	}
   
   public void setphoneno(String strphoneno) {
		
        phoneno.sendKeys(strphoneno);
	}
   
   public void clickOnSavebutton() {
	   
	 SaveButton.click();
   }
   
   
   
   
   
   
   
}

























































