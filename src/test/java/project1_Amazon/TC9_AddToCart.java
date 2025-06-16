package project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_HomePage;
import project1_Amazon_Src.Amazon_LoginPage;
import project1_Amazon_Src.Amazon_ProductPage1;
import project1_Amazon_Src.Excel_DataFetching;

@Listeners(Amazon_ITestListener.class)
public class TC9_AddToCart extends AmazonPr_BaseClass 
{
	 @Test (retryAnalyzer=Amazon_RetryAnalyzer.class)
	   public void ProductTC9_AddToCartAmazon() throws EncryptedDocumentException, IOException
	   {
		 
		    // 9 Verify that items can be added to the shopping cart from product pages.
		   
			Reporter_Manager.test = Reporter_Manager.extent.createTest("ProductTC9_AddToCartAmazon");

		   System.out.println("Title is-> " + driver.getTitle());
		   
		   Excel_DataFetching d1=new Excel_DataFetching();
	          d1.LoginData();
         
	        Amazon_HomePage hp= new Amazon_HomePage(driver);
	               hp.HoverOver(driver);
			                   Reporter_Manager.test.info("HoverOver is done");

	               hp.Signin();
	   
	        Amazon_LoginPage lp= new Amazon_LoginPage(driver);
	                lp.Un();
	                           Reporter_Manager.test.info("Username is entered");

	                lp.ContinueButton();
	                lp.Pwd();
	                          Reporter_Manager.test.info("Password is entered");

	                lp.SigninPress();
		   
	       Amazon_ProductPage1 pp= new Amazon_ProductPage1(driver);
	                  pp.SearchProduct();
	                          Reporter_Manager.test.info("Product search is done");

	                  pp.FirstProdClick();
	                  pp.ControlChild(driver);
	                           Reporter_Manager.test.info("Control given to the child window");

		   
		   
		   
	                  
		 	 		          Reporter_Manager.test.pass("TestCase is Succesfull");

	   }
     
	   
	   
}











































	 
/*	   
	   @DataProvider
	     public Object [][] UnPwdExcel() throws EncryptedDocumentException, IOException
	     {
	    	 Object [][] unpwd= new Object[1] [2];
			 
			   FileInputStream f1= new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\Excel Sheet\\Login Details.xlsx");
			       
			        Workbook w1=  WorkbookFactory.create(f1);			           
			        
			        
			        String un1 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(0).getCell(0).getNumericCellValue());
			        String pwd1 = w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
			        
				    unpwd[0][0]=un1;
				    unpwd[0][1]=pwd1;
	    	 
			return unpwd;
		
	     }
	
*/
