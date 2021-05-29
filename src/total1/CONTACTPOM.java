package total1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CONTACTPOM {

	WebDriver driver;
	@FindBy(id="text-77525447616")
	WebElement Fname;
	@FindBy(id="text-95374915097")
	WebElement Lname;
	@FindBy(id="text-27022866830")
	WebElement Email;
	@FindBy(css="#field-tIgxvmTMez6ibt1")
	WebElement Phone;
	@FindBy(xpath="//*[@id=\"field-kJfKGbPLNi5yFI7\"]")
	WebElement Message;
	@FindBy(xpath="//button[contains(@id,'button-18782068913')]")
	WebElement Submit;
	
	
	
	public CONTACTPOM(WebDriver driver) {
		PageFactory.initElements(driver,this); // to intialize the method
	}
	public void fn(String name) {
		Fname.sendKeys(name);
	}
	public void ln(String l) {
		Lname.sendKeys(l);
	}
	public void email(String El) {
		Email.sendKeys(El);
	}
	public void phone(String P) {
		Phone.sendKeys(P);
	}
	public void Message(String M) {
		Message.sendKeys(M);
	}
	public void Submit() {
		Submit.click();
	}
}

