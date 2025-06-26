package project1_Amazon_Src;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Amazon_BuyCheckOutPage                   //For TC11 and TC13
{
	   WebDriver driver;

		SoftAssert s1= new SoftAssert();

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

		//step-1 Locate component

	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;

	   @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[1]")
		WebElement clickfirstprod;


		@FindBy(id="buy-now-button")
		   WebElement buynow;

		@FindBy(xpath="//span[@id='checkout-primary-continue-button-id']")
		  WebElement dlvraddress;

		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[6]")
		  WebElement paymentmethod;

		@FindBy(xpath="//span[@id='checkout-primary-continue-button-id']")
		  WebElement usethispay;

		@FindBy(xpath="//input[@placeholder='Enter Code']")
		  WebElement entercode;

		@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")
		  WebElement applyclick;


		/*@FindBy(xpath="//a[@class='a-link-normal attach-close-button']")
		   WebElement closemark;
           */

		@FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
		  List<WebElement> allproduct;

		@FindBy(xpath="(//h2[@class='a-size-medium a-spacing-none a-text-bold'])[2]")
		  WebElement dlvrymsg;

		@FindBy(xpath="(//h2[@class='a-size-medium a-spacing-none a-text-bold'])[5]")
		  WebElement reviewmsg;

		@FindBy(xpath="//h2[@id='deliver-to-customer-text']")
		  WebElement toajit;

		@FindBy(xpath="//span[@class='a-text-bold']")
		  WebElement name;

		@FindBy(xpath="(//div[@class='a-alert-content'])[3]")
		 WebElement promocode;

		//step-2 Separate method for each component


		public void SearchProduct()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(searchproduct));
			searchproduct.sendKeys("Abstract Shirt" + Keys.ENTER);

			          //Assertion 1
			   s1.assertEquals(allproduct.size()>15, true);
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

		public void CheckOut()
		{
			 // Assertion 2
			s1.assertEquals(name.getText(), "Ajit Choudhary");

            String namemsg1= name.getText();
                    System.out.println(namemsg1);

	    	 wait.until(ExpectedConditions.visibilityOf(dlvraddress));
			dlvraddress.click();

			                    // Assertion 2
						s1.assertEquals(dlvrymsg.getText(), "Select a delivery address");

			            String dlvrymsg1= dlvrymsg.getText();
			                    System.out.println(dlvrymsg1);

	    	 wait.until(ExpectedConditions.visibilityOf(paymentmethod));
			paymentmethod.click();

			                           // Assertion 3
						s1.assertEquals(reviewmsg.getText(), "Review items and shipping");

			            String reviewmsg1= reviewmsg.getText();
			                    System.out.println(reviewmsg1);

	    	 wait.until(ExpectedConditions.visibilityOf(usethispay));
			usethispay.click();

                             // Assertion 4
					s1.assertEquals(toajit.getText(), "Delivering to Ajit Choudhary");

		            String toajitmsg1= toajit.getText();
		                    System.out.println(toajitmsg1);
		}

		public void ApplyCode()
		{
			 // Assertion 2
			s1.assertEquals(name.getText(), "Ajit Choudhary");

            String namemsg1= name.getText();
                    System.out.println(namemsg1);

			wait.until(ExpectedConditions.visibilityOf(dlvraddress));
			dlvraddress.click();



	    	 wait.until(ExpectedConditions.visibilityOf(entercode));
			entercode.sendKeys("5th7u85amz");



	    	 wait.until(ExpectedConditions.visibilityOf(applyclick));
			applyclick.click();

			                // Assertion 3
						s1.assertEquals(promocode.getText(), "");

			            String promomsg1= promocode.getText();
			                    System.out.println(promomsg1);

			 //System.out.println("Title is-> " +driver.getTitle());

			s1.assertAll("All assertion not passed");
		}


		//step-3 Initialize element by PageFactory class inside constructor

		public Amazon_BuyCheckOutPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
