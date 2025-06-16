package project1_Amazon;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporter_Manager {

	 public static ExtentReports extent;
	    public static ExtentTest test;
	    public static void startReport()
	 {
	        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(spark);
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("Tester", "Ajit Choudhary");
	    }
	    public static void flushReport() {
	        extent.flush();
	    }
}
