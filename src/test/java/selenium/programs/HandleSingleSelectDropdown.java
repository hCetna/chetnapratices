package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSingleSelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement dropdwn =driver.findElement(By.xpath("//select[@id='drop1']"));
		
		Select singleSelectDropdown= new Select(dropdwn);
		
		System.out.println(singleSelectDropdown.isMultiple());
		
		singleSelectDropdown.selectByIndex(3);
		singleSelectDropdown.selectByValue("ghi");
		singleSelectDropdown.selectByVisibleText("doc 1");
		
		System.out.println(singleSelectDropdown.getFirstSelectedOption().getText());
	}

}
