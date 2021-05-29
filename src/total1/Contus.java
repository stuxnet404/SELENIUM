package total1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Contus {
	String actual="There is 1 error\r\n"
			+ "The message cannot be blank.";
	WebDriver driver=new ChromeDriver();
	practicepom o;
	SoftAssert asert;

	@BeforeMethod
	public void open() {
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=contact");
		o=new practicepom(driver);
		asert=new SoftAssert();
		}
	
	@Test (priority=3, enabled=false)
	public void  test1(){
		
		o.subject("Customer service");
		o.email("practice@practice.com");
		o.ref("123456");
		o.message("I am trying POM");
		o.upload("C:\\Users\\Mr Avi\\Pictures\\jj.txt");
		o.send();
	//	String t1=driver.getCurrentUrl();
		/*
		 * if(t1.equals(actual)) { System.out.println("Test Pass");} else
		 * {System.out.println("Test Fail");}
		 */
	//	Assert.assertEquals(actual, t1);
		driver.navigate().back();
		driver.navigate().refresh();
	    driver.close();
		
		}
	@Test (priority=2)
	public void  test2(){
		o.subject("Webmaster");
		o.email("practice@practice.com");
		o.ref("123456");
		o.message("I am trying POM");
		o.upload("C:\\Users\\Mr Avi\\Pictures\\jj.txt");
		o.send();
	//	String t2=driver.getCurrentUrl();
		/*
		 * if(t2.equals(actual)) { System.out.println("Test Pass2");} else
		 * {System.out.println("Test Fail");}
		 */
	//	Assert.assertEquals(actual, t2);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
		}
    @Test (priority=1)
    public void  test3(){
		
		//forget to write message
		o.subject("Customer service");
		o.email("practice@practice.com");
		o.ref("123456");
		o.upload("C:\\Users\\Mr Avi\\Pictures\\jj.txt");
		o.send();
		String t3=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).getText();
		System.out.println(t3);
		/*
		 * if(t3.equals(actual)) { System.out.println("Test Pass3");} else
		 * {System.out.println("Test Fail");}
		 */
		asert.assertEquals(actual, t3);
		asert.assertAll();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
    }
	/*
	 * @AfterMethod public void close() {driver.quit();}
	 */
    }
  
