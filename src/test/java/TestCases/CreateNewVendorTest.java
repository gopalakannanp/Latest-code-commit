package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.CreateNewVendor_NewCustomer;
import Pages.HomePage;
import Pages.LoginPage;
import TestBase.TestBase;
import Util.TestUtil;

public class CreateNewVendorTest extends TestBase {
	
	LoginPage loginpage;
	
	HomePage homepage;
	
	TestUtil util = new TestUtil();

	CreateNewVendor_NewCustomer vendorpage;

	String sheetName ="vendor";
	
//    String sheetName1="Contact";
	
	@BeforeMethod

	public void setup() throws InterruptedException {

		initialization();

		loginpage = new LoginPage();
		
		vendorpage=new CreateNewVendor_NewCustomer();
		
		homepage=loginpage.login(prop.getProperty("un"), prop.getProperty("ps"));
		
		homepage.CreateNewvendorpage();
		
		

	}
	

	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	/*@DataProvider
	public Object[][] getCRMTestData1() {
		Object data[][] = TestUtil.getTestData(sheetName1);
		return data;
	}
	*/
	@Test(dataProvider ="getCRMTestData")
	
	public void createnewvendorList(String VendorName) throws InterruptedException {
		
		vendorpage.create_vendordetail(VendorName);
	}
	
	
	/*@Test(dataProvider = "getCRMTestData1")
	
	public void createnewcustomerlist(String Lastname,String Firstname) throws InterruptedException {
		
		vendorpage.create_New_customer(Lastname, Firstname);
	}*/
	
	@AfterMethod

	public void down() {
		
		driver.quit();
	}
}
