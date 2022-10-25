package Com.PracticeFramework.Com.PracticeFrame1;

import org.testng.annotations.Test;

public class HoneDepotCreateAccount extends Usability {
  @Test
  public void f() throws InterruptedException{
	  Home home=new Home(driver);
	  CreateAnAccount create=new CreateAnAccount(driver);
	  home.MyAccountClicking();
	  Thread.sleep(6000);
	  home.RegisterbuttonClick();
	  create.CreateAnAccountButton();
	  create.EnterEmail("shohel@yahoo.com");
	  create.EnterPassword("Test@123");
	  create.enterZipCode("22192");
	  create.enterPhoneNumber("9174434345");
	  create.SignClick();
	  create.Mobiles();
	  create.CreateButtonClick();
	  
		  
  }
}
