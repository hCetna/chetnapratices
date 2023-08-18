package selenium.programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		WebElement checkThisButton = driver.findElement(By.xpath("//button[text()='Check this']"));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", checkThisButton);
		checkThisButton.click();
		
		WebElement mrOption =driver.findElement(By.xpath("//input[@id='dte']"));
		
		//Ecplicit wait
		//WebDriver wait = new WebDriverWait(driver,Duration.ofSeconds(11));
		//wait.untill(ExpectedCondition.elementToBeClickable(mrOption));
		
		
		//FluentWait<WebDriver> wait= new FluentWait<WebDriver>)(driver);
		//wait.pollingEvery(Duration.ofMillis(100));
		//wait.ignoring(org.openqa.selenium.TimeoutException.class);
		//wait.withTimeout(Duration.ofSeconds(5));
		//wait.until(ExpectedCondition.elementToBeClickable(mrOption));
		
		mrOption.click();
		
		driver.findElement(By.xpath("//button[@class ='dropbtn']")).click();
		
		WebElement gmailLink =driver.findElement(By.xpath("//a[text()='Gmail']"));
	
		//((gmailLink) wait).until(ExpectedConditions.invisibilityOf(gmailLink));
		
		javascriptExecutor.executeScript("arguments[0].click();",gmailLink );
	}

}
