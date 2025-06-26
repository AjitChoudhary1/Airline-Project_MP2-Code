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

public class Amazon_ProductPage1               // For TC7, and TC9
{
	   WebDriver driver;

		SoftAssert s1= new SoftAssert();

	   WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));

		//step-1 Locate component

	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;

	   @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[1]")
		WebElement clickfirstprod;

		@FindBy(xpath = "(//span[@class='a-price-whole'][1])[1]")
		WebElement pricedisplay;

		@FindBy(xpath = "(//h3[@class='product-facts-title'])[1]")
		WebElement productdetailsdisplay;

		@FindBy(name="submit.add-to-cart")
		   WebElement addtocart;

		/*@FindBy(xpath="//a[@class='a-link-normal attach-close-button']")
		   WebElement closemark;
           */

		@FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
		  List<WebElement> allproduct;

		@FindBy(xpath="//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
		  WebElement addtocartmsg;

		@FindBy(xpath="//input[@title='Buy Now']")
		  WebElement buynowmsg;


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

			       // Assertion 2
					s1.assertEquals(buynowmsg.getText(), "Added to cart");

		            String buynowmsg1= buynowmsg.getText();
		                    System.out.println(buynowmsg1);

			    	 wait.until(ExpectedConditions.visibilityOf(addtocart));
			       addtocart.click();
			      // closemark.click();

			                    // Assertion 3
					  s1.assertEquals(addtocartmsg.getText(), "Added to cart");

					                String addtocartmsg1= addtocartmsg.getText();
					                        System.out.println(addtocartmsg1);
		}

		public void DetailsDisplays(WebDriver driver)
		{
	    	 wait.until(ExpectedConditions.visibilityOf(pricedisplay));
			 pricedisplay.isDisplayed();
			  System.out.println("Child W Title-> " + driver.getTitle());
			  System.out.println("The Url is-> " + driver.getCurrentUrl());

		    	 wait.until(ExpectedConditions.visibilityOf(productdetailsdisplay));
			productdetailsdisplay.isDisplayed();
			 // System.out.println("Child WPage Source-> " + driver.getPageSource());


                   //System.out.println("Title is-> " + driver.getTitle());

	    	         s1.assertAll("All Assertion Not Passed");

		}


		//step-3 Initialize element by PageFactory class inside constructor

		public Amazon_ProductPage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
