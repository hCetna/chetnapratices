package testcases;

import org.testng.annotations.Test;

public class testNGPriority {
	@Test(priority=5)
	public void abc() 
	{
   System.out.println("abc");
    }
	
	@Test(priority=-3)
	public void xyz() 
	{
   System.out.println("xyz");
    }
	
	@Test(priority=2)
	public void text() 
	{
   System.out.println("text");
    }
	
	@Test(priority=2)
	public void mno() 
	{
   System.out.println("mno");
    }
	
}
