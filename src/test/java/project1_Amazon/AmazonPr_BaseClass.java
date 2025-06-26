package project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public class AmazonPr_BaseClass extends Amazon_ITestListener
{

	@BeforeSuite
	public void extentreport()
	{
		Reporter_Manager.startReport();
	}

	@AfterSuite
	public void extentreport1()
	{
		Reporter_Manager.flushReport();
	}

	 @BeforeMethod
	 @Parameters("Browsers")
	 public void Launching(@Optional("edge")String NameOfBrowser)
	 {


		 if(NameOfBrowser.equals("edge"))
		 {

			 EdgeOptions options= new EdgeOptions();
			 options.addArguments("start-maximized");

			// options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			 //  options.setExperimentalOption("useAutomationExtension", false);

		           driver= new EdgeDriver(options);
		 }

		 if(NameOfBrowser.equals("chrome"))
		 {

			 ChromeOptions options= new ChromeOptions();
			 options.addArguments("start-maximized");

			// options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			  // options.setExperimentalOption("useAutomationExtension", false);

			         driver= new ChromeDriver(options);
			           driver.navigate().refresh();

		 }

		 driver.get("https://www.amazon.in");

		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));


		      System.out.println();Reporter.log("Browser Is Launched Sucessfully");
	 }


	 @AfterMethod
	 public void Closing()
	 {

		 // driver.close();
		    System.out.println(); Reporter.log("Browser Is Closed Sucessfully");
	 }



}





























/*<dependencyManagement>
<dependencies>
	<dependency>
		<groupId>org.junit</groupId>
		<artifactId>junit-bom</artifactId>                                // 1st Part above dependencies
		<version>5.11.0</version>
		<type>pom</type>
		<scope>import</scope>
	</dependency>
</dependencies>


	</dependencyManagement>*/







/*<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-api</artifactId>                             // 2nd Part below dependencies
<scope>test</scope>
</dependency>
<!-- Optionally: parameterized tests support -->
<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-params</artifactId>
<scope>test</scope>
</dependency>*/