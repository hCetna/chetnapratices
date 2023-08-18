package omayoblog.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver;
	WebElement multiSelectDropDown;
	public homePage(WebDriver driver) {
	this.driver = driver;

}
public WebElement getmultiSelectDropDownLocator(){
	multiSelectDropDown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
	return multiSelectDropDown;
	
	
}

public void clickOnThisBlogIsCreatedForLink() {
	
	driver.findElement(By.xpath("//a[@id='selenium143']")).click();
	
}
}


