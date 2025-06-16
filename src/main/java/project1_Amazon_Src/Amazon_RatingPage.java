package project1_Amazon_Src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Amazon_RatingPage                        //For TC14
{
	WebDriver driver;
	
	SoftAssert s1= new SoftAssert();
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	// step- 1 - Locate each component using @FindBy Annotation

	@FindBy(xpath="(//a[@class='nav-link nav-item'])[9]")
	   WebElement yourorder;
	
	@FindBy(xpath="//option[@value='year-2024']")
	   WebElement slctyear;
	
	@FindBy(xpath="//a[@id='a-autoid-5-announce']")
	  WebElement reviewclick;
	
	@FindBy(xpath="(//span[@class='in-context-ryp__form-field--starRating-single'])[5]")
	  WebElement star5;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	  WebElement submit;
	
	
	//step-2 Separate method for each component
	
	
	public void Rating()
	{
   	 wait.until(ExpectedConditions.visibilityOf(yourorder));
		yourorder.click();
		
   	 wait.until(ExpectedConditions.visibilityOf(slctyear));
		slctyear.click();
		
   	 wait.until(ExpectedConditions.visibilityOf(reviewclick));
		reviewclick.click();
		
   	 wait.until(ExpectedConditions.visibilityOf(star5));
		star5.click();
		
   	 //wait.until(ExpectedConditions.visibilityOf(submit));
		//submit.click();
		
		 //System.out.println("Title is-> " +driver.getTitle());
		 
		 s1.assertAll("All assertion not passed");
	}
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_RatingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
