package selenium.programs;

import java.awt.Point;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {


	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement searchtextbox=driver.findElement(By.xpath("//input[@title='search']"));
		
		searchtextbox.sendKeys("Ashish");
		
		Thread.sleep(5000);
		
		searchtextbox.clear();
		
		System.out.println(searchtextbox.getAttribute("class"));
		System.out.println(searchtextbox.getAccessibleName());
		System.out.println(searchtextbox.getAriaRole());
		
		System.out.println(searchtextbox.isDisplayed());
		
		System.out.println(driver.findElement(By.cssSelector("div#BlogSearch1_form")).isDisplayed());
		
		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("border"));
		
		//Point p=searchtextbox.getLocation();
		
		//System.out.println(p.getX());
		
		//System.out.println(p.getY());
		
		File file = searchtextbox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("src/test/resources/screenshot/textboxscreenshot.png"));
		
		System.out.println(searchtextbox.getTagName());
		System.out.println(driver.findElement(By.xpath("//button[@id='but2']")).getText());
		
		
		
	    
		
		
		
		
	}
}
