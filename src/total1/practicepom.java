package total1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class practicepom {

	WebDriver driver;
	@FindBy(id="id_contact")
	WebElement Subject;
	@FindBy(name="from")
	WebElement Email;
	@FindBy(xpath="//input[@name='id_order']")
	WebElement Ref;
	@FindBy(name="message")
	WebElement Message;
	@FindBy (id="fileUpload")
	WebElement Upload;
	@FindBy(id="submitMessage")
	WebElement Send;
	
	
	public practicepom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void subject(String sub) {
		Select sel=new Select(Subject);
		sel.selectByVisibleText(sub);
		
	}
	public void email(String e) {
		Email.sendKeys(e);
	}
	public void ref(String r) {
		Ref.sendKeys(r);
	}
	public void message(String m) {
		Message.sendKeys(m);
	}
	public void send(){
		Send.click();
	}
	public void upload(String u) {
		Upload.sendKeys(u);
	}
}

