package testExecution;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import pageobjectrepository.*;

public class CreateAccountTest extends BaseClass {

	Homepage home;
	SignupPage account;  
	
	@Test(description = "Create a new account with valid credentials", priority = 0,
			groups = "SmokeTest")
	public void createNewAccountValid_TC001_to_TC005() {
		
		
		home = new Homepage(driver);
		home.clickSignupbtn();
		List<String> list = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		
		account = new SignupPage(driver);
		account.selectTitle("Mr");
		account.inputFirstMiddleName("Hari Prasath");
		account.inputLastName("S");
		account.selectCountry("India");
		account.selectDateOfBirth("July", "2002");
		account.inputMobileNumber("7875068899");
		account.inputEmailAddress("hariprasaths162002@gmail.com");
		account.inputPassword("newSpiceJet!@#123");
		account.inputConfirmPassword("newSpiceJet!@#123");
		account.clickCheckBoxAgreeTerms();
		account.clickBtnSubmit();
	
	
	}
	
	
	@Test(dataProvider = "Create_Account_Invalid_Input", dataProviderClass =  utilities.DataProviders.class, description = "Creating account with invalid credentials", priority = 0,
			groups = "SmokeTest")
	public void invalidInputCredentials_TC006_to_TC009(String title, String firstmiddlename, String lastname, String country,
			String emailid,	String month, String year, String password, String confirmpassword, String mobilenumber) {
		
		
		home = new Homepage(driver);
		home.clickSignupbtn();
		List<String> list = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		
		account = new SignupPage(driver);
		account.selectTitle(title);
		account.inputFirstMiddleName(firstmiddlename);
		account.inputLastName(lastname);
		account.selectCountry(country);
		account.selectDateOfBirth(month, year);
		account.inputMobileNumber(mobilenumber);
		account.inputEmailAddress(emailid);
		account.inputPassword(password);
		account.inputConfirmPassword(confirmpassword);
		account.clickCheckBoxAgreeTerms();
		account.clickBtnSubmit();
	
	}
	
	
	
}
