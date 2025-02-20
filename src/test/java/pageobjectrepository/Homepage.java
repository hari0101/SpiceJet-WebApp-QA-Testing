package pageobjectrepository;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends BasePage {
	
	
	
	public Homepage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Signup')]") private WebElement btnSignup;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[1]") private WebElement radioBtnOneWay;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]") private WebElement radioBtnRoundTrip;
	
	@FindBy(css = ".css-76zvg2.r-cqee49.r-ubezar.r-1kfrs79.r-1ozqkpa") private WebElement selectInternational;
	
	@FindBy(xpath = "(//input[@type='text'])[1]") private WebElement inputTextFrom;
	@FindBy(css = "div[data-testid='to-testID-destination'] > div:nth-child(1)") private WebElement inputTextTO;
	
	@FindBy(xpath = "(//div[normalize-space()='Departure Date'])[1]") private WebElement departureDateField;
	
	@FindBy(xpath = "(//div[@dir='auto'][normalize-space()='25'])[2]") private WebElement departureDate;
	
	@FindBy(xpath= "//div[text()='Search Flight']") private WebElement btnSearchFlight;
	
	@FindBy(xpath = "(//div[contains(text(),'Select Date')])[1]") private WebElement returnDateField;
	@FindBy(xpath = "(//div[@dir='auto'][normalize-space()='27'])[2]") private WebElement returndate;
	
	public void clickSignupbtn() { btnSignup.click();}
	
	
	public void clickOneWay() { radioBtnOneWay.click();}
	public void clickRoundTrip() { radioBtnRoundTrip.click();}
	
	public void selectArrivalFrom(String name) { 
		inputTextFrom.click();
		inputTextFrom.sendKeys(name);
	 }
	
	public void selectDestinationTO(String name) { 
		inputTextTO.click();
		inputTextTO.sendKeys(name);
	}	
	
	public void selectDatefield() {
		
		departureDateField.click();
		departureDate.click();  }
	
	public void clickBtnSearchFlight() { btnSearchFlight.click();}
	
	public void clickReturnDate() { 
		returnDateField.click();
		returndate.click();
	}
	
	
	
	
	
	
	
	
}
