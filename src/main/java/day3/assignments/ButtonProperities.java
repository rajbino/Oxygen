package day3.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonProperities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assignments01
		
		//Interact with four activities in button page
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		WebElement cli = driver.findElementByXPath("//button[@id='home']");
		cli.click();
		driver.get("http://leafground.com/pages/Button.html");
		WebElement pos = driver.findElementByXPath("//button[text()='Get Position']");
		System.out.println(pos.getLocation());
		WebElement col = driver.findElementByXPath("//button[text()='What color am I?']");
		System.out.println(col.getCssValue("background-color"));
		WebElement siz = driver.findElementByXPath("//button[text()='What is my size?']");
		System.out.println(siz.getSize());
		
		
		
		
		
		
		

	}

}
