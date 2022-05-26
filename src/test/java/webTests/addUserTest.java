package webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.base;
import webPages.addUserPage;

public class addUserTest {

	
	@Test
	public void init() throws InterruptedException {
	
		
	WebDriver driver = base.startBrowser("chrome", "https://dev.the360.in/login");
		addUserPage adduserpage = PageFactory.initElements(driver,addUserPage.class);
		adduserpage.setEmail("surajbiswas@yopmail.com");
	       Thread.sleep(5000);
	       adduserpage.setPassword("suraj8877");
	       Thread.sleep(5000);
	       adduserpage.clickOnLoginButton();
	       Thread.sleep(5000);
	       adduserpage.clickOnDropdown();
	       Thread.sleep(5000);
	       adduserpage.clickOnFlatowner();
	       Thread.sleep(5000);
	       adduserpage.clickOnaddUser();
	       Thread.sleep(5000);
	       adduserpage.setfname("kuta");
	       Thread.sleep(2000);
	       adduserpage.setlname("mjh");
	       Thread.sleep(2000);
	       adduserpage.setEmail2("ma@yopmail.com");
	       Thread.sleep(3000);
	       adduserpage.setphoneno("8974566122");
	       Thread.sleep(3000);
	       adduserpage.clickOndropdown2();
	       Thread.sleep(5000);
	       adduserpage.clickOnCascade();
	       Thread.sleep(3000);
	       adduserpage.clickOnCommitteecheckbox();
	       Thread.sleep(4000);
	       adduserpage.setCommitteeTextbox("Dev");
	       Thread.sleep(3000);
	       adduserpage.clickOnsaveButton();
	       
	       
		
}
}
