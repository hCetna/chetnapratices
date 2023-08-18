package omayoblog.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium143Pages {
WebDriver driver;

public Selenium143Pages(WebDriver driver) {
	this.driver = driver;
}

public String getWhatIsSeleniumLinkText() {
	return driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText();
}
}
