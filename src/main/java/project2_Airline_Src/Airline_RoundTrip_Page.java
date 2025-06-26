package project2_Airline_Src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Airline_RoundTrip_Page {                                             // For TC5, TC14

	WebDriver driver;

	 WebDriverWait  wait= new WebDriverWait(driver, Duration.ofSeconds(10));


	// step- 1 - Locate each component using @FindBy Annotation

		@FindBy(xpath = "(//input[@class='w-100p fs-16 fw-500 c-neutral-900'])[1]")
		   WebElement depart;

		@FindBy(xpath = "//p[.='Jaipur, IN - Sanganeer (JAI)']")
		  WebElement dairportslct;

		@FindBy(xpath = "//input[@class='w-100p fs-16 fw-500 c-neutral-900']")
		   WebElement arrival;

		@FindBy(xpath = "//p[.='Bengaluru, IN - Kempegowda International Airport (BLR)']")
		  WebElement aairportslct;

		@FindBy(xpath = "//div[@class='sc-aXZVg dSvAMK mr-2 mt-1']")
           WebElement calanderslct;

		@FindBy(xpath = "((//div[@class='DayPicker-Body']/child::div[@class='DayPicker-Week'])[9])/following::div[21]")
		  WebElement dateslct;

		@FindBy(xpath = "//span[@class=' c-neutral-400 flex flex-nowrap fs-16 fw-500']")
		  WebElement returnslct;

		@FindBy(xpath = "(//div[@class='DayPicker-Day'])[14]")
		  WebElement returndate;

		@FindBy(xpath = "(//div[@class='sc-aXZVg ibgoAF'])[4]")
		  WebElement searchflight;



		@FindBy(xpath = "//h1[.='Search flights']")
		  WebElement srchmsg;

		@FindBy(xpath = "(//button/child::div)[2]")
		  WebElement asrtsearch;

		@FindBy(xpath = "(//button/child::div)[3]")
		  WebElement asrtbook;

	//step- 2 - Create separate methods for each component to perform action

		public void RoundTrip() {

                              // Assertion 1
		       wait.until(ExpectedConditions.visibilityOf(srchmsg));
                    Assert.assertEquals(srchmsg.getText(), "Search flights");

                          String srchmsg1= srchmsg.getText();
	                        System.out.println("Assertion Message-> " + srchmsg1);


			wait.until(ExpectedConditions.visibilityOf(depart));
			depart.sendKeys("Jaipur");

			wait.until(ExpectedConditions.visibilityOf(dairportslct));
			dairportslct.click();

			wait.until(ExpectedConditions.visibilityOf(arrival));
			arrival.sendKeys("Bangalore");

			wait.until(ExpectedConditions.visibilityOf(aairportslct));
			aairportslct.click();

			wait.until(ExpectedConditions.visibilityOf(calanderslct));
			calanderslct.click();

			wait.until(ExpectedConditions.visibilityOf(dateslct));
			dateslct.click();

			wait.until(ExpectedConditions.visibilityOf(returnslct));
			returnslct.click();

			wait.until(ExpectedConditions.visibilityOf(returndate));
			returndate.click();

			wait.until(ExpectedConditions.visibilityOf(searchflight));
			searchflight.click();

			                // Assertion 2
			          Assert.assertTrue(asrtsearch.isDisplayed());


			                // Assertion 3
			     wait.until(ExpectedConditions.visibilityOf(asrtbook));
			             Assert.assertTrue(asrtbook.isDisplayed());

		}



		// step- 3 - Initializing the elements using PageFactory class inside the
		// constructor

		public Airline_RoundTrip_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
}
