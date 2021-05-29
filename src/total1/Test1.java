package total1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeTest
	public void OpenBrowser() {
		System.out.println("Open Browser");
	}
	@AfterTest
	public void CloseBrowser() {
		System.out.println("Close");
		
	}
	
	@Test (priority=1)
	public void Write_TC1() {
		System.out.println("First write test case");
		
	} 
	@Test (priority=2)
	public void Execute() {
		System.out.println("Should Execute");
		
	}
	@Test (priority=3)
	public void Defect() {
		System.out.println("Defect");
	}
	
}
