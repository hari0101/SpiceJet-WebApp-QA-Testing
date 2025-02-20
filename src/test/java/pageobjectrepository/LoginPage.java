package pageobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	@FindBy(xpath = "//div[contains(text(),'Login')]") private WebElement loginlink;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[3]") private WebElement radioBtnMobileNumber;
	@FindBy(css = "input[data-testid='user-mobileno-input-box'][type='number']") private WebElement mobilenumberfield;
	@FindBy(css = "input[data-testid='password-input-box-cta']") private WebElement mobilenumberPassword;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[4]") private WebElement radioBtnEmail;
	@FindBy(css = "input[data-testid='user-mobileno-input-box'][type='email']") private WebElement emailAddressfield;
	@FindBy(css = "input[data-testid='password-input-box-cta']") private WebElement emailPassword;
	
	//Login button
	@FindBy(css = ".css-1dbjc4n.r-1awozwy.r-184aecr.r-z2wwpe.r-1loqt21.r-18u37iz.r-tmtnm0.r-1777fci.r-1x0uki6.r-1w50u8q.r-ah5dr5.r-1otgn73") 
			private WebElement btnLogin;
	
	public void clickLoginLink() { loginlink.click();}
	
	public void clickRadioBtnEmailAddress() { radioBtnEmail.click();}
	
	public void inputEmailAddressPassword(String emailaddress, String password) {
		
		emailAddressfield.sendKeys(emailaddress);
		emailPassword.sendKeys(password);
	}
	
	
	public void inputMobileNumberWithPassword(String phonenumber, String password) { 
		
		mobilenumberfield.sendKeys(phonenumber);
		mobilenumberPassword.sendKeys(password);     }
	
	public void clearMobileNumberWithPassword() { 
	
		mobilenumberfield.clear();
		mobilenumberPassword.clear();   }
	
	public void clearEmailAddressPassword() {
		
		emailAddressfield.clear();
		emailPassword.clear();
	}
	
	public void clickBtnLogin() { btnLogin.click(); }
	
	
}
	
	
