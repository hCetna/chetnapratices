package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollInSelenium {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		SelectOptionFromNonSelectDropdown scrl = new SelectOptionFromNonSelectDropdown();
		driver = scrl.getDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
		//scroll vertically down
		javascriptExecutor.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		//scroll vertically up
		javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		//scroll horizontally right
		javascriptExecutor.executeScript("window.scrollBy(100,0)", "");
		Thread.sleep(2000);
		//scroll horizontally left
		javascriptExecutor.executeScript("window.scrollBy(-100,0)", "");
		Thread.sleep(2000);
		
		//WebElement link=driver.findElement(By.xpath("//a[text()='Blogger']"));
		//javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", link);
		
		//javascriptExecutor.executeScript("arguments[0].click();", link);
	}

}
