package week02.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
	    driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Leads").click();
	    driver.findElementByXPath("//a[text()='Find Leads']").click();
	    driver.findElementByXPath("//span[text()='Phone']").click();
	    WebElement coucode = driver.findElementByXPath("//input[@name='phoneCountryCode']");
	    coucode.clear();
	    coucode.sendKeys("1");
	    WebElement areacode = driver.findElementByXPath("//input[@name='phoneAreaCode']");
	    areacode.sendKeys("310");
	    WebElement phonenum= driver.findElementByXPath("//input[@name='phoneNumber']");
	    phonenum.sendKeys("322-5111");
	    driver.findElementByXPath("//button[text()='Find Leads']").click();
	    
	    Thread.sleep(3000);
	    
	    WebElement table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
	    List<WebElement>rows=table.findElements(By.tagName("tr"));
	    List<WebElement>cols=rows.get(0).findElements(By.tagName("td"));
	    String valu = cols.get(0).getText();
	    System.out.println(valu);
        
	   driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
	   driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
	   
	   Thread.sleep(1000);
	    
	   driver.findElementByXPath("//a[text()='Find Leads']").click();
	   driver.findElementByXPath("//input[@name='id']").sendKeys(valu);
	   driver.findElementByXPath("//button[text()='Find Leads']").click();
	   Thread.sleep(3000);
	   WebElement gets = driver.findElementByXPath("//div[@class='x-paging-info']");
	   String info= gets.getText();
	   String info1 = "No records to display";
	   //System.out.println(info);
	   
	   if (info.equals(info1))
	   {
		   System.out.println("The successful deletion");
	   }
	   driver.close();
		

		
		
	}

}
