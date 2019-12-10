package day3.classroom;

//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	

		// Initiate the ChromeBroswer
		ChromeDriver driver=new ChromeDriver();
		
		

		// Maximize the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Enter the UserName
		
		
		
	
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
	    driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Leads").click();
	    driver.findElementByLinkText("Create Lead").click();
	    driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	    driver.findElementById("createLeadForm_firstName").sendKeys("rajan");
	    driver.findElementById("createLeadForm_lastName").sendKeys("Bin0");
	    driver.findElementByName("submitButton").click();
	    
	    	
      
		// Enter the Password

		// Click on Login Button

		// Click on crm/sfa button

		// Click on Leads

		// Click on Create Lead button

		// Enter Company Name

		// Enter First Name

		// Enter Last Name

		// Click on Create Lead (Submit) button

		// Verify the Lead is created by checking the Company or First Name

	}

}
