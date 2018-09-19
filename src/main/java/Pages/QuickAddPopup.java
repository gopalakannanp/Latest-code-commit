package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class QuickAddPopup extends TestBase {
	
	
	@FindBy(id = "part_number1")

	WebElement part_number;

	@FindBy(id = "barcode1")

	WebElement barcode;

	@FindBy(id = "stock1")

	WebElement sp_stock;

	@FindBy(id = "stock1")

	WebElement Instock;

	@FindBy(id = "cost1")

	WebElement cost;

	@FindBy(id = "primary_desc1")

	WebElement PopupDescription;

	@FindBy(id = "price1")

	WebElement Price;

	@FindBy(id = "category_id1")

	WebElement category;

	@FindBy(id = "vendor_id1")

	WebElement vendor;

	@FindBy(id = "manufacturer_id1")

	WebElement manufacturer;

	@FindBy(xpath = "//div[@id='invdel']//a[contains(text(),'Add More')]")

	WebElement Addmore;

	@FindBy(xpath = "//div[@id='invqadd']//a[contains(text(),'Done')]")

	WebElement Done;

	public QuickAddPopup() {

		PageFactory.initElements(driver, this);

	}

	public void QuickaddFunction(String Partno, String qtytoOrder, String Cost, String retailprice,
			String description, String Part_no, String Barcode) {

		part_number.sendKeys(Part_no);

		barcode.sendKeys(Barcode);
		
		PopupDescription.sendKeys(description);

		sp_stock.clear();

		sp_stock.sendKeys(qtytoOrder);

		cost.clear();

		cost.sendKeys(Cost);

		Price.clear();

		Price.sendKeys(retailprice);

		selectDropdown(category, "ASIAN");

		selectDropdown(vendor, "ASIAN");

		selectDropdown(manufacturer, "ASIAN");

		Addmore.click();

		

	}

/*	public void QuickAddwithInstock(String Partno, String Stock, String Cost, String retailprice, String description) {

	//	Search_part.sendKeys(Partno);

		//Search_part.sendKeys(Keys.ENTER);

		PopupDescription.sendKeys(description);

		Instock.clear();

		Instock.sendKeys(Stock);

		cost.clear();

		cost.sendKeys(Cost);

		Price.clear();

		Price.sendKeys(retailprice);

		selectDropdown(category, "ASIAN");

		selectDropdown(vendor, "ASIAN");

		selectDropdown(manufacturer, "ASIAN");

		Addmore.click();

	}*/
}
