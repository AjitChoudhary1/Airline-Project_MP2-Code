package project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_HomePage;
import project1_Amazon_Src.Amazon_LoginPage;
import project1_Amazon_Src.Amazon_LogoutPage;
import project1_Amazon_Src.Amazon_RatingPage;
import project1_Amazon_Src.Excel_DataFetching;

@Listeners(Amazon_ITestListener.class)
public class Y_TC14_StarRating extends AmazonPr_BaseClass
{
	 @Test (retryAnalyzer=Amazon_RetryAnalyzer.class)
	   public void Star5TC14_Rating_LastOrder_Amazon() throws EncryptedDocumentException, IOException
	   {

		  // 14 Go to orders page and click on your last ordered product and give 5 star ratings

			Reporter_Manager.test = Reporter_Manager.extent.createTest("Star5TC14_Rating_LastOrder_Amazon");

		   System.out.println("Title is-> " + driver.getTitle());

		   Excel_DataFetching d1=new Excel_DataFetching();
	          d1.LoginData();

	        Amazon_HomePage hp= new Amazon_HomePage(driver);
	               hp.HoverOver(driver);
			                   Reporter_Manager.test.info("HoverOver is done");

	               hp.Signin();

	        Amazon_LoginPage lp= new Amazon_LoginPage(driver);
	                lp.UnTC14();
                              Reporter_Manager.test.info("Username is entered");

	                lp.ContinueButton();
	                lp.PwdTC14();
                               Reporter_Manager.test.info("Password is entered");

	                lp.SigninPressTC14();

	                hp.HoverOver(driver);

	       Amazon_RatingPage rate= new Amazon_RatingPage(driver);
	                rate.Rating();

	      Amazon_LogoutPage lop= new Amazon_LogoutPage(driver);
	                lop.HoverOverHelloAjit(driver);
	                lop.SignOutPressChildW();
                               Reporter_Manager.test.info("Signout is done");





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


			        String un1 = NumberToTextConverter.toText(w1.getSheet("Login").getRow(4).getCell(0).getNumericCellValue());
			        String pwd1 = w1.getSheet("Login").getRow(4).getCell(1).getStringCellValue();

				    unpwd[0][0]=un1;
				    unpwd[0][1]=pwd1;

			return unpwd;

	     }

	*/
