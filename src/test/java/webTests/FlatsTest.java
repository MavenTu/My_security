package webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.base;
import webPages.FlatsPage;
import webPages.LoginPage;

public class FlatsTest {
	
	@Test
	public void Property() throws InterruptedException {
		//launch browser
		
	WebDriver driver = base.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory

		LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
		loginpage.setEmail("surajbiswas@yopmail.com");
	       Thread.sleep(5000);
	       loginpage.setPassword("suraj8877");
	       Thread.sleep(5000);
	       loginpage.clickOnLoginButton();
	       Thread.sleep(5000);
		FlatsPage fPage = PageFactory.initElements(driver, FlatsPage.class);

		fPage.flat_test();
		
		fPage.createFlatTest();
		
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
