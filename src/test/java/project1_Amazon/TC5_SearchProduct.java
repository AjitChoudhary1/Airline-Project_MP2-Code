package project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project1_Amazon_Src.Amazon_HomePage;
import project1_Amazon_Src.Amazon_LoginPage;
import project1_Amazon_Src.Excel_DataFetching;

@Listeners(Amazon_ITestListener.class)
public class TC5_SearchProduct extends AmazonPr_BaseClass 
{
	 @Test (retryAnalyzer=Amazon_RetryAnalyzer.class)
	   public void SearchProductTC5_Amazon() throws EncryptedDocumentException, IOException
	   {
		 
		  // 5 Test searching for products using its name like shoe
		 
			Reporter_Manager.test = Reporter_Manager.extent.createTest("SearchProductTC5_Amazon");
			
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
		   
		          
		         hp.SearchProduct();
	 			              Reporter_Manager.test.info("Product search done");

	 			              
		   
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
