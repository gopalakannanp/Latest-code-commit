package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class ProductPage extends TestBase {

	@FindBy(id = "keyword")
	@CacheLookup
	WebElement Part_search_textbox;

	@FindBy(id = "submit_btn")
	@CacheLookup
	WebElement Submit_btn;

	@FindBy(xpath = "//table[@id='jqGrid01']//i[@class='icon-edit']")
	@CacheLookup
	WebElement Edit_Product_Page_btn;

	@FindBy(xpath = "//*[@id='stock']")
	@CacheLookup
	WebElement Stock_btn;

	@FindBy(xpath = "//*[@id='showmore']/i")
	@CacheLookup
	WebElement Adjustment_log_btn;

	@FindBy(xpath = "//div[@id='part_log_details']/p[1]")
	@CacheLookup
	WebElement Adjustment_log_msg;

	public ProductPage() {

		PageFactory.initElements(driver, this);

	}

	public void verifytheproduct() {

		Part_search_textbox.sendKeys("101");

		Submit_btn.click();

		Edit_Product_Page_btn.click();

		Select select = new Select(driver.findElement(By.xpath("//select[@id='vendor_id']")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);



	}

}
