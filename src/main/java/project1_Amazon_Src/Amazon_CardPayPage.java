package project1_Amazon_Src;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_CardPayPage                   //For TC16
{
	   WebDriver driver;
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

		//step-1 Locate component
		
	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;
	   
	   @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[1]")
		WebElement clickfirstprod;
		
		
		@FindBy(id="buy-now-button")
		   WebElement buynow;
		
		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")         
		  WebElement cardpayment;
		
		@FindBy(xpath="//a[.='Add a new credit or debit card']")         
		  WebElement addnewcard;
		
		@FindBy(xpath="//input[@class='a-input-text a-form-normal pmts-account-Number']")
		  WebElement cardnumber;
		
		@FindBy(name="ApxSecureIframe")
		  WebElement iframecomponent;
		
		
		@FindBy(name="ppw-expirationDate_month") //select[@name='ppw-expirationDate_month']
		  WebElement expirydate;
		
		@FindBy(xpath="(//li[@class=\"a-dropdown-item\"])[8]")
		  WebElement dateclick;
		
		@FindBy(name="ppw-expirationDate_year")
		  WebElement expiryyear;
		
		@FindBy(xpath="(//li[@class=\"a-dropdown-item\"])[18]")
		  WebElement yearclick;
		
		//step-2 Separate method for each component
		
		public void SearchProduct()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(searchproduct));
			searchproduct.sendKeys("Abstract Shirt" + Keys.ENTER);
		}
		public void FirstProdClick() 
		{
	    	 wait.until(ExpectedConditions.visibilityOf(clickfirstprod));
			clickfirstprod.click();
		}
		
		public void ControlChild(WebDriver driver)
		{
			Set<String> pcid= driver.getWindowHandles();
			  Iterator<String> ids= pcid.iterator();
			     
			 
				String parentid= ids.next();
			    String childid= ids.next();
			    
			       driver.switchTo().window(parentid);
			       driver.switchTo().window(childid);
			       
			    	 wait.until(ExpectedConditions.visibilityOf(buynow));
			       buynow.click();
			       
			       System.out.println("Child W Title-> " + driver.getTitle());
			       System.out.println("The Url is-> " + driver.getCurrentUrl());
		}
		
		
		public void AllPaymentMethods(WebDriver driver)
		{
	    	 wait.until(ExpectedConditions.visibilityOf(cardpayment));
			cardpayment.click();
			
	    	 wait.until(ExpectedConditions.visibilityOf(addnewcard));
			addnewcard.click();
		}
		
		public void Movingtoiframe(WebDriver driver)
		{
	    	 wait.until(ExpectedConditions.visibilityOf(iframecomponent));
			driver.switchTo().frame(iframecomponent);
		}
		
		public void CardDetails()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(cardnumber));
			cardnumber.sendKeys("8526896341257896");
		}
		
		public void ExpiryDate(WebDriver driver)
		{
	    	 wait.until(ExpectedConditions.visibilityOf(expirydate));
			Select s1= new Select(expirydate);
			s1.selectByVisibleText("08");
			
	    	 wait.until(ExpectedConditions.visibilityOf(dateclick));
			dateclick.click();
			
	    	 wait.until(ExpectedConditions.visibilityOf(expiryyear));
			Select s2= new Select(expiryyear);
			s2.selectByVisibleText("2030");
			
	    	 wait.until(ExpectedConditions.visibilityOf(yearclick));
			yearclick.click();
		}
		

		
		//step-3 Initialize element by PageFactory class inside constructor
		
		public Amazon_CardPayPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
