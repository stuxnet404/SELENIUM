package total1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMFORM {
 WebDriver driver;
 
 @FindBy(name="first_name")
 WebElement FN;
 @FindBy(name="last_name")
 WebElement LN;
 @FindBy(name="email")
 WebElement EMAIL;
 @FindBy(name="phone")
 WebElement PHONE;
 @FindBy(name="address")
 WebElement ADD;
 @FindBy(name="city")
 WebElement CT;
 @FindBy(name="state")
 WebElement ST;
 @FindBy(name="zip")
 WebElement ZP;
 @FindBy(name="website")
 WebElement WS;
 @FindBy(xpath="//input[contains(@value,'yes')]") // Relative xpath
 WebElement YES;
 @FindBy(xpath="//input[contains(@value,'no')]")
 WebElement NO;
 @FindBy(name="comment")
 WebElement CMNT;
 @FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")
 WebElement SEND;
 @FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")
 WebElement EFN;
 @FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")
 WebElement ELN;
 @FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[1]")
 WebElement EE;
 @FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[1]")
 WebElement EP;
 @FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[2]")
 WebElement EAD;
 @FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[2]")
 WebElement EC;
 @FindBy(css="#contact_form > fieldset > div:nth-child(8) > div")
 WebElement ES;
 @FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[8]/div/small[2]")
 WebElement EZ;
 @FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[2]")
 WebElement ED;
 
 public POMFORM(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 
 }
 public void FNA(String f) {
	 FN.sendKeys(f);  }
 public void LNA(String l) {
	 LN.sendKeys(l); }
 public void EMA(String e) {
	 EMAIL.sendKeys(e);}
 public void PH(String p)  {
	 PHONE.sendKeys(p); }
 public void AD(String a) {
	 ADD.sendKeys(a);}
 public void City(String c) {
	 CT.sendKeys(c);}
 public void Sta(String s) {
	 Select st=new Select(ST);
	 st.selectByVisibleText(s);
	 
	 ST.sendKeys(s);  }
 public void Zp(String z) {
	 ZP.sendKeys(z);}
 public void Web(String w) {
	 WS.sendKeys(w);}
 public void COM(String com) {
	 CMNT.sendKeys(com);}
 public void y() {
	 YES.click();}
 public void n() {
	 NO.click(); }
 public void Send() {
	 SEND.click();
 }
 public String EFN() {
	String a= EFN.getText();
	return a;
	 }
 public String ELN() {
	 String b=ELN.getText();
	return b;	 
}
 public String EMAA() {
	 String c=EE.getText();
	 return c;
 }
 public String EPH() {
	 String e=EP.getText();
	 return e;
 }
 public String EA() {
	 String f=EAD.getText();
	 return f;
 }
 public String ECITY() {
	 String ct=EC.getText();
	 return ct;
 }
 public String EST() {
	 String st=ES.getText();
	 return st;
 }
 public String EZP() {
	 String ez=EZ.getText();
	 return ez;
 }
 public String EDES() {
	 String ef=ED.getText();
	 return ef;
 }
 
}
