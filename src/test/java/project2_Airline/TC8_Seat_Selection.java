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
import project2_Airline_Src.Airline_SeatSelection_Page;

@Listeners(Airline_ITestListener.class)
public class TC8_Seat_Selection extends Airline_BaseClass
{
	@Test (retryAnalyzer=Airline_RetryAnalyzer.class)
	public void CheckSeatTC8_Selection()
	{

	        // 8 Check for seat selection during the booking process.

		Reporter_Manager.test = Reporter_Manager.extent.createTest("CheckSeatTC8_Selection");

	           System.out.println("Title is-> " + driver.getTitle());

	                Airline_HomePage hp= new Airline_HomePage(driver);
                                hp.RemoveLogin(driver);
    			                              Reporter_Manager.test.info("Removing is done");

                   Airline_SeatSelection_Page ssp= new Airline_SeatSelection_Page(driver);
	                             ssp.SearchDetails();
		                                     Reporter_Manager.test.info("Flight searched");

	                             ssp.ControlChild(driver);
	    			                          Reporter_Manager.test.info("Control to the child window");

	                             ssp.SeatDetails();
	    			                          Reporter_Manager.test.info("Seat Selected");



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
