package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ParkingSpacePage {

	
	WebDriver driver;
	public ParkingSpacePage (WebDriver driver) {
		this.driver= driver;
	}
	
	@FindBy(xpath="(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]") WebElement property;
	
	@FindBy(xpath="//a[text()='Parking Space']")@CacheLookup WebElement parkingSpace;
	
	@FindBy(xpath="(//div[@class='multiselect__select'])[1]")
    WebElement ownerDropdown;
	
	@FindBy(xpath="//span[text()='Cascade - AA']")
    WebElement blockName;
	
	@FindBy(xpath="//button[@class='btn btn-primary middle text-capitalize']//*[text()='Add Parking Space']")
    WebElement AddParking;
	
	@FindBy(xpath="//input[@class='form-control'][@placeholder='Parking Space Name']")
    WebElement blocktextbox;
	
	@FindBy(xpath="//button[@type='submit']//*[text()='Save']")
    WebElement SaveButton ;
	
	
	public void parking_space() throws InterruptedException {
		
		
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
        WebElement menuOption = property;
        Thread.sleep(3000);
	  	actions.moveToElement(menuOption).perform();
        Thread.sleep(5000);
	  	WebElement subMenuOption = parkingSpace; 
	  	actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
		Thread.sleep(3000);

	}
	public void ParkingSpace() throws InterruptedException {
		
		ownerDropdown.click();
		Thread.sleep(3000);
		blockName.click();
		Thread.sleep(3000);
		AddParking.click();
		Thread.sleep(3000);
		blocktextbox.sendKeys("Bharat block");
		Thread.sleep(3000);
		SaveButton.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
