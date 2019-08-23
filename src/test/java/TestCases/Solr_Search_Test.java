package TestCases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.Solr_Search;
import TestBase.TestBase;
import Util.TestUtil;

public class Solr_Search_Test extends TestBase {
	
	HomePage homepage;

	LoginPage loginpage;
	
	Solr_Search Solr;
	
	static TestUtil util = new TestUtil();

	String sheetName = "Barcode";
	
	String sheetName1 = "PartNumber";
	
	public Solr_Search_Test() {
		
		super();
	}

	
	@DataProvider
	public Object[][] TestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@DataProvider
	public Object[][] TestData1() {
		Object data[][] = TestUtil.getTestData(sheetName1);
		return data;
	}
	
  @BeforeMethod
  
  public void setup() {
	  
	  initialization();
	  
	  loginpage = new LoginPage();

	  homepage = new HomePage();
	  
	  Solr= new Solr_Search();
	  
	  loginpage.login(prop.getProperty("un"), prop.getProperty("ps"));
	  
  }
  
  
/*  @Test (dataProvider = "TestData", enabled = true)
  
  public void To_Verify_Barcode_Scanning(String Barcode) throws InterruptedException {
	  
	  ArrayList<String> Solr_message =Solr.Barcode_Scanning(Barcode);
	  
	  String Solr=Solr_message.get(0);
	  
	  String Solr1=Solr_message.get(1);
	  	  
	  Assert.assertEquals(Solr, "REFRESH SEARCH RESULT");
	 
	  Assert.assertEquals(Solr1, Barcode);
	  
	  	  
  }*/
  
  
  @Test(dataProvider="TestData1")
 
  
 public void To_Verify_Part_Number_Scanning(String partnumber) throws InterruptedException {
	  
	  ArrayList<String> Solr_message1 =Solr.Part_Number_Scanning(partnumber);
	  
	  String Solr1=Solr_message1.get(0);
	  
	  String Solr2=Solr_message1.get(1);
	    
	  Assert.assertEquals(Solr1, "REFRESH SEARCH RESULT");
	 
	  Assert.assertEquals(Solr2, partnumber);
	  
	  	  
  }
  
  
/*  @Test
  
  public void To_verify_Description_Search() {
	  
	  String Solr_message2=Solr.Description_Search();
	  
	  Assert.assertEquals(Solr_message2, "REFRESH SEARCH RESULT");
	  
  }
  */
  
  /*@AfterMethod
  
  public void quite() {
	  
	  driver.quit();
  }*/
}
