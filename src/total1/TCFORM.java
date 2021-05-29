package total1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TCFORM {
	
WebDriver driver=new ChromeDriver();
POMFORM form;
String PM="Please supply a vaild phone number with area code";
String e="Please supply a valid email address";
String u="Please enter more than 2 characters";
//Error expected declaration
String fn="Please supply your first name";
String ln="Please supply your last name";
String em="Please supply your email address";
String PE="Please supply your phone number";
String AD="Please supply your street address";
String Cy="Please supply your city";
String sts="Please select your state";
String zz="Please supply your zip code";
String cmnt="Please supply a description of your project";
File shot ;
SoftAssert ast;
	@BeforeMethod
	public void open() {
		driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
    	form=new POMFORM(driver);
    	ast=new SoftAssert();
    	
	}

    	@Test(priority=5)
	public void TC1() throws IOException, InterruptedException {
    		//Everything Valid with hosting as yes 
    		shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(shot, new File("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\Scrnsht\\BFRREg.png"));
    		form.FNA("Allen");
    		form.LNA("Wright");
    		form.EMA("tryingtest12@testing.com");
    		form.PH("1234567890");
    		form.AD("3916  Kenwood Place");
    		form.City("Orlando");
    		form.Sta("Florida");
    		form.Zp("32801");
    		form.Web("www.seleniumeasy.com");
    		form.y();
    		form.COM("I am trying to test this page");
    		form.Send();
    		shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(shot, new File("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\Scrnsht\\REg.png"));  		
}
    	@Test(priority=6)
    	public void TC2() throws IOException {
    		//Phone number more than 10 digit 
    		form.FNA("Allen");
    		form.LNA("Wright");
    		form.EMA("tryingtest12@testing.com");
    		form.PH("12345678900");
    		String a=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getText();
    		form.AD("3916  Kenwood Place");
    		form.City("Orlando");
    		form.Sta("Florida");
    		form.Zp("32801");
    		form.Web("www.seleniumeasy.com");
    		form.y();
    		form.COM("I am trying to test this page");
    		form.Send();
    		shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(shot, new File("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\Scrnsht\\PHone.png"));  
    		ast.assertEquals(a, PM);
    	}
    	@Test(priority=3)
    	public void TC3() throws IOException {
    		//No phone number
    		form.FNA("Allen");
    		form.LNA("Wright");
    		form.EMA("tryingtest12@testing.com");
    	   String b=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[1]")).getText();
    		form.AD("3916  Kenwood Place");
    		form.City("Orlando");
    		form.Sta("Florida");
    		form.Zp("32801");
    		form.Web("www.seleniumeasy.com");
    		form.y();
    		form.COM("I am trying to test this page");
    		form.Send();
    		shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(shot, new File("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\Scrnsht\\EPhone.png"));  
    		ast.assertEquals(b, PE);
}
    	@Test(priority=2)
    	public void TC4() throws IOException {
    		//invalid Email
    		form.FNA("Allen");
    		form.LNA("Wright");
    		form.EMA("Tryingtesting12testing.com");
    		String c= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[2]")).getText();
    		shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(shot, new File("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\Scrnsht\\Email.png"));
    		ast.assertEquals(c, e);
    		
    	}
    	@Test (priority=1)
    	public void TC5() throws IOException {
    		//first name less than 2 character 
    		form.FNA("a");
    		String a=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getText();
    		shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(shot, new File("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\Scrnsht\\Fname.png"));
    		ast.assertEquals(a, u);
    	}
    	@Test(priority=4,dependsOnMethods={"TC2"})  // it is not really dependent just for learning purpose
    	public void TC6() throws IOException {
    		//everything Blank all errors are compared
    		form.Send();
    		shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(shot, new File("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\Scrnsht\\ALLERROR.png"));
    		form.EFN();form.ELN();form.EMAA();form.EPH();form.EA();form.ECITY();form.EST();form.EZP();form.EDES();
    		shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(shot, new File("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\total1\\empty.png"));
    	    ast.assertEquals(form.EFN(),fn);ast.assertEquals(form.ELN(), ln); ast.assertEquals(form.EMAA(), em);
    	    ast.assertEquals(form.EPH(), PE); ast.assertEquals(form.EA(), AD); ast.assertEquals(form.ECITY(), Cy);
    	    ast.assertEquals(form.EST(), sts); ast.assertEquals(form.EZP(), zz); ast.assertEquals(form.EDES(), cmnt);
    		
    			 
    	}
    	@AfterClass
    	public void close(){
    		driver.quit();
    	}
}