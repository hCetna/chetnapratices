package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationImp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement maleradiobutton=driver.findElement(By.xpath("//input[@id=\"radio1\"]"));
		WebElement femaleradiobutton=driver.findElement(By.xpath("//input[@id=\"radio2\"]"));
		
		maleradiobutton.click();
		System.out.println("maleradiobutton is selected:"+maleradiobutton.isSelected());
		System.out.println("femaleradiobutton is selected:"+femaleradiobutton.isSelected());
		System.out.println("femaleradiobutton is displayed:"+femaleradiobutton.isDisplayed());
		
		WebElement orangecheckbox=driver.findElement(By.xpath("//input[@id=\"checkbox1\"]"));
		WebElement bluecheckbox=driver.findElement(By.xpath("//input[@id=\"checkbox2\"]"));
		System.out.println("orangecheckbox is selected:"+orangecheckbox.isSelected());
		System.out.println("bluecheckbox is selected:"+bluecheckbox.isSelected());
		System.out.println("bluecheckbox is displayed:"+bluecheckbox.isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//button[@id=\"but1\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//button[@id=\"but2\"]")).isEnabled());

		

	}

}
