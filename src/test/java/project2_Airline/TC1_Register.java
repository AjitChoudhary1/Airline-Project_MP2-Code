package project2_Airline;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_Airline_Src.Airline_RegisterPage;

@Listeners(Airline_ITestListener.class)
public class TC1_Register extends Airline_BaseClass {

	@Test (retryAnalyzer=Airline_RetryAnalyzer.class)

	public void Register_ToClearTrip_TC1() throws InterruptedException {
		//public void Register_ToAirIndia_TC1() throws InterruptedException {
		       // public void Register_ToSouthwestAir_TC1() throws InterruptedException {


		// 1 Verify that users can successfully register for a new account.


		System.out.println("Title is-> " + driver.getTitle());

		Airline_RegisterPage regpage = new Airline_RegisterPage(driver);

		  // ClearTrip

		           regpage.SignUpCT(driver);










		// Air India

		         /* regpage.Signin(); regpage.Signup();

		            regpage.CreateAccount();

		             regpage.Submit(driver);
		           */










		// Southwest

		           // regpage.SWAccount(); regpage.AccountDetails();


	}

}
