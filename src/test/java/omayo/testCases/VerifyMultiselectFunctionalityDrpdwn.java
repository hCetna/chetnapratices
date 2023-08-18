package omayo.testCases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import Utilities.Utility;
import omayoblog.pages.homePage;

public class VerifyMultiselectFunctionalityDrpdwn extends BaseTest {
	
	homePage page;
	
	@Test
	public void VerifyMultiselectFunctionalityDrpdwn() {
		page= new homePage(driver);
		String[]options = {"Audi","Volvo"};
		ArrayList<String>selectedOptions =Utility.selectOptionFromDropDown(page.getmultiSelectDropDownLocator(), options);
		
		assertEquals(selectedOptions,Arrays.asList("Volvo","Audi"));
	}

}
