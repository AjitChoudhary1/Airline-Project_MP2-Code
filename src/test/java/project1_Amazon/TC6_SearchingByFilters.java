package project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import project1_Amazon_Src.Amazon_HomePage;
import project1_Amazon_Src.Amazon_LoginPage;
import project1_Amazon_Src.Amazon_SearchPage;
import project1_Amazon_Src.Excel_DataFetching;

@Listeners(Amazon_ITestListener.class)
public class TC6_SearchingByFilters extends AmazonPr_BaseClass
{
	 @Test (retryAnalyzer=Amazon_RetryAnalyzer.class)
	   public void SearchProductTC6_FilterAmazon() throws EncryptedDocumentException, IOException
	   {

		 // 6 Verify that searching with filters (e.g., category, price range) fields accurate results.

			Reporter_Manager.test = Reporter_Manager.extent.createTest("SearchProductTC6_FilterAmazon");

		   SoftAssert s1= new SoftAssert();

		   System.out.println("Title is-> " + driver.getTitle());

		   Excel_DataFetching d1=new Excel_DataFetching();
	          d1.LoginData();

	        Amazon_HomePage hp= new Amazon_HomePage(driver);
	               hp.HoverOver(driver);
			                 Reporter_Manager.test.info("HoverOver is done");

	               hp.Signin();


	        Amazon_LoginPage lp= new Amazon_LoginPage(driver);
	                lp.Un();
		 			          Reporter_Manager.test.info("Email id is entered");

	                lp.ContinueButton();
	                lp.Pwd();
		 			          Reporter_Manager.test.info("Password is entered");

	                lp.SigninPress();


	       Amazon_SearchPage sp= new Amazon_SearchPage(driver);
	                sp.SearchProduct();
	 			                Reporter_Manager.test.info("Product search done");

	                sp.CheckBoxClick();
	                sp.PriceClick();
	                sp.SizeClick();
	                sp.RatingClick();
	               // sp.Validation_Success();

		 	 		             Reporter_Manager.test.pass("TestCase is Succesfull");



	                String title=driver.getTitle();

	        		System.out.println(title);
	        		//System.out.println(fp.validation_success());



	        		             //Assertion 1

	        		s1.assertEquals(driver.getTitle(),"Amazon.in: Shoe - 256097 / "+ sp.Validation_Success()
	        		 +" / 8: Shoes & Handbags");

	        		//Amazon.in: Shoe - 256097 / ₹2,000 - ₹2,900 / 4 Stars & Up / 8: Shoes & Handbags



		           s1.assertAll("Assertion Is Got Failed");
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
