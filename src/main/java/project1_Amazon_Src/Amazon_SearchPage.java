package project1_Amazon_Src;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Amazon_SearchPage                                 //For TC6 and TC8
{
	   WebDriver driver;

		SoftAssert s1= new SoftAssert();

	   WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

		//step-1 Locate component

	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;

	   @FindBy(xpath = "//a[@aria-label=\"Apply the filter Puma to narrow results\"]")
		WebElement pumacheckbox;

		@FindBy(xpath = "((((//div[@id='priceRefinements']/ul)[1]/span/span)/li/span)/a)[2]")
		WebElement pricefilter;

		@FindBy(xpath = "//button[@value=\"8\"]")
		WebElement sizefilter;

		@FindBy(xpath = "(//div[@class='a-section'])[3]/a")
		WebElement rating4nup;

		@FindBy(xpath = "//input[@id=\"p_36/range-slider_slider-item_lower-bound-slider\"]")
		WebElement lowrange;


		@FindBy(xpath = "//input[@id=\"p_36/range-slider_slider-item_upper-bound-slider\"]")
		WebElement upperange;

		@FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
		  List<WebElement> allproduct;


		//step-2 Separate method for each component


		public void SearchProduct()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(searchproduct));
			searchproduct.sendKeys("Shoe" + Keys.ENTER);

			         //Assertion 1
			   s1.assertEquals(allproduct.size()>15, true);
		}

		public void CheckBoxClick()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(pumacheckbox));
			pumacheckbox.click();

			//s1.assertEquals(driver.getTitle(), "Amazon.in : shoe");

			       // System.out.println("Title is-> " + driver.getTitle());
		}

		public void PriceClick()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(pricefilter));
			pricefilter.click();

		}

		public void SizeClick()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(sizefilter));
			sizefilter.click();
		}

		public void RatingClick()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(rating4nup));
			rating4nup.click();

			   // System.out.println("Title is-> " + driver.getTitle());

			s1.assertAll("All Assertion not Passed");
		}

		public String Validation_Success()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(lowrange));
	    	 wait.until(ExpectedConditions.visibilityOf(upperange));

			String s3 = lowrange.getDomAttribute("aria-valuetext")+" - "+upperange.getDomAttribute("aria-valuetext");

			//String s3 = pricefilter.getText();
			System.out.println("price --->" + s3);
			return s3;
		}

		//step-3 Initialize element by PageFactory class inside constructor

		public Amazon_SearchPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
