package project2_Airline_Src;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Airline_SeatSelection_Page {                                             // For TC8

	WebDriver driver;

	 WebDriverWait  wait= new WebDriverWait(driver, Duration.ofSeconds(10));


	// step- 1 - Locate each component using @FindBy Annotation

	     @FindBy(xpath = "(//div/child::span)[4]")
         WebElement slctcls;

	     @FindBy(xpath= "(//div/child::button[@class='bn c-pointer'])[1]")
	      WebElement adult;

	     @FindBy(xpath= "(//div/child::button[@class='bn c-pointer'])[3]")
	      WebElement child;

		@FindBy(xpath = "(//input[@class='w-100p fs-16 fw-500 c-neutral-900'])[1]")
		   WebElement depart;

		@FindBy(xpath = "//p[.='Jaipur, IN - Sanganeer (JAI)']")
		  WebElement jaipur;

		@FindBy(xpath = "//input[@class='w-100p fs-16 fw-500 c-neutral-900']")
		   WebElement arrival;

		@FindBy(xpath = "//p[.='Bengaluru, IN - Kempegowda International Airport (BLR)']")
		  WebElement bangalore;

		@FindBy(xpath = "//div[@class='sc-aXZVg dSvAMK mr-2 mt-1']")
           WebElement calanderslct;

		@FindBy(xpath = "((//div[@class='DayPicker-Body']/child::div[@class='DayPicker-Week'])[9])/following::div[21]")
		  WebElement dateslct;

		@FindBy(xpath = "(//div[@class='sc-aXZVg ibgoAF'])[4]")
		  WebElement searchflight;

		@FindBy(xpath = "(//button[@class='sc-jXbUNg kfa-Dui w-100p'])[3]")
		  WebElement book;

		@FindBy(xpath = "//div/following-sibling::button[@class='sc-jXbUNg kcAikq ml-4 mr-2']")
		  WebElement continuue;



		@FindBy(xpath = "//h1[.='Search flights']")
		  WebElement srchmsg;

		@FindBy(xpath = "(//button/child::div)[2]")
		  WebElement asrtsearch;

		@FindBy(xpath = "(//button/child::div)[3]")
		  WebElement asrtbook;

	//step- 2 - Create separate methods for each component to perform action

		public void SearchDetails() {

		            	wait.until(ExpectedConditions.visibilityOf(srchmsg));
                         // Assertion 1
                  Assert.assertEquals(srchmsg.getText(), "Search flights");

                           String srchmsg1= srchmsg.getText();
                                  System.out.println("Assertion Message-> " + srchmsg1);

			wait.until(ExpectedConditions.visibilityOf(slctcls));
			slctcls.click();

			wait.until(ExpectedConditions.visibilityOf(adult));
			adult.click();

			wait.until(ExpectedConditions.visibilityOf(child));
			child.click();

			wait.until(ExpectedConditions.visibilityOf(slctcls));
			slctcls.click();

			wait.until(ExpectedConditions.visibilityOf(depart));
			depart.sendKeys("Jaipur");

			wait.until(ExpectedConditions.visibilityOf(jaipur));
			jaipur.click();

			wait.until(ExpectedConditions.visibilityOf(arrival));
			arrival.sendKeys("Bangalore");

			wait.until(ExpectedConditions.visibilityOf(bangalore));
			bangalore.click();

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

			wait.until(ExpectedConditions.visibilityOf(book));
			book.click();

			wait.until(ExpectedConditions.visibilityOf(continuue));
			continuue.click();

		}

		public void ControlChild(WebDriver driver)
		{
			Set<String> pcid= driver.getWindowHandles();
			  Iterator<String> ids= pcid.iterator();


				String parentid= ids.next();
			    String childid= ids.next();

			       driver.switchTo().window(parentid);
			            System.out.println("Parent Window ID-> " +parentid);

			       driver.switchTo().window(childid);
		                System.out.println("Child Window ID-> " +childid);



			       System.out.println("Child W Title-> " + driver.getTitle());
			       System.out.println("The Url is-> " + driver.getCurrentUrl());

		}




		//@FindBy(xpath = "(//div/following::div[@class='sc-aXZVg fvpVSy'])[1]")
		  //WebElement applycoupon;

		@FindBy(xpath = "//button[@class='sc-dAlyuH emvfDL']/child::div")
		  WebElement continuee1;

		@FindBy(xpath= "//h4[.='Select seats']")
		  WebElement slctseat;

		@FindBy(xpath = "(//div[@class='sc-aXZVg hBLExv']/child::div)[65]")
		  WebElement seat11a;

		@FindBy(xpath = "(//div[@class='sc-aXZVg hBLExv']/child::div)[67]")
		  WebElement seat13a;

		@FindBy(xpath = "(//div[@class='sc-aXZVg hBLExv']/child::div)[68]")
		  WebElement seat14a;

		@FindBy(xpath= "//h4[.='Next']")
		  WebElement next;

		@FindBy(xpath = "//h4[.='Done']")
		  WebElement done;



		@FindBy(xpath = "//h3[.='Seats added']")
		  WebElement seatmsg;

		/*@FindBy(xpath = "//button[@class='sc-dhKdcB deACHI']/child::div")
		  WebElement continuee2;

		@FindBy(xpath = "//p[@class='sc-eqUAAy kKCHMl py-2']")
		  WebElement skipaddons;
		*/


		public void SeatDetails()
		{
			//wait.until(ExpectedConditions.visibilityOf(applycoupon));
			//applycoupon.click();

			wait.until(ExpectedConditions.visibilityOf(continuee1));
			continuee1.click();

			wait.until(ExpectedConditions.visibilityOf(slctseat));
			slctseat.click();

			wait.until(ExpectedConditions.visibilityOf(seat11a));
			seat11a.click();

			wait.until(ExpectedConditions.visibilityOf(seat13a));
			seat13a.click();

			wait.until(ExpectedConditions.visibilityOf(seat14a));
			seat14a.click();

			wait.until(ExpectedConditions.visibilityOf(next));
			next.click();

			wait.until(ExpectedConditions.visibilityOf(seat11a));
			seat11a.click();

			wait.until(ExpectedConditions.visibilityOf(seat13a));
			seat13a.click();

			wait.until(ExpectedConditions.visibilityOf(seat14a));
			seat14a.click();

			wait.until(ExpectedConditions.visibilityOf(done));
			done.click();



                     // Assertion 4
		     wait.until(ExpectedConditions.visibilityOf(seatmsg));
                Assert.assertEquals(seatmsg.getText(), "Seats added");

                            String seatmsg1= seatmsg.getText();
                                    System.out.println("Assertion Message-> " + seatmsg1);

		/*	wait.until(ExpectedConditions.visibilityOf(continuee2));
			continuee2.click();

			wait.until(ExpectedConditions.visibilityOf(skipaddons));
			skipaddons.click();
			*/

		}

		// step- 3 - Initializing the elements using PageFactory class inside the
		// constructor

		public Airline_SeatSelection_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
}
