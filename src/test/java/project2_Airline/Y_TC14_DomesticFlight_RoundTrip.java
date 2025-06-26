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

import project2_Airline_Src.Airline_HomePage;
import project2_Airline_Src.Airline_RoundTrip_Page;

@Listeners(Airline_ITestListener.class)
public class Y_TC14_DomesticFlight_RoundTrip extends Airline_BaseClass
{
	@Test (retryAnalyzer=Airline_RetryAnalyzer.class)
	public void DomesticRoundTC14_TripFlight()
	{

	        // 14 Check if user is able to search the domestic round trip flight


		Reporter_Manager.test = Reporter_Manager.extent.createTest("DomesticRoundTC14_TripFlight");


	           System.out.println("Title is-> " + driver.getTitle());

	                 Airline_HomePage hp= new Airline_HomePage(driver);
	                               hp.RemoveLogin(driver);
	   			                                 Reporter_Manager.test.info("Removing is done");

	                Airline_RoundTrip_Page  rtp= new Airline_RoundTrip_Page(driver);
	                               rtp.RoundTrip();
		   			                             Reporter_Manager.test.info("Domestic flight is done");




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
