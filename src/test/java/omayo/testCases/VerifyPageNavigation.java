package omayo.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utilities.Utility;
import omayoblog.pages.Selenium143Pages;
import omayoblog.pages.homePage;

public class VerifyPageNavigation extends BaseTest{
	
	homePage page;
	Selenium143Pages selenium143Pages;
	
	@Test
	public void verifyNavigation() {
		
		page =new homePage(driver);
		selenium143Pages= new Selenium143Pages(driver);
		page.clickOnThisBlogIsCreatedForLink();
		String parentWindowHandle=Utility.switchToNewWindow(driver);
		assertEquals(selenium143Pages.getWhatIsSeleniumLinkText(), "What is are Selenium?");
		driver.close();
		Utility.switchToWindow(driver, parentWindowHandle);
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}

}
