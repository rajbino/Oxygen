package day3.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000);
		
		WebElement table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.print(rows.get(0).getText());
		List<WebElement> cols= rows.get(0).findElements(By.tagName("td"));
		String firstname = cols.get(2).getText();
		System.out.println(firstname);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr//a").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead"))
	     {
	    	 System.out.println("correct title");
	     }
			
	 driver.findElementByXPath("//input[@name='submitButton']").click();
	 WebElement check =	driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
     String pname = check.getText();
     System.out.println(pname);
     if (firstname.equals(pname))
     {
    	 System.out.println("Correct name");
     }
     else {
    	 System.out.println("Incorrect name");
     }
     
     driver.close();
		
	}

}
