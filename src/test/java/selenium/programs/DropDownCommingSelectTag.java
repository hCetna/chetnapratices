package selenium.programs;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.Utility;

public class DropDownCommingSelectTag {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		WebElement multiselect = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		
        Select multiSelectDropdown = new Select(multiselect);
        System.out.println(multiSelectDropdown.isMultiple());
        List<WebElement> Option = multiSelectDropdown.getOptions();
        for(WebElement opt :Option)
        {
        System.out.println(opt.getText());
	}
        multiSelectDropdown.selectByIndex(1);
        multiSelectDropdown.selectByValue("audix");
        multiSelectDropdown.selectByVisibleText("Hyundai");
        
        System.out.println("-------------------------------------------------------------------------------------");
      List<WebElement>SelectedOption = multiSelectDropdown.getAllSelectedOptions();
      for(WebElement opt : SelectedOption) {
    	  System.out.println(opt.getText());
      }
      
      System.out.println("-------------------------------------------------------------------------------------");
      System.out.println(multiSelectDropdown.getFirstSelectedOption().getText());
      
      multiSelectDropdown.deselectByIndex(1);
      multiSelectDropdown.deselectByValue("audix");
      multiSelectDropdown.deselectByVisibleText("Swift");
      
      multiSelectDropdown.selectByIndex(3);
      multiSelectDropdown.selectByValue("swiftx");
      multiSelectDropdown.selectByVisibleText("Volvo");
      
      multiSelectDropdown.deselectAll();
}
}
