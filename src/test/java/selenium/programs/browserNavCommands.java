package selenium.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserNavCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://app.gate.iitk.ac.in/applicationForm");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com");
		
		//driver.close();
		driver.quit();
	}

}
