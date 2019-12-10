package week02.optionalassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedbusAssignment {

	public static void main(String[] args) throws InterruptedException  {
	
		
		
		// TODO Auto-generated method stub

		
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		WebElement start = driver.findElementByXPath("//input[@id='src']");
		start.clear();
		start.sendKeys("Chennai");
		Thread.sleep(3000);
		start.sendKeys(Keys.TAB);
	
	     WebElement end = driver.findElementByXPath("//input[@id='dest']");
		 end.clear();
		 end.sendKeys("Trichy");
		 Thread.sleep(3000);
		 end.sendKeys(Keys.TAB);
		
		WebElement onwarddat= driver.findElementByXPath("(//td[@class='current day'])[2]");
		onwarddat.click();
		
		WebElement returndat= driver.findElementByXPath("//label[text()='Return Date']");
		returndat.click();
		
		WebElement returncli = driver.findElementByXPath("(//td[text()='12'])[2]");
		returncli.click();
		
		driver.findElementByXPath("//button[text()='Search Buses']").click();
		
		
		Thread.sleep(5000);
		
		WebElement depa =driver.findElementByXPath("(//label[@class='custom-checkbox'])[4]");
		depa.click();
		Thread.sleep(3000);
		WebElement Btype =driver.findElementByXPath("(//label[@class='cbox-label'])[7]");
		Btype.click();
		
		
		
	
		
		List<WebElement> busname= driver.findElementsByXPath("//div[@class='travels lh-24 f-bold d-color']");
		System.out.println(busname.size());
		for(WebElement nameList: busname)
		{
			System.out.println(nameList.getText());
		}
		
		
	
		
		
	}

}
/*
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Thread.sleep(3000);
WebElement start= driver.findElementByXPath("//input[@class='db']");
start.clear();
start.sendKeys("Chennai");
Thread.sleep(1000);
start.sendKeys(Keys.DOWN,Keys.DOWN);
WebElement end= driver.findElementByXPath("//input[@tabindex=\"2\"]");
end.click();
end.sendKeys("Trichy",Keys.DOWN);

WebElement onwarddate = driver.findElementByXPath("//label[text()='Onward Date']");
onwarddate.click();
WebElement onwarddatecli = driver.findElementByXPath("(//td[@class='current day'])[2]");
onwarddatecli.click();

WebElement returndate = driver.findElementByXPath("//label[text()='Return Date']");
returndate.click();
WebElement returndatecli = driver.findElementByXPath("(//td[text()='10'])[2]");
returndatecli.click();
Thread.sleep(1000);

//WebElement searchbuses = driver.findElementByXPath("//button[@id='search_btn']");*/