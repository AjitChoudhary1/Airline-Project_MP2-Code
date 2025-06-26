package project1_Amazon_Src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Amazon_LoginPage extends Excel_DataFetching                             // For all TCs
{
	WebDriver driver;

    SoftAssert s1= new SoftAssert();

	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

	// step- 1 - Locate each component using @FindBy Annotation

	        @FindBy(name="email")
               WebElement username;

            @FindBy(id="continue")
              WebElement continuebutton;

            @FindBy(id="ap_password")
                WebElement password;

            @FindBy(id="signInSubmit")
               WebElement signinbutton;

            @FindBy(xpath="//h1[@class='a-size-medium-plus a-spacing-small']")
              WebElement signinmsg;

            @FindBy(xpath="(//span[@class='nav-line-1 nav-progressive-content'])[2]")
              WebElement helloajit;

            @FindBy(xpath="(//div[@class='a-alert-content'])[1]")
	          WebElement pwdincrctmsg;

  // step- 2 - Create separate methods for each component to perform action


	     public void Un()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(username));
	    	 username.sendKeys(un1);                                                     //                                                                                                                                                                                "8290654399"

	    	              // Assertion 1
			  s1.assertEquals(signinmsg.getText(), "Sign in or create account");

			                String signinmsg1= signinmsg.getText();
			                        System.out.println(signinmsg1);

		 }

	     public void UnTC3()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(username));
	    	 username.sendKeys(un2);                                                     //                                                                                                                                                                                "8290654399"

	    	              // Assertion 2
			  s1.assertEquals(signinmsg.getText(), "Sign in or create account");

			                String signinmsg1= signinmsg.getText();
			                        System.out.println(signinmsg1);

		 }

	     public void UnTC14()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(username));
	    	 username.sendKeys(un3);                                                     //                                                                                                                                                                                "8290654399"

	    	              // Assertion 2
			  s1.assertEquals(signinmsg.getText(), "Sign in or create account");

			                String signinmsg1= signinmsg.getText();
			                        System.out.println(signinmsg1);

		 }

	     public void ContinueButton()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(continuebutton));
	    	 continuebutton.click();
	     }

	     public void Pwd()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(password));
	    	 password.sendKeys(pwd1);                                                      //                                                                                                                                                                              ("Aj@8031");
	     }

	     public void PwdTC3()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(password));
	    	 password.sendKeys(pwd2);                                                      //                                                                                                                                                                              ("Aj@8031");
	     }

	     public void PwdTC14()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(password));
	    	 password.sendKeys(pwd3);                                                      //                                                                                                                                                                              ("Aj@8031");
	     }


	     public void SigninPress()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(signinbutton));
	    	 signinbutton.click();
	    	// s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");


	    	                // Assertion 3
			  s1.assertEquals(helloajit.getText(), "Hello, AjitRupa");

	          String name= helloajit.getText();
	                   System.out.println(name);

			             // System.out.println("Title is-> " + driver.getTitle());

	     }

	     public void SigninPressTC3()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(signinbutton));
	    	 signinbutton.click();
	    	// s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");


	    	                 // Assertion 4
			  s1.assertEquals(pwdincrctmsg.getText(), "Your password is incorrect");

			                String pwdincrctmsg1= pwdincrctmsg.getText();
			                        System.out.println(pwdincrctmsg1);

			        			   // System.out.println("Title is-> " + driver.getTitle());

	     }

	     public void SigninPressTC14()
	     {
	    	 wait.until(ExpectedConditions.visibilityOf(signinbutton));
	    	 signinbutton.click();
	    	// s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");


	    	                // Assertion 5
			  s1.assertEquals(helloajit.getText(), "Hello, Ajit");

	          String name= helloajit.getText();
	                   System.out.println(name);

			             // System.out.println("Title is-> " + driver.getTitle());

	    	         s1.assertAll("All Assertion Not Passed");

	     }

  // step- 3 - Initializing the elements using PageFactory class inside the constructor

	     public Amazon_LoginPage(WebDriver driver)
	     {
	    	 PageFactory.initElements(driver, this);
	     }


}
