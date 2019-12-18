package week04.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		WebElement code= driver.findElementByXPath("//input[@name='phoneCountryCode']");
		code.clear();
		code.sendKeys("2");
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("10");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9524242092");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		WebElement capid= driver.findElementByXPath("//table[@class='x-grid3-row-table']//a");
		String capturedid=capid.getText();
		capid.click();
		
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@id='ext-gen246']").sendKeys(capturedid);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		WebElement infotxt= driver.findElementByXPath("//div[@class='x-paging-info']");
		String infoname=infotxt.getText();
		System.out.println(infoname);
		
	
		if(infoname.contentEquals("No records to display"))
		{
			System.out.println("lead is deleted");
		}
		else {
			System.out.println("lead is not deleted");
		}
		
		driver.close();
		
		
	}

}
