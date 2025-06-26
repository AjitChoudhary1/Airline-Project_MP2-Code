package project2_Airline;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Airline_RetryAnalyzer implements IRetryAnalyzer {

	int initialCount= 0;
	static int retryCount= 1;

	@Override
	public boolean retry(ITestResult result) {

		if(initialCount<retryCount) {
			System.out.println("Retrying Test-> " + result.getName() + "for" + (initialCount + 1) + " time(s).");

			initialCount++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
}
