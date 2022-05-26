package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

	
	public class VehiclePage {
		
		WebDriver driver;
		public VehiclePage(WebDriver driver) {
			this.driver= driver;
		}
		
		@FindBy(xpath="(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")
	    WebElement property;
		@FindBy(xpath="(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[5]")
	    WebElement Vehicle;
		@FindBy(xpath="//select[@name='property_type']")
	    WebElement twoWheel;
		@FindBy(xpath="//input[@placeholder='Number']")
	    WebElement Number;
		@FindBy(xpath="//div[@class='multiselect__tags']")
	    WebElement Ownername ;
		@FindBy(xpath="//span[text()='Suraj  Biswas - 8535887747']")
	    WebElement Name;
		@FindBy(xpath="//button[@type='submit']")
	    WebElement saveButton;

		
	

	    public void vehicle_test() throws InterruptedException {
			
			Thread.sleep(7000);
			Actions actions = new Actions(driver);
	        WebElement menuOption = property;
	        Thread.sleep(3000);
		  	actions.moveToElement(menuOption).perform();
	        Thread.sleep(3000);
		  	WebElement subMenuOption = Vehicle; 
		  	actions.moveToElement(subMenuOption).perform();
			subMenuOption.click();
			Thread.sleep(3000);
		}	
		public  void vehicletest() throws InterruptedException {
			
			Select select1 = new Select(twoWheel);
			Thread.sleep(3000);
			select1.selectByVisibleText("Two Wheeler");
		    Thread.sleep(3000);
		    Number.sendKeys("WB 12H 4585");
		    Thread.sleep(3000);
		    Ownername.click();
			Thread.sleep(3000);
			Name.click();
		    Thread.sleep(3000);
		    saveButton.click();
		    
		    
		    
		}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


