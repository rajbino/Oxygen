package week04.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Raj");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
		String title= driver.getTitle();


		if (title.contentEquals("View Lead | opentaps CRM"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement getcname= driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		getcname.clear();
		getcname.sendKeys("INFOSYS");
		
		driver.findElementByXPath("//input[@name='submitButton']").click();
		String cmpname= driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		if(cmpname.contains("INFOSYS"))
		
		{
			System.out.println("CmpName changed successfully");
		}
		else {
			System.out.println("CmpName not changed successfully");
		}
		
		
		driver.close();
		
		//driver.findElementByXPath("").click();
	}

}
