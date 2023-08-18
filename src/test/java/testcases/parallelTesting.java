package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.Utility;

public class parallelTesting {
	WebDriver driver;
	  @BeforeMethod
	  public void setup() throws IOException {
		  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(Utility.getProperty("url3"));
			driver.manage().window().maximize();
	  }
		@Test
		public void verifyValidLoginWithDifferentUsers(){
			
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("user 1");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password1");
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			WebElement  verifyLoginSuccessfulMsg =driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
			
			assertEquals(verifyLoginSuccessfulMsg.getText(),"Login Successfully");
			
		}
		@Test
		public void verifyPageTitle() {
			assertEquals(driver.getTitle(),"Welcome: Mercury Tour");
		}
		@Test
		public void verifyPageUrl() {
			assertEquals(driver.getCurrentUrl(),"http://demo.guru99.com/test/newtours/index.php");
		}
		
		
		@AfterMethod
		public void testDown() 
		{
			driver.quit();
		}
}
