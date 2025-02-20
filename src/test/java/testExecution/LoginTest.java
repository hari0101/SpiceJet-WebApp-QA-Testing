package testExecution;

import org.testng.annotations.Test;

import pageobjectrepository.LoginPage;

public class LoginTest extends BaseClass{
	
	LoginPage login;
		
	@Test(priority = 0, description = "Select the top-right-side login button", groups ="SmokeTest")
	public void selectLoginHomepage() {
		
		login = new LoginPage(driver);
		login.clickLoginLink();
		
	}
	
	@Test(priority = 1, description = "Login to spicejet with valid mobile number credentials",
				groups = "SmokeTest")
	public void validLoginWithMobileNumber() {
		
		login = new LoginPage(driver);
		
		login.inputMobileNumberWithPassword("9786059987", "mTXgty77zuq&Ppy");
		login.clickBtnLogin();
		
	}
	
	@Test(priority = 2, description = "Login to spicejet with valid email address credentials",
			groups = "SmokeTest")
	public void validLoginWithEmailAddress() {
	
		login = new LoginPage(driver);
		
		login.clickRadioBtnEmailAddress();
		login.inputEmailAddressPassword("spicejettest22@gmail.com", "mTXgty77zuq&Ppy");
		login.clickBtnLogin();
	
}
	
	@Test(dataProvider = "Invalid_Login_MobileNumber", dataProviderClass =  utilities.DataProviders.class, priority = 3, description = "Login to spicejet with valid mobile number credentials",
			groups = "SmokeTest")
	public void invalidLoginWithMobileNumber(String mobilenumber, String password) {
	
		login = new LoginPage(driver);
		
		login.inputMobileNumberWithPassword(mobilenumber, password);
		login.clickBtnLogin();
		login.clearMobileNumberWithPassword();
		
}
	
	@Test(dataProvider = "Invalid_Login_EmailAddress", dataProviderClass =  utilities.DataProviders.class, priority = 3, description = "Login to spicejet with valid mobile number credentials",
			groups = "SmokeTest")
	public void invalidLoginWithEmailAddress(String emailaddress, String password) {
	
		login = new LoginPage(driver);
		
		login.inputMobileNumberWithPassword(emailaddress, password);
		login.clickBtnLogin();
		login.clearEmailAddressPassword();
}
	
}
