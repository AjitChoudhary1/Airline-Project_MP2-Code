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

public class Amazon_ProductPage2             // For TC8
{
	   WebDriver driver;
	   
	   SoftAssert s1= new SoftAssert();
	   
	   WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//step-1 Locate component
		
	   @FindBy(id="twotabsearchtextbox")
	       WebElement searchproduct;
	   
	  // @FindBy(xpath="//span[@id='a-autoid-0-announce']")
	     @FindBy(xpath="//span[@class='a-dropdown-container']")
		WebElement sortby_featured;

	   @FindBy(xpath="(//li[@class='a-dropdown-item'])[2]")
		WebElement lowtohigh;
	   
	   @FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
	     List<WebElement> allproduct;
	   
	  /* @FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
	     List<WebElement> allproduct1;
       */
		
	   
		//step-2 Separate method for each component
		
	   
		public void SearchProduct()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(searchproduct));
			searchproduct.sendKeys("Shoe" + Keys.ENTER);
			
			            //Assertion 1			   
			   s1.assertEquals(allproduct.size()>15, true);
		}
		public void SortByFeatured()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(sortby_featured));
			sortby_featured.click();
		}
		public void sortbyLowToHigh()
		{
	    	 wait.until(ExpectedConditions.visibilityOf(lowtohigh));
			lowtohigh.click();
			
			             //Assertion 2			   
			   s1.assertEquals(allproduct.size()>20, true);
			   
			//   System.out.println("Title is-> " + driver.getTitle());
			   
		       s1.assertAll("All Assertion Not Passed");
		}

		
		//step-3 Initialize element by PageFactory class inside constructor
		
		public Amazon_ProductPage2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		

}















	// ----Asseration-----//

	/*public boolean validation_success()
	 *  {
		
		boolean status=false;
		String s3 = lowpriceshoe.getText();
		System.out.println("low price after applying sortby: low to high price --->" +s3);

		int num1 = Integer.parseInt(s3);
		
		String s4 = lowrange.getDomAttribute("aria-valuetext");
		System.out.println("lower price at slider"+s4);
		
		int num2 = Integer.parseInt(s4);
		
		if(num1>=num2) 
		{
			status=true;
		}
		return status;

		
	}*/

