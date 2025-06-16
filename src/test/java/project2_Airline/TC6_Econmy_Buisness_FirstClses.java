package project2_Airline;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_Airline_Src.Airline_BusinessCls_Page;
import project2_Airline_Src.Airline_EconomyCls_Page;
import project2_Airline_Src.Airline_FirstCls_Page;
import project2_Airline_Src.Airline_HomePage;

@Listeners(Airline_ITestListener.class)
public class TC6_Econmy_Buisness_FirstClses extends Airline_BaseClass
{
	@Test (retryAnalyzer=Airline_RetryAnalyzer.class)
	public void SearchTC6_Ecnmy_Business_FirstClses() throws InterruptedException
	{
		
	        // 6 Validate search results for different classes (economy, business, first class).

		
		Reporter_Manager.test = Reporter_Manager.extent.createTest("SearchTC6_Ecnmy_Business_FirstClses");

		
	           System.out.println("Title is-> " + driver.getTitle());
	           
	           Airline_HomePage hp= new Airline_HomePage(driver);
                         hp.RemoveLogin(driver);
			                              Reporter_Manager.test.info("Removing is done");

                         
               Airline_EconomyCls_Page ecp= new Airline_EconomyCls_Page(driver);
                               ecp.EconomyCls_FLight(driver);
     			                            Reporter_Manager.test.info("Economy Class Search");

	       
                               
               Airline_BusinessCls_Page bcp= new Airline_BusinessCls_Page(driver);
                               bcp.BusinessCls_FLight(driver);
      			                             Reporter_Manager.test.info("Business Class Search");


	            
               Airline_FirstCls_Page fcp= new Airline_FirstCls_Page(driver);
                                fcp.FirstCls_FLight();
      			                               Reporter_Manager.test.info("First Class Search");


	        
		 	 		                      Reporter_Manager.test.pass("TestCase is Succesfull");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	 

}
