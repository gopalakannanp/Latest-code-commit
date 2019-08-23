package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.Select_Parts_To_Order_Page;
import TestBase.TestBase;
import Util.TestUtil;

public class Select_Parts_To_Order_Page_Test extends TestBase {
	
	public ExtentReports extent;

	public ExtentTest extentTest;

	HomePage homepage;

	LoginPage loginpage;
	
	Solr_Search Solr;

	static TestUtil util = new TestUtil();

	Select_Parts_To_Order_Page  selectorder;
	
	public Select_Parts_To_Order_Page_Test(){
		
		super();
	}
	
	@BeforeTest
	public void setExtent() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReport.html", true);

	}

	@BeforeMethod
	
	public void setup() throws InterruptedException {
		
		initialization();
		
		selectorder= new Select_Parts_To_Order_Page();
		
		loginpage=new LoginPage();
		
		homepage= new HomePage();
		
		homepage=loginpage.login(prop.getProperty("un"), prop.getProperty("ps"));
			
	}
	
	@Test(enabled = true, priority = 1)
	
	public void To_Verify_Create_PO() throws InterruptedException {

		extentTest = extent.startTest("To_Verify_Create_PO");

		String Verify = selectorder.Create_PO();

		Assert.assertEquals(Verify, "Part has been added to shopping cart successfully");


	}

	

}
