package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class CreateNewVendor_NewCustomer extends TestBase{
	
	@FindBy(id="vendor")

	WebElement contacttype;
	
	@FindBy(id = "vendor_name")
	
	WebElement vendorname;
	
	@FindBy(id ="vendor_contact_submit_btn")
	
	WebElement Create_btn;
	
	@FindBy(id ="cus_last_name")
	
	WebElement Last_name;
	
	@FindBy(id ="cus_first_name")
	
	WebElement First_name;
	
	@FindBy(id ="cus_contact_submit_btn")
	
	WebElement Create_btn_customer;
	
	
	public CreateNewVendor_NewCustomer() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void create_vendordetail(String VendorName) throws InterruptedException {
		
		
		Thread.sleep(1000);
		
		waitUntilElementClickable(contacttype, 30);
				
		Thread.sleep(2000);
		
		vendorname.sendKeys(VendorName);
				
		Thread.sleep(2000);
		
		Create_btn.click();
	
		Thread.sleep(2000);
	}


	public void create_New_customer(String Lastname,String Firstname) throws InterruptedException {
		
		Thread.sleep(1000);
		
		Last_name.sendKeys(Lastname);
		
		First_name.sendKeys(Firstname);
		
		Create_btn_customer.click();
		
		
	}

	


	
}
