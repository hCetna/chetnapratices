package selenium.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"prompt\"]")).click();
		Alert al= driver.switchTo().alert();
		
		//al.sendKeys("Thanks for alert");
		System.out.println(al.getText());
		//al.accept();
		al.dismiss();

	}

}
