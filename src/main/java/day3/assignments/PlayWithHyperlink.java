package day3.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithHyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		WebElement hom = driver.findElementByLinkText("Go to Home Page");
		hom.click();
		driver.get("http://leafground.com/pages/Link.html");
		WebElement getlin = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		System.out.println(getlin.getAttribute("href"));
		//Verify am i broken? missing
		
		
		WebElement homesame = driver.findElementByXPath("(//a[@link='blue'])[3]");
		homesame.click();
		
		
		
		
		

	}

}
