package project1_Amazon_Src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Amazon_LogoutPage                    // All the TCs
{
      WebDriver driver;
      
  	SoftAssert s1= new SoftAssert();
         
       WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

	//step-1 Locate component
	
	@FindBy(xpath="//div[@class='nav-div'][2]")
	WebElement helloajit;
	
	@FindBy(linkText="Sign Out")
	WebElement signoutclick;
	
	@FindBy(xpath="//h1[@class='a-size-medium-plus a-spacing-small']")
	  WebElement signinmsg;
	
	//step-2 Separate method for each component
	
	
	public void HoverOverHelloAjit(WebDriver driver)
	{
   	 wait.until(ExpectedConditions.visibilityOf(helloajit));
		Actions a1= new Actions(driver);
        a1.moveToElement(helloajit).perform();
	}
	
	public void SignOutPressChildW()
	{
   	 wait.until(ExpectedConditions.visibilityOf(signoutclick));
		signoutclick.click();
		
		         // Assertion 1
		  s1.assertEquals(signinmsg.getText(), "Sign in or create account");  
		         
		                String signinmsg1= signinmsg.getText();
		                        System.out.println(signinmsg1);
		                        
		                      //  System.out.println("Title is-> " + driver.getTitle());
		   		              
		               	        s1.assertAll("All Assertion Not Passed");
	}
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
