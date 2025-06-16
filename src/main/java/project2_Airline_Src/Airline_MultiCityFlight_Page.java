package project2_Airline_Src;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Airline_MultiCityFlight_Page {                                             // For TC7

	WebDriver driver;
	
	 WebDriverWait  wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	 
	// step- 1 - Locate each component using @FindBy Annotation

	 
		@FindBy(xpath = "(//input[@class='w-100p fs-16 fw-500 c-neutral-900'])[1]")
		   WebElement depart;
		
		@FindBy(xpath = "//p[.='Jaipur, IN - Sanganeer (JAI)']")
		  WebElement jaipur;

		@FindBy(xpath = "//input[@class='w-100p fs-16 fw-500 c-neutral-900']")
		   WebElement arrival;
		
		@FindBy(xpath = "//p[.='Bangalore, IN - Kempegowda International Airport (BLR)']")
		  WebElement bangalore;
		
		@FindBy(xpath = "//div[@class='sc-aXZVg dSvAMK mr-2 mt-1']")
           WebElement calanderslct;
		
		@FindBy(xpath = "((//div[@class='DayPicker-Body']/child::div[@class='DayPicker-Week'])[9])/following::div[21]")     
		  WebElement dateslct;
		
		@FindBy(xpath = "(//div[@class='sc-aXZVg ibgoAF'])[4]")
		  WebElement searchflight;
		
		
		
		
		@FindBy(xpath = "//h1[.='Search flights']")
		  WebElement srchmsg;
		
		@FindBy(xpath = "(//button/child::div)[2]")
		  WebElement asrtsearch;
		
		@FindBy(xpath = "(//button/child::div)[3]")
		  WebElement asrtbook;
		
	//step- 2 - Create separate methods for each component to perform action

		
		public void JprTOBlr(WebDriver driver) throws InterruptedException {
			
			wait.until(ExpectedConditions.visibilityOf(srchmsg));
			               // Assertion 1
			  Assert.assertEquals(srchmsg.getText(), "Search flights");  
			         
			                String srchmsg1= srchmsg.getText();
			                        System.out.println("Assertion Message-> " + srchmsg1);

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
			       
			Thread.sleep(6000);
		    driver.navigate().back();
		}
		
		
		
		@FindBy(xpath = "(//div/following::input)[1]")
		   WebElement depart1;
		
		@FindBy(xpath = "//p[.='New Delhi, IN - Indira Gandhi Airport (DEL)']")
		  WebElement delhi;
		
		@FindBy(xpath = "(//div/following::input)[2]")
		   WebElement arrival1;
		
		@FindBy(xpath = "//p[.='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']")
		  WebElement mumbai;
		
		
       public void DelTOBom(WebDriver driver) throws InterruptedException {
			
			wait.until(ExpectedConditions.visibilityOf(depart1));
			depart1.sendKeys("Delhi");
			
			wait.until(ExpectedConditions.visibilityOf(delhi));
			delhi.click();
			
			wait.until(ExpectedConditions.visibilityOf(arrival1));
			arrival1.sendKeys(Keys.CONTROL+"a" + "Mumbai");
			
			wait.until(ExpectedConditions.visibilityOf(mumbai));
			mumbai.click();
			
			
			wait.until(ExpectedConditions.visibilityOf(searchflight));
			searchflight.click();
			       
			
			           // Assertion 4
			Assert.assertTrue(asrtsearch.isDisplayed());
	           
			           // Assertion 5
			wait.until(ExpectedConditions.visibilityOf(asrtbook));
			Assert.assertTrue(asrtbook.isDisplayed()); 
		}
       
       
       
       
       /*
       @FindBy(xpath = "(//div/following::input)[1]")
	   WebElement depart2;
       
       @FindBy(xpath = "//p[.='Hyderabad, IN - Rajiv Gandhi International (HYD)']")
		  WebElement hyderabad;
       
       @FindBy(xpath = "(//div/following::input[@class='w-100p fs-16 fw-500 '])[2]")
	   WebElement arrival2;
		
		@FindBy(xpath = "//p[.='Dubai, AE - Dubai International Airport (DXB)']")
		  WebElement dubai;
		
		
    public void HydTODxb() throws InterruptedException {
			
			wait.until(ExpectedConditions.visibilityOf(depart2));
			depart2.sendKeys("Hyderabad");
			
			wait.until(ExpectedConditions.visibilityOf(hyderabad));
			hyderabad.click();
			
			wait.until(ExpectedConditions.visibilityOf(arrival2));
			arrival2.sendKeys(Keys.CONTROL+"a"+"Dubai");
			
			wait.until(ExpectedConditions.visibilityOf(dubai));
			dubai.click();
			
			
			wait.until(ExpectedConditions.visibilityOf(searchflight));
			searchflight.click();
			       
			
		}
           */

		

		// step- 3 - Initializing the elements using PageFactory class inside the
		// constructor

		public Airline_MultiCityFlight_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
}
