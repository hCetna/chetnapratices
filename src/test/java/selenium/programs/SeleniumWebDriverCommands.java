package selenium.programs;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@type='radio']"));
		maleRadioButton.click();
		Thread.sleep(5000);
		WebElement femaleRadioButton=driver.findElement(By.cssSelector("input#radio2"));
		femaleRadioButton.click();
		//it will throws NoSuchElementException
		//WebElement femaleRadioButton1=driver.findElement(By.cssSelector("input#radius"));
		
		//if findelement method unable to find any web element it will return empty list
		List<WebElement>buttons=driver.findElements(By.tagName("button"));
		System.out.println("Number of Button Present on webpage:"+buttons.size());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
	}

}
