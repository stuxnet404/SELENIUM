package total1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class options {
	WebDriver driver=new ChromeDriver();
	String exp1="Success - Check box is checked";
	POMCB oj;
	
	SoftAssert asst;
	@BeforeMethod
	public void open() {
		driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    	oj=new POMCB(driver);
    	}
	

	@Test
	public void TC2() throws IOException{
		oj.OP3();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\total1\\option2.png"));
			
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}
	}


