package pageobjectrepository;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	protected JavascriptExecutor js;
	protected WebDriverWait sleep = new WebDriverWait(driver, Duration.ofSeconds(15));
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
}
