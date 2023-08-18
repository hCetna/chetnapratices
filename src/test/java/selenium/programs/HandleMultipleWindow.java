package selenium.programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		System.out.println(driver.findElement(By.xpath("//[text()='what is selenium?']")).getText());
		String currentWindowHandles = driver.getWindowHandle();
		Set<String>allWindowHandles = driver.getWindowHandles();
		for(String handle: allWindowHandles) {
			if(handle.equals(currentWindowHandles)){
				continue;
			}else {
				driver.switchTo().window(handle);
			}
		}
		System.out.println(driver.findElement(By.xpath("//a[text()='what is selenium']")).getText());
		driver.findElement(By.cssSelector("input#radio1")).click();

	}

}
