package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Utility;

public class testCaseFirstP {
	
	Utility util;
	@Test
	public void VerifyPageTitle() throws IOException {
		
		util= new Utility();
		WebDriver driver = util.getDriver();
		Assert.assertEquals(driver.getTitle(),"omayo (QAFox.com)"); 
		
	}

}
