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

import project2_Airline_Src.Airline_ApplyCode_Page;
import project2_Airline_Src.Airline_HomePage;

@Listeners(Airline_ITestListener.class)
public class X_TC13_CouponCode_BookingFlight extends Airline_BaseClass
{
	@Test (retryAnalyzer=Airline_RetryAnalyzer.class)
	public void ApplyCouponTC13_Code_FlightBook()
	{
		
	        // 13 Check if user is able to apply for coupon code while booking the flight trip

		
		Reporter_Manager.test = Reporter_Manager.extent.createTest("ApplyCouponTC13_Code_FlightBook");

		
	           System.out.println("Title is-> " + driver.getTitle());
	           
	                 Airline_HomePage hp= new Airline_HomePage(driver);
	                              hp.RemoveLogin(driver);
	  			                                 Reporter_Manager.test.info("Removing is done");

	                Airline_ApplyCode_Page acp= new Airline_ApplyCode_Page(driver);
	                              acp.SearchFlight();
		  			                              Reporter_Manager.test.info("Searched Flight");

	                              acp.ControlChild(driver);
		  			                              Reporter_Manager.test.info("Control to the child window");

	                              acp.ApplyCode();
		  			                              Reporter_Manager.test.info("Coupon code applied");

	        
	            
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
