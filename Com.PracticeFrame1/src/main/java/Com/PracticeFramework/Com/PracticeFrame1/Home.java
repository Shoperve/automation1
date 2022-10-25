package Com.PracticeFramework.Com.PracticeFrame1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
@FindBy(xpath="//*[text()='My Account']")WebElement MyAccount;
@FindBy (xpath="//*[text()='Register']")WebElement Registration;

public Home (WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void MyAccountClicking(){
	MyAccount.click();
}
public void RegisterbuttonClick(){
	Registration.click();
}



	
	
	
	

}
