package project2_Airline_Src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Airline_HomePage {                                             // For All TCs

	   WebDriver driver;

	 WebDriverWait  wait= new WebDriverWait(driver, Duration.ofSeconds(10));


	// step- 1 - Locate each component using @FindBy Annotation


		@FindBy(xpath = "//div[@class='pb-1 px-1 flex flex-middle nmx-1']")
		WebElement closelogin;

		@FindBy(xpath = "//div[@class='closeit']")
		WebElement closecookie;


	//step- 2 - Create separate methods for each component to perform action


		public void RemoveLogin(WebDriver driver) {

			wait.until(ExpectedConditions.visibilityOf(closelogin));
			   closelogin.click();

			wait.until(ExpectedConditions.visibilityOf(closecookie));
			    closecookie.click();


			              // Assertion 1
			    //String s1= driver.getTitle();
			    Assert.assertEquals(driver.getTitle(), "Cleartrip: #1 Site for Booking Flights Tickets & Hotels Online - Get Best Travel Deals");
	                     System.out.println("Main Page Title is-> " + driver.getTitle());
		}



		// step- 3 - Initializing the elements using PageFactory class inside the
		// constructor

		public Airline_HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
}
