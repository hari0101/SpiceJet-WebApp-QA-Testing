package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjectrepository.FlightDeparturePage;
import pageobjectrepository.Homepage;

public class FlightSelectionTest extends BaseClass{
	
	Homepage home;
	FlightDeparturePage flight;
	
	
	@Test(priority = 0, description = "making valid flight selection", groups = "SmokeTest")
	public void makeValidFlightOneWay() {
		
		home = new Homepage(driver);
		home.clickOneWay();	
		home.selectArrivalFrom("Delhi");
		home.selectDestinationTO("Dubai");
		home.selectDatefield();
		home.clickBtnSearchFlight();
	}
	
	@Test(priority = 1, description = "making valid flight round trip", groups = "SmokeTest")
	public void makeValidFlightRoundTrip() {
		
		home = new Homepage(driver);
		home.clickRoundTrip();	
		home.selectArrivalFrom("Delhi");
		home.selectDestinationTO("Dubai");
		home.selectDatefield();
		home.clickReturnDate();
		home.clickBtnSearchFlight();
	}
	
	@Test(priority = 2, groups = "SmokeTest")
	public void flightDepartureDetails() {
		
		this.makeValidFlightOneWay();
		
		flight = new FlightDeparturePage(driver);
		flight.checkFlightDetails();
		flight.getFlightTicketDetails();
		flight.SelectContinueButton();
		 String amount = flight.getInclusiveAmount();
		 Assert.assertEquals(amount, "₹ 72,946");
	
	}
	
	
	
	
	
	
	
}
