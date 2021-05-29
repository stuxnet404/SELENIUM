package total1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.roicians.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/section[2]/div/div[3]/div/div/div/div/a")).click();
		
/*		CONTACTPOM oj=new CONTACTPOM(driver);
		oj.fn("Avi");
		oj.ln("Sharma");
		oj.email("testing@testing.com");
		oj.phone("123456789");
		oj.Message("This is POM testing");
		oj.Submit();
		*/

	}

}
