package day4.classroom;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listdownallrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://erail.in");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int i=0; i< rows.size();i++)
		{
			List<WebElement> coldata=rows.get(i).findElements(By.tagName("td"));
			System.out.println(coldata.get(1).getText());
		}
		
	
		
		
		
	}

}
