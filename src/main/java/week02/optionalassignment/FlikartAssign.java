package week02.optionalassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FlikartAssign {
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement electr = driver.findElementByXPath("//div[@class='zi6sUf']//div//ul//li//span");
		electr.click();
		WebElement miweb = driver.findElementByXPath("//a[text()='Mi']");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(miweb);
		Thread.sleep(3000);
		builder.click().perform();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Mi Mobile"))
		{
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		List<WebElement> mobilename = driver.findElementsByXPath("//div[@class='_3wU53n']");
		System.out.println(mobilename.size());
		for(WebElement Mobilelist:mobilename )
		{
			System.out.println(Mobilelist.getText());
		}
		
	}

}
