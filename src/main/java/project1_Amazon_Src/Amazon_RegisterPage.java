package project1_Amazon_Src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_RegisterPage                            // For TC1
{
	WebDriver driver;
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	// step- 1 - Locate each component using @FindBy Annotation
	     
	@FindBy(xpath="//div[@class='nav-div'][2]") 
	   WebElement accountlist;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	   WebElement signinclick;
	
	     @FindBy(name="email")
	       WebElement username;
	     
	     @FindBy(id="continue")
	       WebElement continuebutton;
	     
	     @FindBy(xpath="//input[@class='a-button-input']")
	       WebElement proceedto;
	     
	     @FindBy(name="customerName")
	       WebElement yourname;
	     
	     @FindBy(name="password")
	       WebElement password;
	     
	     @FindBy(id="continue")
	       WebElement vrfymobilenmbr;
	     
	     
// step- 2 - Create separate methods for each component to perform action
	     
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
	 	}
	     
	     public void Un()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(username));
	    	 username.sendKeys                                                                                                                                                                                   ("8290654399");
	     }
	     
	     public void ProceedTo()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(proceedto));
	    	 proceedto.click();
	     }
	     
	     public void PressContinueButton()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(continuebutton));
	    	 continuebutton.click();
	    	 
	    	 
	     }
	     
	     public void NamePwdMobile()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(yourname));
	    	 yourname.sendKeys("Ajit Choudhary");
	    	 
	    	 wait.until(ExpectedConditions.visibilityOf(password));
	    	 password.sendKeys                                                                                                                                                                                         ("Aj@8031");
	    	 
	    	 wait.until(ExpectedConditions.visibilityOf(vrfymobilenmbr));
	    	 vrfymobilenmbr.click();
	     }
	     
	     
	     
	     
	  
 // step- 3 - Initializing the elements using PageFactory class inside the constructor
	     
	     public Amazon_RegisterPage(WebDriver driver)
	     {
	    	 PageFactory.initElements(driver, this);
	     }
	     
	     
}




















	/* If want to register account again then use these findsby and Methods
	     
         @FindBy(id="createAccount")
           WebElement createaccount;
     
         @FindBy(xpath="//i[@class='a-icon a-icon-checkbox']")
           WebElement checkbox;
     
         @FindBy(xpath="//input[@class='a-button-input']")
            WebElement createyracunt;
            
            
            
    /*  public void CreateYourAccount()
        {
        	     wait.until(ExpectedConditions.visibilityOf(createaccount));
                 createaccount.click();
                 
                 wait.until(ExpectedConditions.visibilityOf(checkbox));
    	          checkbox.click();
    	 
    	 	   wait.until(ExpectedConditions.visibilityOf(createyracunt));
    	        createyracunt.click();
    	 
        } 
	     
	     
	
	     
	     
	//input[@class='a-button-input']
	   //input[@type='submit']
	   //input[@aria-labelledby='intention-submit-button-announce']
        
	     */
