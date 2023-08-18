package Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	
	public WebDriver getDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(getProperty("url"));
		driver.manage().window().maximize();
		return driver;
	}
	
	public static   String getProperty(String key) throws IOException{
		
		File file =	new File("src/test/resources/data/master.properties");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		Properties properties = new Properties();
		
		properties.load(fileInputStream);
		
		return properties.getProperty(key);
		
	}
	
	public  static void main (String args[])throws IOException{
		
		File file =	new File("src/test/resources/data/userdata.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		
	    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		
		XSSFSheet sheet =xssfWorkbook.getSheet("data");
		int lastRow = sheet.getLastRowNum();
		
		for(int i=0;i<lastRow;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			int lastCellNum = row.getLastCellNum();
			
			for(int j=0; j<lastCellNum;j++) {
				System.out.println(row.getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		
		
	}
	
	public static ArrayList<String>selectOptionFromDropDown(WebElement dropdown,String[]options){
		Select select = new Select(dropdown);
		ArrayList<String>selectedOptions = new ArrayList<>();
		
		for(String option :options) {
			select.selectByVisibleText(option);
		}
		List<WebElement>selectOptionByLogic = select.getAllSelectedOptions();
		for(WebElement element :selectOptionByLogic) {
			selectedOptions.add(element.getText());
		}
		
		
		return selectedOptions;

		
	}
	
	public static String switchToNewWindow(WebDriver driver) {
		String currentWindowHandle = driver.getWindowHandle();
		Set<String>allWindowsHandles = driver.getWindowHandles();
		
		for(String handle :allWindowsHandles) {
			if(!(handle.equals(currentWindowHandle))) {
				driver.switchTo().window(handle);
			}
		}
		return currentWindowHandle;
		
	}
	public static void switchToWindow(WebDriver driver, String windowHandle) {
		driver.switchTo().window(windowHandle);
	}
	
	public ArrayList<String> getAllTableData(WebDriver driver) {
		
		List<WebElement> tableOptions = driver.findElements(By.xpath("//table[@id='table]/tbody/tr//td"));
		
		ArrayList<String>allTabData= new ArrayList<>();
		for(WebElement td:tableOptions) {
			
			allTabData.add(td.getText());
		}
		return allTabData;
	}
}
