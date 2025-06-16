package project1_Amazon_Src;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Amazon_HomePage                           // TC5 n Almost for all TCs
{
	WebDriver driver;
	
    SoftAssert s1= new SoftAssert();
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

	//step-1 Locate component
	
	@FindBy(xpath="//div[@class='nav-div'][2]")
	   WebElement accountlist;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	   WebElement signinclick;
	
	@FindBy(id="twotabsearchtextbox")
	   WebElement search;
	
	@FindBy(xpath="//h1[@class='a-size-medium-plus a-spacing-small']")
	  WebElement signinmsg;
	
	
	//step-2 Separate method for each component
	

	public void HoverOver(WebDriver driver)
	{
   	     wait.until(ExpectedConditions.visibilityOf(accountlist));
		   Actions a1= new Actions(driver);
            a1.moveToElement(accountlist).perform();
	}
	
	public void Signin()
	{
   	     wait.until(ExpectedConditions.visibilityOf(signinclick));
		  signinclick.click();
		  
		                 // Assertion 1
		  s1.assertEquals(signinmsg.getText(), "Sign in or create account");  
		         
		                String signinmsg1= signinmsg.getText();
		                        System.out.println(signinmsg1);
	}
	
	public void SearchProduct()
	{
   	       wait.until(ExpectedConditions.visibilityOf(search));
		     search.sendKeys("Abstract Shirt" + Keys.ENTER);
		     
		               // Assertion 2
		     //s1.assertEquals(driver.getTitle(), "Amazon.in : Abstract Shirt");
		     
		              //System.out.println("Title is-> " + driver.getTitle());
 		              
   	        s1.assertAll("All Assertion Not Passed");
   	 
	}
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
