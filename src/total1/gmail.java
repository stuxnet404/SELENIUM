package total1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
public class gmail {
	
	public static void main (String arg[]) {
		//System.setProperty("webdriver.chrome.driver","‪D:\\dwnld\\extract\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
	//	driver.switchTo().frame("bscframe");
	//	String a=driver.getWindowHandle();
	//	driver.switchTo().window(null);
	
		new Actions(driver).sendKeys(driver.findElement(By.tagName("html")),Keys.CONTROL).sendKeys(driver.findElement(By.tagName("html")),Keys.NUMPAD2).build().perform();
	
		
	    driver.findElement(By.cssSelector("#firstName")).sendKeys("Selenium");
		driver.findElement(new ByAll (By.id("lastName"),By.name("lastName"), By.xpath("//input[@class='whsOnd zHQkBf']"))).sendKeys("Try");
		driver.findElement(By.name("Username")).sendKeys("SeleniumTry174545");
		//driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div.akwVEf.OcVpRe > div:nth-child(3) > div > div > button > div.VfPpkd-RLmnJb")).click();
		driver.findElement(By.name("Passwd")).sendKeys("Sel@123@789");
		driver.findElement(By.cssSelector("#confirm-passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Sel@123@789");
		driver.findElement(By.cssSelector("#accountDetailsNext > div > button > div.VfPpkd-RLmnJb")).click();
		
		
		
	}
}
