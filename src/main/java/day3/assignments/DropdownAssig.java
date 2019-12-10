package day3.assignments;

import java.util.List;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssig {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement drop1= driver.findElementByXPath("//select[@id='dropdown1']");
		Select seldrop1 = new Select(drop1);
		seldrop1.selectByIndex(1);
		
		WebElement drop2 = driver.findElementByXPath("//select[@name='dropdown2']");
		Select seldrop2 = new Select(drop2);
		seldrop2.selectByVisibleText("Appium");
		
		WebElement drop3 = driver.findElementByXPath("//select[@id='dropdown3']");
		Select seldrop3 = new Select(drop3);
		seldrop3.selectByValue("3");
		
		WebElement drop4 = driver.findElementByXPath("//select[@class='dropdown']");
		Select seldrop4= new Select(drop4);
		List<WebElement> optdrop4 =seldrop4.getOptions();
		int opti= optdrop4.size();
		seldrop4.selectByIndex(opti-1);
		
		
		WebElement drop5=driver.findElementByXPath("(//div[@class='example'])[5]/select");
		drop5.sendKeys("UFT/QTP");
		
		
		WebElement drop6= driver.findElementByXPath("(//div[@class='example'])[6]/select");
		Select seldrop6= new Select(drop6);
		seldrop6.selectByValue("1");
	
	
		
		
		
		
		
	}
	
	
}
