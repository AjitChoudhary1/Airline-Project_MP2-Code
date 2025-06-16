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

public class Airline_ApplyCode_Page {                                             // For TC13

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
		
		@FindBy(xpath = "//p[.='Bangalore, IN - Kempegowda International Airport (BLR)']")
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

		public void SearchFlight() {
			
			
			        // Assertion 1
            wait.until(ExpectedConditions.visibilityOf(srchmsg));
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

		
		
		
		@FindBy(xpath = "(//div/following::div[@class='sc-aXZVg fvpVSy'])[1]")
		  WebElement applycoupon;
		
		
		
		@FindBy(xpath = "(//p[.='Remove'])[1]")
		  WebElement asrtapplyremove;
		
		public void ApplyCode()
		{
			wait.until(ExpectedConditions.visibilityOf(applycoupon));
			applycoupon.click();
			
			
			
			
			          // Assertion 4
			wait.until(ExpectedConditions.visibilityOf(asrtapplyremove));
                    Assert.assertEquals(asrtapplyremove.getText(), "Remove");  

                 String removemsg1= asrtapplyremove.getText();
                      System.out.println("Assertion Message-> " + removemsg1);
			
		}

		// step- 3 - Initializing the elements using PageFactory class inside the
		// constructor

		public Airline_ApplyCode_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
}
