package Pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Solr_Search extends TestBase{
	
	
	

	@FindBy(id="search_part")
	
	WebElement Search_Part;
	
	@FindBy(xpath="//*[@class='ac_results']//a[contains(text(),'REFRESH SEARCH RESULT')]")
	
	WebElement Solrmessage;
	
	@FindBy(xpath="//form[@id='ajax_spl_order_frm']//input[@id='special_order_create']")
	
	WebElement Create_Special_Order_btn;
	  
	@FindBy(id="discount_update_btn")
	
	WebElement Next_btn;
	
	@FindBy(xpath="//div[@id='show_special_order_all']//button[text()='Yes']")
	
	WebElement Show_Special_order_Yes;
	
	@FindBy(xpath="//input[@id='hid_barcode_0']")
	
	WebElement get_barcode_value;
	
	@FindBy(id="p2_desc_0")
	
	WebElement part_number;
	
	
	public Solr_Search() {
		
		PageFactory.initElements(driver, this);
	}
	
	// Action for Barcode Scanning
	
	public ArrayList<String> Barcode_Scanning (String Barcode) throws InterruptedException {
		
		waitUntilElementClickable(Search_Part, 10);
				
		Search_Part.sendKeys(Barcode);
		
		waitUntilElementVisible(Solrmessage, 10);
		
		String Solr_message =gettext(Solrmessage);
		
		Search_Part.sendKeys(Keys.ENTER);
								
		String get_part_details=get_barcode_value.getAttribute("value");
							
		ArrayList<String> getdata = new ArrayList<String>();
		
		getdata.add(Solr_message);
		
		getdata.add(get_part_details);
		
		return getdata;
		
			
	}
		
	
	public ArrayList<String> Part_Number_Scanning(String partnumber) {
       
		Search_Part.sendKeys(partnumber);
		
		waitUntilElementVisible(Solrmessage, 10);
		
		String Solr_message1 = gettext(Solrmessage);
		
		Search_Part.sendKeys(Keys.ENTER);
		
		String part_number_txt=part_number.getText();
		
		String [] partdesc=part_number_txt.split(",");
		
		String partlist1=partdesc[0];
		
		System.out.println();
		
		ArrayList<String> getdata = new ArrayList<String>();
		
		getdata.add(Solr_message1);
		
		getdata.add(partlist1);
						    					
		return getdata;
		
	}
	
	
	public String  Description_Search() {
		
		Search_Part.sendKeys("DA022 Camera Adapter Plate");
		
		waitUntilElementVisible(Solrmessage, 10);
		
		String Solr_message2=gettext(Solrmessage);
		
		Search_Part.sendKeys(Keys.ENTER);
		
		return Solr_message2;
		
	}
	
	

}
