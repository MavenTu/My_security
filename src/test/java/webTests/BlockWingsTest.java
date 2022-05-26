package webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.base;
import webPages.BlockWingsPage;

public class BlockWingsTest {
	
	
	@Test
	public void init() throws InterruptedException {
	
		
	WebDriver driver = base.startBrowser("chrome", "https://dev.the360.in/login");
	BlockWingsPage BlockWingsPage = PageFactory.initElements(driver,BlockWingsPage.class);
	BlockWingsPage.setEmail("surajbiswas@yopmail.com");
	       Thread.sleep(5000);
	       BlockWingsPage.setPassword("suraj8877");
	       Thread.sleep(5000);
	       BlockWingsPage.clickOnLoginButton();
	       Thread.sleep(5000);
	       BlockWingsPage.clickOnDropdown();
	       Thread.sleep(5000);
	       BlockWingsPage.clickOnBlockWings();
	       Thread.sleep(5000);
	       BlockWingsPage.setBlockName("Aspen");
	       
	       
	       
	       
	       
	
	}

}
