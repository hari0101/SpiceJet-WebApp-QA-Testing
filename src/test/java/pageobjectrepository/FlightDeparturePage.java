package pageobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightDeparturePage extends BasePage {

	
	public FlightDeparturePage(WebDriver driver) {
		
		super(driver);
	}
	
	
	@FindBy(xpath = "(//div[@dir='auto'][normalize-space()='Flight Details'])[1]") private WebElement flightDetails;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1habvwh r-13awgt0 r-18u37iz r-hko4rg r-1sxzll1'])[1]") private WebElement flightTicketDetails;
	@FindBy(css = "div[data-testid='continue-search-page-cta']") private WebElement btnContinue;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-18u37iz'])[3]") private WebElement inclusiveAmount;
	
	public void checkFlightDetails() {  flightDetails.click(); }
	
	public void getFlightTicketDetails() { flightTicketDetails.getText(); }
	
	public void SelectContinueButton() { btnContinue.click();}
	
	public String getInclusiveAmount() { return inclusiveAmount.getText(); } 
	
	
	
	
	
}
