package project2_Airline_Src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Airline_FareRule_Page {                                             // For TC10

	WebDriver driver;

	 WebDriverWait  wait= new WebDriverWait(driver, Duration.ofSeconds(10));


	// step- 1 - Locate each component using @FindBy Annotation


		 @FindBy(xpath = "(//div/following::input)[1]")
		   WebElement depart2;

	       @FindBy(xpath = "//p[.='Hyderabad, IN - Rajiv Gandhi International (HYD)']")
			  WebElement hyderabad;

	       @FindBy(xpath = "(//div/following-sibling::input)[2]")
		   WebElement arrival2;

			@FindBy(xpath = "//p[.='Dubai, AE - Dubai International Airport (DXB)']")
			  WebElement dubai;

		@FindBy(xpath = "//div[@class='sc-aXZVg dSvAMK mr-2 mt-1']")
           WebElement calanderslct;

		@FindBy(xpath = "((//div[@class='DayPicker-Body']/child::div[@class='DayPicker-Week'])[9])/following::div[21]")
		  WebElement dateslct;

		@FindBy(xpath = "(//div[@class='sc-aXZVg ibgoAF'])[4]")
		  WebElement searchflight;

		@FindBy(xpath = "(//div/child::span[@class='ml-1'])[1]")
		  WebElement flightdetails;

		@FindBy(xpath = "//div/child::div[.='Fare Rules']")
		  WebElement farerule;



		@FindBy(xpath = "//h1[.='Search flights']")
		  WebElement srchmsg;

		@FindBy(xpath = "(//button/child::div)[2]")
		  WebElement asrtsearch;

		@FindBy(xpath = "(//button/child::div)[3]")
		  WebElement asrtbook;

		@FindBy(xpath = "(//div/child::button[.='Book'])[2]")
		  WebElement asrtrules;

	//step- 2 - Create separate methods for each component to perform action


	        public void HydTODxb() {

                               // Assertion 1
 	                 wait.until(ExpectedConditions.visibilityOf(srchmsg));
                           Assert.assertEquals(srchmsg.getText(), "Search flights");

                                String srchmsg1= srchmsg.getText();
                                     System.out.println("Assertion Message-> " + srchmsg1);


				wait.until(ExpectedConditions.visibilityOf(depart2));
				depart2.sendKeys("hyd");

				wait.until(ExpectedConditions.visibilityOf(hyderabad));
				hyderabad.click();

				wait.until(ExpectedConditions.visibilityOf(arrival2));
				arrival2.sendKeys("dxb");

				wait.until(ExpectedConditions.visibilityOf(dubai));
				dubai.click();

				wait.until(ExpectedConditions.visibilityOf(calanderslct));
				calanderslct.click();

				wait.until(ExpectedConditions.visibilityOf(dateslct));
				dateslct.click();


				wait.until(ExpectedConditions.visibilityOf(searchflight));
				searchflight.click();


			                             // Assertion 2
								Assert.assertTrue(asrtsearch.isDisplayed());

								       // Assertion 3
								wait.until(ExpectedConditions.visibilityOf(asrtbook));
								      Assert.assertTrue(asrtbook.isDisplayed());


				wait.until(ExpectedConditions.visibilityOf(flightdetails));
				flightdetails.click();


				wait.until(ExpectedConditions.visibilityOf(farerule));
				farerule.click();


				             // Assertion 4
				       wait.until(ExpectedConditions.visibilityOf(asrtrules));
				            Assert.assertTrue(asrtrules.isDisplayed());


			  }




		// step- 3 - Initializing the elements using PageFactory class inside the
		// constructor

		public Airline_FareRule_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
}
