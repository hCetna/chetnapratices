package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


import Utilities.Utility;

public class dataDrivenTesting {
  WebDriver driver;
  @BeforeMethod
  public void setup() throws IOException {
	  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Utility.getProperty("url3"));
		driver.manage().window().maximize();
  }
	@Test(dataProvider="userData")
	public void verifyValidLoginWithDifferentUsers(String usrnam, String pass){
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(usrnam);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		WebElement  verifyLoginSuccessfulMsg =driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		
		assertEquals(verifyLoginSuccessfulMsg.getText(),"Login Successfully");
		
	}
	@DataProvider(name = "userData")
	public String[][] userDataProvider() {
		String users[][] = {{"user1","password1"},{"user2","password2"},{"user3","password3"}};
		
		return users;
     }
	
	
	@AfterMethod
	public void testDown() 
	{
		driver.quit();
	}
}
