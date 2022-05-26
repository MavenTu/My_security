package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BlockWingsPage {
	
	
	WebDriver driver;
	public BlockWingsPage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']") @CacheLookup WebElement Username;
	
	@FindBy(xpath="(//input[@type='password'])[2]")  @CacheLookup WebElement Password;
	

	@FindBy(xpath="(//*[@name='button'])[2]")  @CacheLookup WebElement Loginbutton;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")  @CacheLookup WebElement PropertyDropdown;

	@FindBy(xpath="(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[2]")  @CacheLookup WebElement BlockWings ;
	
	@FindBy(xpath="//input[@placeholder='Search Table']")  @CacheLookup WebElement Textbox ;
	


public void setEmail(String strEmail) {
	
    Username.sendKeys(strEmail);
}
   
	
   public void setPassword(String strPassword) {
	
    Password.sendKeys(strPassword);
}
   public void clickOnLoginButton() {

	   Loginbutton.click();
		  
	}
  public void clickOnDropdown() {

	  PropertyDropdown.click();
	  
}
  
  public void clickOnBlockWings() {
	  
	  BlockWings.click();
  }

  public void setBlockName(String strBlockName) {
		
	  Textbox.sendKeys(strBlockName);
	}






}







































