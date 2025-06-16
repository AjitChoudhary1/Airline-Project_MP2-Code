package project1_Amazon_Src;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Amazon_ProfilePage                        //For TC4
{
	WebDriver driver;
	
	SoftAssert s1= new SoftAssert();
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//step-1 Locate component
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[8]")
	   WebElement youraccount;
	
	@FindBy(xpath="(//span[@class='a-color-secondary'])[2]")
	   WebElement editprofile;
	
	@FindBy(xpath="(//a[.='Edit'])[1]")
	   WebElement clickedit;
	
	@FindBy(id="ap_customer_name")
	  WebElement controlA;
	
	@FindBy(id="ap_customer_name")
	  WebElement newname;
	
	@FindBy(id="cnep_1C_submit_button")
	  WebElement savechanges;
	
	@FindBy(xpath="(//div[@class='a-alert-content'])[1]")
	  WebElement namesvdmsg;
	
	//step-2 Separate method for each component
	
	
	public void YourAccount()
	{
   	 wait.until(ExpectedConditions.visibilityOf(youraccount));
		youraccount.click();
	}
	
	public void EditProfile()
	{
   	 wait.until(ExpectedConditions.visibilityOf(editprofile));
		editprofile.click();
		
   	 wait.until(ExpectedConditions.visibilityOf(clickedit));
		clickedit.click();
		
   	 wait.until(ExpectedConditions.visibilityOf(controlA));
		controlA.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		
   	 wait.until(ExpectedConditions.visibilityOf(newname));
		newname.sendKeys("AjitRupa Choudhary");
		
   	 wait.until(ExpectedConditions.visibilityOf(savechanges));
		savechanges.click();
		
		           // Assertion 1        
		  s1.assertEquals(namesvdmsg.getText(), "Name updated.");  
		         
		                String namesvdmsg1= namesvdmsg.getText();
		                        System.out.println(namesvdmsg1);
		                        
		                      //  System.out.println("Title is-> " +driver.getTitle());
		                        
		               	        s1.assertAll("All Assertion Not Passed");
	}
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
