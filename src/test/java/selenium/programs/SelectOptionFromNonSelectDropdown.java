package selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOptionFromNonSelectDropdown {

	public static void main(String[] args) {
		SelectOptionFromNonSelectDropdown dropdown = new SelectOptionFromNonSelectDropdown();
		dropdown.selectOptionFromDropDown("Maldives");
	}
	 public void selectOptionFromDropDown(String country) {
	   WebDriver driver =getDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.airvistara.com/en");
	   driver.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();
	   List<WebElement> countries =driver.findElements(By.xpath("//ul[@id='country-scroll']//li/span"));
	   
	   for(WebElement countrynameElement : countries) {
		   if(countrynameElement.getText().equalsIgnoreCase(country)) {
			   countrynameElement.click();
		   }
	   }
   }
  public WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	return driver;
}
}
