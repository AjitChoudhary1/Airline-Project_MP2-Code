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

public class Amazon_PaymentMethodPage                   //For TC12
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

		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
		  WebElement paymentmethod1;

		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
		  WebElement paymentmethod2;

		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
		  WebElement paymentmethod3;

		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
		  WebElement paymentmethod4;

		@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
		  WebElement paymentmethod5;


		/*@FindBy(xpath="//a[@class='a-link-normal attach-close-button']")
		   WebElement closemark;
           */

		@FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
		  List<WebElement> allproduct;

		@FindBy(xpath="//span[@class='a-text-bold']")
		  WebElement name;

		@FindBy(xpath="(//h2[@class='a-size-medium a-spacing-none a-text-bold'])[5]")
		  WebElement reviewmsg;


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

		public void AllPaymentMethods(WebDriver driver)
		{
			 // Assertion 2
			s1.assertEquals(name.getText(), "Ajit Choudhary");

            String namemsg1= name.getText();
                    System.out.println(namemsg1);

	    	 wait.until(ExpectedConditions.visibilityOf(dlvraddress));
			  dlvraddress.click();


	    	 wait.until(ExpectedConditions.visibilityOf(paymentmethod1));
			paymentmethod1.click();

			         // Assertion 3
			s1.assertEquals(reviewmsg.getText(), "Review items and shipping");

            String reviewmsg1= reviewmsg.getText();
                    System.out.println(reviewmsg1);

			driver.navigate().refresh();

	    	 wait.until(ExpectedConditions.visibilityOf(paymentmethod2));
			paymentmethod2.click();
			driver.navigate().refresh();

	    	 wait.until(ExpectedConditions.visibilityOf(paymentmethod3));
			paymentmethod3.click();
			driver.navigate().refresh();

	    	 wait.until(ExpectedConditions.visibilityOf(paymentmethod5));
			paymentmethod5.click();
			//driver.navigate().refresh();

			     //System.out.println("Title is-> " +driver.getTitle());

			s1.assertAll("All assertion not passed");

		}



		//step-3 Initialize element by PageFactory class inside constructor

		public Amazon_PaymentMethodPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
