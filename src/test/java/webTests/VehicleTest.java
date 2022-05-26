package webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.base;
import webPages.LoginPage;
import webPages.VehiclePage;

public class VehicleTest {
	
	@Test
	public void Property() throws InterruptedException {
		//launch browser
		
	WebDriver driver = base.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory
	LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
    loginpage.setEmail("surajbiswas@yopmail.com");
    Thread.sleep(2000);
    loginpage.setPassword("suraj8877");
    Thread.sleep(2000);
    loginpage.clickOnLoginButton();
    Thread.sleep(2000);
	
    VehiclePage vPage = PageFactory.initElements(driver,VehiclePage.class);
    
    vPage.vehicle_test();
    
    vPage.vehicletest();
    

}
	




}