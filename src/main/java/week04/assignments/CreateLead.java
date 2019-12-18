package week04.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Test Company");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Raj");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Bino");
		driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("manick");
		driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("Basha");
		driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("TestCases");
		
		WebElement source= driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select selsource = new Select(source);
		selsource.selectByValue("LEAD_CONFERENCE");
		
		driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Selenium");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("2,00,000");
		
		
		WebElement industry= driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select selindustry = new Select(industry);
		selindustry.selectByVisibleText("Aerospace");
		
		
		WebElement owner= driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
		Select selowner = new Select(owner);
		selowner.selectByVisibleText("Corporation");
		
		
		driver.findElementByXPath("//input[@id='createLeadForm_sicCode']").sendKeys("0124");
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing");
		driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote']").sendKeys("Pityful a rethoric question ran over her cheek,");
		
		WebElement coucode= driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']");
		coucode.clear();
		coucode.sendKeys("2");
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("635");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("+61");
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("Testing");
		
		
		
		WebElement perfcurrency= driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']");
		Select selcurrency= new Select(perfcurrency);
		selcurrency.selectByValue("INR");
		
		
		driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("25");
		driver.findElementByXPath("//input[@id='createLeadForm_tickerSymbol']").sendKeys("95124AS");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAskForName']").sendKeys("Kamal");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("https://www.google.com/");
		driver.findElementByXPath("//input[@id='createLeadForm_generalToName']").sendKeys("Baskar");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress1']").sendKeys("No.12, Cross Street");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress2']").sendKeys("Lakshmin nager");
		driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("Chennai");
		
		
		WebElement stateprovince = driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId']");
		Select selstateprov= new Select(stateprovince);
		selstateprov.selectByVisibleText("Indiana");
		
		
		WebElement country = driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']");
		Select selcountry= new Select(country);
		selcountry.selectByVisibleText("India");
			
		
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("635241");
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("654");
		
		WebElement market = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
		Select Selmarket= new Select(market);
		Selmarket.selectByVisibleText("Automobile");
		
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9685741245");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("test@raj.in");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
		WebElement givname= driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
		String name= givname.getText();
		String originalname="Raj";
		if(originalname.contentEquals(name))
		{
			System.out.println("Name is correct");
		}
		else {
			System.out.println("Name is incorrect");
		}
		
		
		driver.close();	

	}

}
