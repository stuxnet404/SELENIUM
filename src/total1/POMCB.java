package total1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMCB {
	WebDriver driver;
	@FindBy(id="isAgeSelected")
	WebElement only;
	@FindBy(css="#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(3) > label > input")
	WebElement Op1;
	@FindBy(css="#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(4) > label > input")
	WebElement Op2;
	@FindBy(css="#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(5) > label > input")
	WebElement Op3;
	@FindBy(css="#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(6) > label > input")
	WebElement Op4;
	@FindBy(id="check1")
	WebElement ALL;
    
	public POMCB(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
    public void  Only() {
    	only.click();
    }
    public void OP1() {
    	Op1.click();
    }
    public void OP2() {
    	Op2.click();
    }
    public void OP3() {
    	Op3.click();
    }
    public void OP4() {
    	Op4.click();
    } public void SELECTALL() {
    	ALL.click();
    }
    
    
}
