package webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.base;
import webPages.LoginPage;
import webPages.TenantsPage;

public class TenantsTest {
	
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
	
		TenantsPage tPage = PageFactory.initElements(driver, TenantsPage.class);
		
		tPage.tenants_test();
		
		tPage.add_tenants_test();

}}
