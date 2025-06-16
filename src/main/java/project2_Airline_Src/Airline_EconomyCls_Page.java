package project2_Airline_Src;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Airline_EconomyCls_Page {                                             // For TC6

	WebDriver driver;
	
	 WebDriverWait  wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	 
	// step- 1 - Locate each component using @FindBy Annotation

	     @FindBy(xpath = "(//div/child::span)[4]")
	       WebElement slctcls;
	     
	    @FindBy(xpath = "(//div/child::p)[18]")
	      WebElement economycls;
	    
		@FindBy(xpath = "(//input[@class='w-100p fs-16 fw-500 c-neutral-900'])[1]")
		   WebElement depart;
		
		@FindBy(xpath = "//p[.='New Delhi, IN - Indira Gandhi Airport (DEL)']")
		  WebElement dairportslct;

		@FindBy(xpath = "//input[@class='w-100p fs-16 fw-500 c-neutral-900']")
		   WebElement arrival;
		
		@FindBy(xpath = "//p[.='London, GB - Heathrow (LHR)']")
		  WebElement aairportslct;
		
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

		public void EconomyCls_FLight(WebDriver driver) throws InterruptedException {
	
			
                       // Assertion 1
		     wait.until(ExpectedConditions.visibilityOf(srchmsg));
                 Assert.assertEquals(srchmsg.getText(), "Search flights");  
      
                            String srchmsg1= srchmsg.getText();
	                        System.out.println("Assertion Message-> " + srchmsg1);
			
			wait.until(ExpectedConditions.visibilityOf(slctcls));
			slctcls.click();
			
			wait.until(ExpectedConditions.visibilityOf(economycls));
			economycls.click();


			
			wait.until(ExpectedConditions.visibilityOf(depart));
			depart.sendKeys("Delhi");
			
			wait.until(ExpectedConditions.visibilityOf(dairportslct));
			dairportslct.click();
			
			wait.until(ExpectedConditions.visibilityOf(arrival));
			arrival.sendKeys("London");
			

			
			wait.until(ExpectedConditions.visibilityOf(aairportslct));
			aairportslct.click();
			
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
			       
			Thread.sleep(8000);
			    driver.navigate().back();

		}
		
		

		// step- 3 - Initializing the elements using PageFactory class inside the
		// constructor

		public Airline_EconomyCls_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
}
