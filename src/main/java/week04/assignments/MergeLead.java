package week04.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

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
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		driver.findElementByXPath("//table[@class='twoColumnForm']//a").click();
		Thread.sleep(3000);
		
		Set<String> windowhandle = driver.getWindowHandles();
		List<String> getwindow= new ArrayList<>(windowhandle);
		System.out.println(getwindow.size());
		
		String newwind= getwindow.get(1);
		String parwind= getwindow.get(0);
		driver.switchTo().window(newwind);
		
		
		
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10026");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
		  
		Thread.sleep(3000);
		//driver.close();
		driver.switchTo().window(parwind);
		Thread.sleep(3000);
		
		driver.findElementByXPath("//table[@class='twoColumnForm']//tr[2]//a").click();
		
		
		Set<String> secwindowhandle = driver.getWindowHandles();
		List<String> getsecwindow= new ArrayList<>(secwindowhandle);
		System.out.println(getsecwindow.size());
		
		String newsecwind= getsecwindow.get(1);
		String parsecwind= getsecwindow.get(0);
        driver.switchTo().window(newsecwind);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10030");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
		  
		Thread.sleep(3000);
		//driver.close();
		driver.switchTo().window(parsecwind);
		
		
		
		
		
		
		
		
		driver.findElementByXPath("//a[text()='Merge']").click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("10026");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		
		Thread.sleep(3000);
		WebElement infotxt= driver.findElementByXPath("//div[@class='x-paging-info']");
		String infoname=infotxt.getText();
		System.out.println(infoname);
		
	
		if(infoname.contentEquals("No records to display"))
		{
			System.out.println("lead is merged");
		}
		else {
			System.out.println("lead is not merged");
		}
		

		driver.close();
	}

}
