package week04.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("babu@testleaf.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		
		WebElement capname= driver.findElementByXPath("//table[@class='x-grid3-row-table']//td[3]//a");
		String capturedname=capname.getText();
		capname.click();
		
		
		
		WebElement duplicate= driver.findElementByXPath("//a[text()='Duplicate Lead']");
		duplicate.click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead"))
		{
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		
		driver.findElementByXPath("//input[@name='submitButton']").click();
		Thread.sleep(3000);
		WebElement duplicatename= driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
		String dpname= duplicatename.getText();
		if (dpname.contains(capturedname))
		{
			System.out.println("duplicated lead name is same as captured name");
		}
		else {
			System.out.println("duplicated lead name is not same as captured name");
		}
		
		driver.close();
		
		
	}

}
