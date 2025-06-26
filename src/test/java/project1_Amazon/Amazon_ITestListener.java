package project1_Amazon;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Amazon_ITestListener implements ITestListener {

	public static WebDriver driver;

	    Date d1= new Date();
	     Date d2= new Date(d1.getTime());                                                         //                                                                                  use epoch cnvrtr to convrt time

	        String f1=   d2.toString();
	    // Format -->     dd-MM-yyyy_HH-mm-ss

	  String date= f1.substring(8, 10);
	     String month= f1.substring(4, 7);
	       String year=  f1.substring(f1.length()-4);

	       String hour=  f1.substring(11, 13);
	       String min=  f1.substring(14, 16);
	          String sec=  f1.substring(17, 19);

	      String f2=  date+"-".concat(month)+"-".concat(year)+"_".concat(hour)+"-".concat(min)+"-".concat(sec);

	@Override
	public void onTestSuccess(ITestResult ontestsuccess) {

		   System.out.println("Epoch Time-> " +d1.getTime());
	        System.out.println(d2);
            System.out.println(f2);

		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ajitc\\eclipse-workspace - new\\Maven_Projects_Programs\\ScreenShots AmazonPrj\\Amazon Pass Sshot"
				                                             + "\\TCPass " +ontestsuccess.getName()+"_" +f2+".png");

		try {
			FileHandler.copy(source, destination);
			System.out.println("Screenshot is Saved-> " + "On Pass");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(ontestsuccess);
		Reporter.log("Test Case Is Pass");

	}

	@Override
	public void onTestFailure(ITestResult ontestfailure) {

		 System.out.println("Epoch Time-> " +d1.getTime());
	        System.out.println(d2);
         System.out.println(f2);

		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ajitc\\eclipse-workspace - new\\Maven_Projects_Programs\\ScreenShots AmazonPrj\\Amazon Fail Sshot"
				                                             + "\\TCFail " +ontestfailure.getName()+"_" +f2+".png");

		try {
			FileHandler.copy(source, destination);
			System.out.println("Screenshot is Saved-> " + "On Fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(ontestfailure);
		Reporter.log("Test Case Is Fail");

	}

}
































/*

import java.text.SimpleDateFormat;
import java.util.Date;

// Inside your onTestSuccess and onTestFailure methods:
SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
String timestamp = formatter.format(new Date());

File destination = new File("C:\\Users\\ajitc\\eclipse-workspace\\Maven_Programs2\\ScreenShots AmazonPrj\\Amazon Pass Sshot"
                            + "\\TCPass_" + ontestsuccess.getName() + "_" + timestamp + ".png");




*/