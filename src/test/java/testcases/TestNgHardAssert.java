package testcases;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilities.Utility;

public class TestNgHardAssert {
Utility util;
	
	
	
	@Test
	public void VerifyPageTitle() throws IOException {
		
		util= new Utility();
		WebDriver driver = util.getDriver();
		
		assertEquals(driver.getTitle(), "omayo (QAFox.com)","title is equal 0");
		
		assertTrue(driver.getTitle().equals("omayo (QAFox.com)"),"title is equal 1");
		
		assertNotEquals(driver.getTitle(), "omayo (QAFox.com)","title is equal 2");
		
		System.out.println("After failure 1");
		
		assertFalse(driver.getTitle().equals("omayo (QAFox.com)"),"title is equal 3");
		
		System.out.println("After failure 2");
		
		
	}
}
