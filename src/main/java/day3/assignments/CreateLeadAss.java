package day3.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TestCompany");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Raj");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Bino");
		driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("Testraj");
		WebElement drop1 = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select seldrop01 = new Select(drop1);
		seldrop01.selectByVisibleText("Conference");
		driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Testing");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("25000");
		WebElement drop2 = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select seldrop2= new Select(drop2);
		seldrop2.selectByValue("IND_INSURANCE");
		WebElement drop3= driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
		Select seldrop3 = new Select(drop3);
		seldrop3.selectByVisibleText("Corporation");
		driver.findElementByXPath("//input[@id='createLeadForm_sicCode']").sendKeys("123");
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Testing purpose only");
		driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote']").sendKeys("Important notes description");
		WebElement code = driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']");
		code.clear();
		code.sendKeys("3");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("987");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("+91");
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("ComputerScience");
		WebElement currency = driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']");
		Select selcurre = new Select(currency);
		selcurre.selectByValue("INR");
		driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("15");
		driver.findElementByXPath("//input[@id='createLeadForm_tickerSymbol']").sendKeys("@E89%^");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAskForName']").sendKeys("Raman");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("http://leaftaps.com/");
		driver.findElementByXPath("//input[@id='createLeadForm_generalToName']").sendKeys("Balasarguru");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress1']").sendKeys("No.17/2");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress2']").sendKeys("Bharang Street");
		driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("Chennai");
		WebElement state = driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId']");
		Select selstate= new Select(state);
		selstate.selectByValue("CA");
		WebElement country = driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']");
		Select selcountry = new Select(country);
		selcountry.selectByVisibleText("Albania");
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("968574");
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("+96");
		WebElement marketin = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
		Select selmarket = new Select(marketin);
		selmarket.selectByValue("CATRQ_CAMPAIGNS");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9791385425");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("raj@test.fd");
		driver.findElementByXPath("//input[@name='submitButton']").click();
    	WebElement verfname= driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
		String Pname = verfname.getText();
		String oname= "Raj";
		if (Pname.equals(oname))
		{
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}

	}

}
