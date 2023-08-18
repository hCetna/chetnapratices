package selenium.programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		WebElement bikevehicleinput =driver.findElement(By.xpath("//input[@value=\"Bike\"]"));
		bikevehicleinput.click();
		
		Thread.sleep(5000);
		
		WebElement Bicyclevehicleinput=driver.findElement(By.xpath("//input[@value=\"Bicycle\"]"));
		Bicyclevehicleinput.click();

		Thread.sleep(5000);
		
		WebElement carvehicleinput=driver.findElement(By.xpath("//input[@value=\"Car\"]"));
		carvehicleinput.click();
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(Bicyclevehicleinput.getAttribute("type"));
		System.out.println(carvehicleinput.getAriaRole());
		System.out.println(carvehicleinput.getSize());
		System.out.println(driver.getTitle());
		
		File file=Bicyclevehicleinput.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file,new File("src/test/resources/screenshot/vehicleinput.png"));
		
		
		
		
		

	}

}
