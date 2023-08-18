package selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://omayo.blogspot.com/");
	     driver.manage().window().maximize();
	     //to find webelement
	    WebElement element =driver.findElement(By.name("userid"));
	    element.sendKeys("another name enroll by using send key");
	    Thread.sleep(3000);
	    element.clear();
	    //by id locator strategry
	  //WebElement element1 = driver.findElement(By.id("but1"));
	// System.out.println(element1.getText());
	 //by class name
	//System.out.println(driver.findElement(By.cssSelector(".post-title entry-title")).getText());
	 //link text
	 //driver.findElement(By.linkText("Posts (Atom)")).click();
	// paratial link text
	 //driver.findElement(By.linkText(" (Atom)")).click();
	 //using tag name
	List <WebElement>link =driver.findElements(By.tagName("a"));
	
	
	System.out.println("Number of links on page"+link.size());
	 
	 
	}

}
