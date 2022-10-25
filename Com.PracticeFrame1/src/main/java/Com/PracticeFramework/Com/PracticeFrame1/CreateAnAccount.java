package Com.PracticeFramework.Com.PracticeFrame1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount {
	public WebDriver driver;
@FindBy(xpath="(//*[text()='Select & Continue'])[1]")WebElement CreateAnAccountButtton;
@FindBy(id="email")WebElement EmailField;
@FindBy(id="password-input-field")WebElement passwordField;
@FindBy(id="zipCode")WebElement zipcodeField;
@FindBy(id="phone")WebElement phoneNumber;
@FindBy(xpath="(//*[@class='checkbox-btn__label-test u__text-align--left'])[1]")WebElement Signed;
@FindBy(xpath="(//*[@class='checkbox-btn__label-test u__text-align--left'])[2]")WebElement Mobile;
@FindBy(xpath="(//*[text()='Create an Account'])[2]")WebElement CreateAccount;



public CreateAnAccount (WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void CreateAnAccountButton(){
	CreateAnAccountButtton.click();
}
public void EnterEmail(String email){
	EmailField.sendKeys(email);
}

public void EnterPassword(String password){
	passwordField.sendKeys(password);
}
public void enterZipCode(String zipcode){
	zipcodeField.sendKeys(zipcode);
}
public void enterPhoneNumber(String PhoneNumber){
	phoneNumber.sendKeys(PhoneNumber);
}
public void SignClick(){
	Signed.click();
}
public void Mobiles(){
	Mobile.click();
}
public void CreateButtonClick(){
	CreateAccount.click();
}
}
