package omayo.testCases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import Utilities.Utility;

public class VerifyTableData  extends BaseTest{

	@Test
	public void veriftTableDataApplication() {
		ArrayList<String> expectedDatbleTata = new ArrayList<>();
		expectedDatbleTata.add("Kishore");
		expectedDatbleTata.add("22");
		expectedDatbleTata.add("Delhi");
		expectedDatbleTata.add("Manish");
		expectedDatbleTata.add("25");
		expectedDatbleTata.add("Pune");
		expectedDatbleTata.add("Praveen");
		expectedDatbleTata.add("29");
		expectedDatbleTata.add("Bangalore");
		expectedDatbleTata.add("Dheepthi");
		expectedDatbleTata.add("31");
		expectedDatbleTata.add("Mumbai");
		assertEquals(Utility.getAllTableData( driver,"table[@id='table']/tbody/tr//td"), expectedDatbleTata);
	}
}