package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

	public static void main(String[] args) {

		// Set the property for ChromeDriver

		// Initiate the ChromeBroswer

		// Maximize the browser

		// Enter the UserName

		// Enter the Password

		// Click on Login Button

		// Click on crm/sfa button

		// Click on Leads

		// Click on Create Lead button

		// Enter Company Name

		// Enter First Name

		// Enter Last Name

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
	    driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Leads").click();
	    driver.findElementByLinkText("Create Lead").click();
	    driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	    driver.findElementById("createLeadForm_firstName").sendKeys("rajan");
	    driver.findElementById("createLeadForm_lastName").sendKeys("Bin0");
	    
	    WebElement source = driver.findElementById("createLeadForm_dataSourceId");
	    Select souselect = new Select(source);
	    List<WebElement> option = souselect.getOptions();
	    int options = option.size();
	    souselect.selectByIndex(options-1);
	    
	    //souselect.selectByVisibleText("Other");
	    
	    WebElement marketingcamp= driver.findElementById("createLeadForm_marketingCampaignId");
	    Select selmarket= new Select(marketingcamp);
	    selmarket.selectByValue("DEMO_MKTG_CAMP");
	    
	    WebElement preferredcurrency= driver.findElementById("createLeadForm_currencyUomId");
	    Select selprecurr= new Select(preferredcurrency);
	    selprecurr.selectByValue("INR");
	    
	    WebElement industrytype = driver.findElementById("createLeadForm_industryEnumId");
	    Select selindustry= new Select(industrytype);
	    selindustry.selectByIndex(1);
	    
	    //driver.findElementByXPath("")
	    
	   // driver.findElementByName("submitButton").click();
	    
		
		
		
		
		
		
		
		// Select 'Source' as 'Other' (Handling DropDown)

		// Select 'Preferred Currency' as 'INR'

		// Click on Create Lead (Submit) button

		// Verify the Lead is created by checking the Company or First Name

	}

}
