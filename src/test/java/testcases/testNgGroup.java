package testcases;

import org.testng.annotations.Test;

public class testNgGroup {
	

	
		@Test(groups= {"smoke"})
		public void abc() 
		{
	   System.out.println("abc");
	    }
		
		@Test(groups= {"sanity" ,"regression"})
		public void xyz() 
		{
	   System.out.println("xyz");
	    }
		
		@Test(groups= {"sanity"})
		public void text() 
		{
	   System.out.println("text");
	    }
		
		@Test(groups= {"smoke","system"})
		public void mno() 
		{
	   System.out.println("mno");
	    }
		
	}


