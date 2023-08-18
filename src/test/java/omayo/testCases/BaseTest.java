package omayo.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.Utility;

public class BaseTest {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() throws IOException {
		Utility utility = new Utility();
		driver = utility.getDriver();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
