package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class InvoiceSale extends TestBase {
	
	@FindBy(id = "last_name")

	WebElement Last_name;

	@FindBy(id = "search_part")

	WebElement search_part;
	
	@FindBy(xpath = "//*[text()='SASI']")

	WebElement AutoSelect_customer;
	
	@FindBy(id = "pay_button_cash")

	WebElement pay_button_cash;
	
	@FindBy(id = "exact_dollar_btn")

	WebElement exact_dollar_btn;
	
	@FindBy(id = "cash_submit_btn")

	WebElement cash_submit_btn;
	
	@FindBy(id="print_option_div")
	
	WebElement printoff;
	
	public InvoiceSale() {
		
		PageFactory.initElements(driver, this);
		
	}
	
    public void Partaddtocart() {
	
    	Last_name.sendKeys("SASI");
    	
    	AutoSelect_customer.click();
	
    	search_part.sendKeys("DS1004");
    	
    	search_part.sendKeys(Keys.ENTER);
    	
    	waitUntilElementClickable(pay_button_cash,10);
    	    	    	
    	waitUntilElementClickable(exact_dollar_btn,10);
    	
        waitUntilElementVisible(printoff, 10);
    
        printoff.click();
    	   	
        cash_submit_btn.click();
}
	
}
