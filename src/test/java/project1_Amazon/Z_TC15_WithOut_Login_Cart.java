package project1_Amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_ProductPage4;

@Listeners(Amazon_ITestListener.class)
public class Z_TC15_WithOut_Login_Cart extends AmazonPr_BaseClass
{
	 @Test (retryAnalyzer=Amazon_RetryAnalyzer.class)
	   public void ReachTillTC15_Cart_WithoutLoginAmazon()
	   {
		 
		  // 15 Reach till cart page without login in amazon application
		   
			Reporter_Manager.test = Reporter_Manager.extent.createTest("ReachTillTC15_Cart_WithoutLoginAmazon");

		   System.out.println("Title is-> " + driver.getTitle());
		   
		          
	       Amazon_ProductPage4 cart= new Amazon_ProductPage4(driver);
	              cart.SearchProduct();
			                   Reporter_Manager.test.info("HoverOver is done");

	              cart.FirstProdClick();
                              Reporter_Manager.test.info("Product search is done");

	              cart.ControlChild(driver);
                              Reporter_Manager.test.info("Control to the child window");

	              cart.CartOpen();
		   
		   
	              
	 	 		                Reporter_Manager.test.pass("TestCase is Succesfull");

		   
	   }
     
	   
}
