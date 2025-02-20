package pageobjectrepository;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage{
	
	Select selectDropdown;
	
	public SignupPage(WebDriver driver) {
		
		super(driver);
	}
	
	//Title dropdown box.
	@FindBy(css = ".col-sm-4.mt-2.px-sm-4 > select") private WebElement dropdownTitle;
	//FirstLast Name input field.
	@FindBy(id = "first_name") private WebElement inputFirstMiddleName;
	
	@FindBy(id = "last_name") private WebElement inputLastName;
	
	@FindBy(css = ".col-sm-6.mt-30.px-sm-4 > select") private WebElement dropdownCountry;
	
	@FindBy(id = "dobDate") private WebElement clickDOBField;
	
	@FindBy(className = "react-datepicker__month-select") private WebElement dropdownMonth;
	
	@FindBy(className = "react-datepicker__year-select") private WebElement dropdownYear;
	
	@FindBy(css = ".react-datepicker__month > div:nth-child(3) > .react-datepicker__day.react-datepicker__day--016")
								private WebElement dropdownDateSixteen;	
	
	@FindBy(css = "input[placeholder='+91 01234 56789']") private WebElement inputMobileNumber;
	
	@FindBy(id = "email_id") private WebElement inputEmailID;
	
	@FindBy(css = "#new-password") private WebElement inputPassword;
	@FindBy(css = "#c-password") private WebElement inputConfirmPassword;
	@FindBy(id = "defaultCheck1") private WebElement checkboxAgreeTerms;
	@FindBy(xpath = "//button[normalize-space()='Submit']") private WebElement buttonSumbit;
	
//	< ------------------------------------------- Action Methods ------------------------------------------- >	
	
	public void selectTitle(String name) {
		
		selectDropdown = new Select(dropdownTitle);
		selectDropdown.selectByVisibleText(name); }
	
	public void inputFirstMiddleName(String firstmiddlename) { inputFirstMiddleName.sendKeys(firstmiddlename);}
	
	public void inputLastName(String lastname) { inputLastName.sendKeys(lastname);}
	
	public void selectCountry(String country) {
		
		selectDropdown = new Select(dropdownCountry);
		selectDropdown.selectByVisibleText(country); 
	}
	
	public void selectDateOfBirth(String month, String year) {
		
		clickDOBField.click();
		selectDropdown = new Select(dropdownMonth);
		selectDropdown.selectByVisibleText(month);
		
		selectDropdown = new Select(dropdownYear);
		selectDropdown.selectByValue(year);
		
		dropdownDateSixteen.click();
	}
	
	public void inputMobileNumber(String mobilenumber) { inputMobileNumber.sendKeys(mobilenumber); }
	
	public void inputEmailAddress(String emailId) { 
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", inputEmailID);
		
		//sleep = new WebDriverWait(driver, Duration.ofSeconds(15));
		sleep.until(ExpectedConditions.visibilityOfAllElements(inputEmailID));
		inputEmailID.sendKeys(emailId);}
	
	public void inputPassword(String password) { 
//		js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", inputPassword);
		//sleep = new WebDriverWait(driver, Duration.ofSeconds(15));
		sleep.until(ExpectedConditions.visibilityOfAllElements(inputPassword));
		
		inputPassword.sendKeys(password);
		}
	
	public void inputConfirmPassword(String confirmpassword) { 
//		js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", inputConfirmPassword);
		
		//sleep = new WebDriverWait(driver, Duration.ofSeconds(15));
		sleep.until(ExpectedConditions.visibilityOfAllElements(inputConfirmPassword));
		inputConfirmPassword.sendKeys(confirmpassword);
		}
	
	public void clickCheckBoxAgreeTerms() { 
		//sleep = new WebDriverWait(driver, Duration.ofSeconds(15));
		sleep.until(ExpectedConditions.elementToBeClickable(checkboxAgreeTerms));
		
		checkboxAgreeTerms.click();}
	
	public void clickBtnSubmit() { 
		
		//sleep = new WebDriverWait(driver, Duration.ofSeconds(15));
		sleep.until(ExpectedConditions.elementToBeClickable(buttonSumbit));
		buttonSumbit.click();
		}

	



}
