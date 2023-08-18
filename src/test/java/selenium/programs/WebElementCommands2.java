package selenium.programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		WebElement locatenameattribute=driver.findElement(By.xpath("//input[@name='textboxn']"));
		 
		locatenameattribute.sendKeys("chetna");
		Thread.sleep(2000);
		locatenameattribute.clear();
		System.out.println(locatenameattribute.getAttribute("type"));
		System.out.println(locatenameattribute.getAccessibleName());
		System.out.println(locatenameattribute.getAriaRole());
		System.out.println(locatenameattribute.getTagName());
		System.out.println(locatenameattribute.isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("div#HTML22")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input")).getCssValue("background-color"));
		
		System.out.println(driver.findElement(By.cssSelector("input")).getCssValue("border"));
		
		File file=locatenameattribute.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file,new File("src/test/resources/screenshot/locatenametext.png"));
		
		
		

	}

}
