package testCases;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import commonFunctions.Common_Functions;
import pageObjects.Google_Search_Page;
import pageObjects.uTest_First_Page;
import pageObjects.uTest_Fourth_Page;
import pageObjects.uTest_Home_Page;
import pageObjects.uTest_Second_Page;
import pageObjects.uTest_Third_Page;

public class uTest_Method {

	WebDriver driver;
	String base_url = "https://www.google.com";
	ExtentHtmlReporter reporter;				
	ExtentReports extent;						
	ExtentTest test;						
	
	@BeforeTest
	public void launch_test()
	{
		reporter=new ExtentHtmlReporter("./uTest_Report/report1.html");	
		reporter.config().setDocumentTitle("uTest_Automation_Report");
		reporter.config().setReportName("Functional_Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host_Name", "localhost");
		extent.setSystemInfo("OS", "Windws10");
		extent.setSystemInfo("Tester_Name", "PRAJIN");
		extent.setSystemInfo("Browser_Name", "Chrome");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(base_url);
	}
	@BeforeMethod
	public void start_method()
	{
		
	}
	@Test (priority = 0)
	public void uTest_google()
	{
		test=extent.createTest("uTest_google");
		Google_Search_Page ob1=new Google_Search_Page(driver);
		ob1.google_search("uTest");
		ob1.clickutest();
	}
	@Test (priority = 1)
	public void uTest_Home()
	{
		test=extent.createTest("uTest_Home");
		uTest_Home_Page ob1=new uTest_Home_Page(driver);
		ob1.click_become_a_tester();
	}
	@Test (priority = 2)
	public void uTest_first() throws InterruptedException {
		test=extent.createTest("uTest_first");
		uTest_First_Page ob1=new uTest_First_Page(driver);
		ob1.nameverification("John","Smith");
		ob1.emailverification("john123@gmaill.com");
		ob1.DateOfBirth();
		ob1.language("Malayalam","Hindi");
		ob1.clickNextFirst();
	}
	@Test (priority = 3)
	public void uTestSecond() throws InterruptedException {
		test=extent.createTest("uTestSecond");
		uTest_Second_Page ob1=new uTest_Second_Page(driver);
		ob1.textcity();
		ob1.textzip();
		ob1.textcountry();
	//	ob1.clicksatelite();
    	ob1.clickNextSecond();
	}
	@Test (priority = 4)
	public void uTestthird() throws InterruptedException {
		test=extent.createTest("uTestthird");
		uTest_Third_Page ob1=new uTest_Third_Page(driver);
		ob1.slctcomputr();
		ob1.clickNextThird();
		}
	@Test (priority = 5)
	public void uTestfourth() {
		test=extent.createTest("uTestfourth");
		uTest_Fourth_Page ob1=new uTest_Fourth_Page(driver);
		ob1.password("QweAsdZxc10@#","QweAsdZxc10@#");
		ob1.checkbox();
		ob1.finalclick();
	}
	@AfterMethod
	public void exit_method(ITestResult result) throws IOException	
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "TestCase Failed is "+result.getName());
			test.log(Status.FAIL, "TestCase Failed is "+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "TestCase Skipped is "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Testcase Passed is "+result.getName());
		}
	}
	@AfterTest
	public void exit_test()
	{
		extent.flush();
		//driver.quit();
	}
}
