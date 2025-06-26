package project2_Airline_Src;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Airline_RegisterPage                                                  // For TC1
{

	public WebDriver driver;

	 WebDriverWait  wait= new WebDriverWait(driver, Duration.ofSeconds(10));



	// ClearTrip

	// step- 1 - Locate each component using @FindBy Annotation

	@FindBy(id = "mobile")
	WebElement mobilenum;



//step- 2 - Create separate methods for each component to perform action

	public void SignUpCT(WebDriver driver) {

		wait.until(ExpectedConditions.visibilityOf(mobilenum));
		mobilenum.sendKeys("8233668067");

	}



	// step- 3 - Initializing the elements using PageFactory class inside the
	// constructor

	public Airline_RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}




















	// ***************************************************************************************************************

	// step- 1 - Locate each component using @FindBy Annotation

	// Air India

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	WebElement acceptbutton;

	@FindBy(xpath = "//button[@id='signIn']")
	WebElement signinclick;

	@FindBy(xpath = "//button[@id='create-account-button']")
	WebElement signup;

	@FindBy(xpath = "//div[@class='mat-select-arrow ng-tns-c44-1']")
	WebElement titleclick;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement mrclick;

	@FindBy(xpath = "//input[@name='userfirstNameInput']")
	WebElement firstname;

	@FindBy(xpath = "//input[@name='userLastName']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='date_of_birth']")
	WebElement dateofbirth;

	@FindBy(xpath = "//option[@aria-label='January']")
	WebElement month;

	@FindBy(xpath = "//option[@value='1998']")
	WebElement year;

	@FindBy(xpath = "(//div[@class='ngb-dp-day ng-star-inserted'])[23]")
	WebElement date;

	@FindBy(xpath = "//input[@name='contactEmail']")
	WebElement email;

	@FindBy(xpath = "//input[@name='confirmEmail']")
	WebElement confirmemail;

	@FindBy(xpath = "//input[@id='phoneNo']")
	WebElement phoneno;

	@FindBy(xpath = "//input[@id='confirmPhoneNo']")
	WebElement confirmphoneno;

	 @FindBy(xpath="//input[@id='promotionCheck']")
	 WebElement checkbox;

	@FindBy(xpath = "//button[@id='submit-button']")
	WebElement submitbutton;



// step- 2 - Create separate methods for each component to perform action

	public void Signin() {

		wait.until(ExpectedConditions.visibilityOf(acceptbutton));
		acceptbutton.click();

		wait.until(ExpectedConditions.visibilityOf(signinclick));
		signinclick.click();
	}

	public void Signup() {

		wait.until(ExpectedConditions.visibilityOf(signup));
		signup.click();
	}

	public void CreateAccount() {

		wait.until(ExpectedConditions.visibilityOf(titleclick));
		titleclick.click();

		wait.until(ExpectedConditions.visibilityOf(mrclick));
		mrclick.click();

		wait.until(ExpectedConditions.visibilityOf(firstname));
		firstname.sendKeys("Ajit");

		wait.until(ExpectedConditions.visibilityOf(lastname));
		lastname.sendKeys("Choudhary");

		wait.until(ExpectedConditions.visibilityOf(dateofbirth));
		dateofbirth.click();

		wait.until(ExpectedConditions.visibilityOf(month));
		month.click();

		wait.until(ExpectedConditions.visibilityOf(year));
		year.click();

		wait.until(ExpectedConditions.visibilityOf(date));
		date.click();

		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("ajitchoudhary0802@gmail.com");

		wait.until(ExpectedConditions.visibilityOf(confirmemail));
		confirmemail.sendKeys("ajitchoudhary0802@gmail.com");

		wait.until(ExpectedConditions.visibilityOf(phoneno));
		phoneno.sendKeys("8233668068");

		wait.until(ExpectedConditions.visibilityOf(confirmphoneno));
		confirmphoneno.sendKeys("8233668068");

		wait.until(ExpectedConditions.visibilityOf(checkbox));
		// checkbox.click();
	}

	public void Submit(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled')", submitbutton);

		wait.until(ExpectedConditions.visibilityOf(submitbutton));

		System.out.println("The Button Is Enable-> " + submitbutton.isEnabled());
		System.out.println("The Button Is Displayed-> " + submitbutton.isDisplayed());

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit-button']")));

		wait.until(ExpectedConditions.visibilityOf(submitbutton));
		 //submit.click();

		js.executeScript("arguments[0].click()", submitbutton);

	}












	// *****************************************************************************************************************
	// SouthWest Airline

	// step- 1 - Locate each component using @FindBy Annotation

	@FindBy(xpath = "//a[.='Create account']")
	WebElement createaccount;

	@FindBy(name = "firstName")
	WebElement frstname;

	@FindBy(name = "lastName")
	WebElement lstname;

	@FindBy(id = "gender")
	WebElement gender;

	@FindBy(id = "gender-item-1")
	WebElement male;

	@FindBy(name = "dateOfBirth")
	WebElement dob;

	@FindBy(id = "countryCode")
	WebElement country;

	@FindBy(name = "street")
	WebElement streetadd;

	@FindBy(name = "aptSuite")
	WebElement aptmnt;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(id = "stateProvinceRegion")
	WebElement state;

	@FindBy(name = "postalCode")
	WebElement zipcode;

	@FindBy(name = "phoneCountryCode")
	WebElement code;

	@FindBy(xpath = "((//select[@class='select__oz-I+'])[4])//option[.='91']")
	WebElement indiacode;

	@FindBy(name = "phoneNumber")
	WebElement mobileno;

	@FindBy(name = "email")
	WebElement mail;

	@FindBy(name = "confirmEmail")
	WebElement cnfrmmail;

	@FindBy(name = "username")
	WebElement un;

	@FindBy(name = "password")
	WebElement pwd;

	@FindBy(xpath = "(//div[@class='icon__o0Kad iconContainer__yU2Yi'])[1]")
	WebElement uncheck;

	@FindBy(xpath = "(//div[.='Create account'])[3]")
	WebElement creataccountbtn;

	// step- 2 - Create separate methods for each component to perform action

	public void SWAccount() {

		wait.until(ExpectedConditions.visibilityOf(createaccount));
		createaccount.click();
	}

	public void AccountDetails() {

		wait.until(ExpectedConditions.visibilityOf(frstname));
		frstname.sendKeys("Ajit");

		wait.until(ExpectedConditions.visibilityOf(lstname));
		lstname.sendKeys("Choudhary");

		wait.until(ExpectedConditions.visibilityOf(gender));
		gender.click();

		wait.until(ExpectedConditions.visibilityOf(male));
		male.click();

		wait.until(ExpectedConditions.visibilityOf(dob));
		dob.sendKeys("01/20/1998");

		wait.until(ExpectedConditions.visibilityOf(country));
		country.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);

		wait.until(ExpectedConditions.visibilityOf(country));
		country.sendKeys("India");

		wait.until(ExpectedConditions.visibilityOf(streetadd));
		streetadd.sendKeys("Tatarwi");

		wait.until(ExpectedConditions.visibilityOf(aptmnt));
		aptmnt.sendKeys("Tatarwi");

		wait.until(ExpectedConditions.visibilityOf(city));
		city.sendKeys("Badi Khatu");

		wait.until(ExpectedConditions.visibilityOf(state));
		state.sendKeys("Rajasthan");

		wait.until(ExpectedConditions.visibilityOf(zipcode));
		zipcode.sendKeys("341301");

		wait.until(ExpectedConditions.visibilityOf(code));
		code.click();

		wait.until(ExpectedConditions.visibilityOf(indiacode));
		Select s1 = new Select(indiacode);
		s1.selectByVisibleText("91");

		wait.until(ExpectedConditions.visibilityOf(indiacode));
		indiacode.click();

		wait.until(ExpectedConditions.visibilityOf(mobileno));
		mobileno.sendKeys("8233668068");

		wait.until(ExpectedConditions.visibilityOf(mail));
		mail.sendKeys("ajitchoudhary0802@gmail.com");

		wait.until(ExpectedConditions.visibilityOf(cnfrmmail));
		cnfrmmail.sendKeys("ajitchoudhary0802@gmail.com");

		wait.until(ExpectedConditions.visibilityOf(un));
		un.sendKeys("ajitchoudhary");

		wait.until(ExpectedConditions.visibilityOf(pwd));
		pwd.sendKeys                                                                                                                                                                                                                                             ("Aj@803131");

		wait.until(ExpectedConditions.visibilityOf(uncheck));
		uncheck.click();

		wait.until(ExpectedConditions.visibilityOf(creataccountbtn));
		// creataccountbtn.click();
	}

}
