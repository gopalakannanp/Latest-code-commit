package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.QuickAddPopup;
import TestBase.TestBase;
import Util.TestUtil;

public class QuickAddpopTest extends TestBase {

	public QuickAddpopTest() {

		super();
	}

	QuickAddPopup Qtf;

	LoginPage loginpage;

	HomePage homepage;

	String sheetName1 = "QuickAdd";

	static TestUtil util = new TestUtil();

	@DataProvider
	public Object[][] getCRMTestData1() {

		Object data[][] = TestUtil.getTestData(sheetName1);

		return data;
	}

	@BeforeMethod

	public void setup() throws InterruptedException {

		initialization();

		loginpage = new LoginPage();

		homepage = new HomePage();

		homepage = loginpage.login(prop.getProperty("un"), prop.getProperty("ps"));
		
		homepage.ClickOnQuickAddProduct();

		Qtf = new QuickAddPopup();
	}

	@Test(dataProvider = "getCRMTestData1")

	public void QuickAddpopupTest(String Partno, String qtytoOrder, String Cost, String retailprice,
			String description, String Part_no, String Barcode) {

		Qtf.QuickaddFunction(Partno, qtytoOrder, Cost, retailprice, description, Part_no, Barcode);
		


	}

/*	@Test

	public void QuickAddwithInstock(String Partno, String Stock, String Cost, String retailprice, String description) {

		Qtf.QuickAddwithInstock(Partno, Stock, Cost, retailprice, description);

	}
*/

}
