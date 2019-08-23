package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.InvoiceSale;
import Pages.LoginPage;
import TestBase.TestBase;


public class InvoiceSale_Test extends TestBase{
	
	
	LoginPage loginpage;

	HomePage homepage;

	InvoiceSale Sale;
			
	public InvoiceSale_Test() {

		super();
	}

		
	
	@BeforeMethod

	public void setup() throws InterruptedException {

		initialization();

		loginpage = new LoginPage();

		homepage = new HomePage();

		Sale = new InvoiceSale();

		homepage = loginpage.login(prop.getProperty("un"), prop.getProperty("ps"));

		
	}

	@Test
	
	public void Toverifyaddtocart() {
		
		Sale.Partaddtocart();
		
	}
	
}
