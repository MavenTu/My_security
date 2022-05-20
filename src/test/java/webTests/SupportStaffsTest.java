package webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.base;
import webPages.SupportStaffsPage;

public class SupportStaffsTest {

	
	
	@Test
	public void init() throws InterruptedException {
	
		
	WebDriver driver = base.startBrowser("chrome", "https://dev.the360.in/login");
	SupportStaffsPage SupportStaffsPage= PageFactory.initElements(driver,SupportStaffsPage.class);
	SupportStaffsPage.setEmail("surajbiswas@yopmail.com");
	       Thread.sleep(5000);
	       SupportStaffsPage.setPassword("suraj8877");
	       Thread.sleep(5000);
	       SupportStaffsPage.clickOnLoginButton();
	       Thread.sleep(5000);
	       SupportStaffsPage.clickOnSupportSTuff();
	       Thread.sleep(5000);
	       SupportStaffsPage.clickOnGuardprofile();
	       Thread.sleep(3000);
	       SupportStaffsPage.setfname("Ravi");
	       Thread.sleep(3000);
	       SupportStaffsPage.setlname("Verma");
	       Thread.sleep(3000);
	       SupportStaffsPage.setphoneno("9036123450");
	       Thread.sleep(3000);
	       SupportStaffsPage.clickOnSavebutton();
	       Thread.sleep(3000);
	       
	}
}
