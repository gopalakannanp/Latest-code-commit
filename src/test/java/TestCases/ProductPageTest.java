package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import TestBase.TestBase;

public class ProductPageTest extends TestBase {

	LoginPage loginpage;

	HomePage homepage;

	ProductPage product;

	public ProductPageTest() {

		super();
	}

	@BeforeMethod

	public void setup() throws InterruptedException {

		initialization();

		loginpage = new LoginPage();

		homepage = new HomePage();

		product = new ProductPage();

		homepage = loginpage.login(prop.getProperty("un"), prop.getProperty("ps"));

		homepage.clickonproductpage();

	}

	@Test

	public void Test() {

		product.verifytheproduct();

	}

}
