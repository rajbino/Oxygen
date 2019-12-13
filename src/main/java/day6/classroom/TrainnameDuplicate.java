package day6.classroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainnameDuplicate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://erail.in");
		Thread.sleep(3000);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		
		Thread.sleep(3000);
		
		List<WebElement> Alltrainname = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
		
		/*List<String> columnname= new ArrayList<String>();
		System.out.println(Alltrainname.size());
		for(int i=0; i<Alltrainname.size(); i++)
		{
			
			columnname.add(Alltrainname.get(i).getText());
			
		}*/
		
		
		
		Set<String> uniquetrainname = new HashSet<String>();
		for (WebElement trainlist:Alltrainname)
		{
			String name= trainlist.getText();
			uniquetrainname.add(name);
			
		}
		
		
		int size= uniquetrainname.size();
		System.out.println(size);
		
		
		
		
		
		
		
		
		//System.out.println(columnname.size());
		
		
		

	}

}
