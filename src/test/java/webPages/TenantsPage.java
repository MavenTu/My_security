package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TenantsPage {
	
	WebDriver driver;
	public TenantsPage(WebDriver ldriver) {
		this.driver= ldriver;
	}
	
	@FindBy(xpath="(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")
    WebElement property;
	
	@FindBy(xpath="//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a[text()='Tenants']")
    WebElement tenants;
	
	@FindBy(xpath="//button[@class='add-tenant-btn btn btn-table-header pull-right']")
    WebElement addTenants;
	
	@FindBy(xpath="//div[@class='col-md-12 form-group']//input")
    WebElement mobileNumber;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
    WebElement next;
	
	@FindBy(xpath="(//div[@class='multiselect__select'])[1]")
    WebElement unit;
	
	@FindBy(xpath="(//span[text()='Aspen - 2B'])[1]")
    WebElement flatNo;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
    WebElement eMail;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
    WebElement fName;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
    WebElement lName;
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
    WebElement photo;
	
	@FindBy(xpath="(//input[@class='form-control'])[5]")
    WebElement kycFront;
	
	@FindBy(xpath="(//input[@class='form-control'])[6]")
    WebElement kycBack;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
    WebElement submit;
	
	
public  void tenants_test() throws InterruptedException {
	    
		Thread.sleep(7000);
		Actions actions = new Actions(driver);
        WebElement menuOption = property;
        Thread.sleep(3000);
	  	actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
	  	WebElement subMenuOption = tenants; 
	  	actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
		Thread.sleep(3000);
	}

	public  void add_tenants_test() throws InterruptedException {
		
		addTenants.click();
		Thread.sleep(3000);
		mobileNumber.sendKeys("9234567891");
		Thread.sleep(3000);
		next.click();
		Thread.sleep(3000);
		unit.click();
		Thread.sleep(1000);
		flatNo.click();
		Thread.sleep(1000);
		eMail.sendKeys("easy121@yopmail.com");
		Thread.sleep(1000);
		fName.sendKeys("Sanu");
		Thread.sleep(1000);
		lName.sendKeys("Roy");
		Thread.sleep(3000);
		photo.sendKeys("C:\\Users\\Srinjini\\Downloads\\ta.jpeg"); //Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(3000);
		//((RemoteWebElement) kycFront).setFileDetector(new LocalFileDetector());
		kycFront.sendKeys("C:\\Users\\Srinjini\\Downloads\\kyc.jpg");
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(5000);
kycBack.sendKeys("C:\\Users\\Srinjini\\Downloads\\kyc.jpg");
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(3000);
		
	}

}
